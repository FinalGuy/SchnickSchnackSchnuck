package de.tfojuth.schnick_schnack_schnuck.domain;

import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSchereStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSteinStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ZufaelligeStrategie;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SpielTest {

    private Spiel subject;

    @Test
    void testeSiegSpielerA() {
        // given
        final var tobi = new Spieler("Tobi", new ImmerSchereStrategie());
        final var bo = new Spieler("Das Bo", new ImmerPapierStrategie());
        final var rundenanzahl = new Rundenanzahl(100);
        subject = new Spiel(tobi, bo, rundenanzahl);

        // when
        final var ergebnis = subject.starten();

        // then
        assertThat(ergebnis).isInstanceOfSatisfying(Sieg.class, sieg -> {
            assertThat(sieg.gewinner()).isEqualTo(tobi);
            assertThat(sieg.gespielteRunden()).isEqualTo(rundenanzahl);
            assertThat(sieg.gewonneneRunden()).isEqualTo(rundenanzahl);
        });
    }

    @Test
    void testeSiegSpielerB() {
        // given
        final var theJoker = new Spieler("The Joker", new ImmerSchereStrategie());
        final var harleyQuinn = new Spieler("Harley Quinn", new ImmerSteinStrategie());
        final var rundenanzahl = new Rundenanzahl(100);
        subject = new Spiel(theJoker, harleyQuinn, rundenanzahl);

        // when
        final var ergebnis = subject.starten();

        // then
        System.out.println(ergebnis);
        assertThat(ergebnis).isInstanceOfSatisfying(Sieg.class, sieg -> {
            assertThat(sieg.gewinner()).isEqualTo(harleyQuinn);
            assertThat(sieg.gespielteRunden()).isEqualTo(rundenanzahl);
            assertThat(sieg.gewonneneRunden()).isEqualTo(rundenanzahl);
        });
    }

    @Test
    void testeUnentschieden() {
        // given
        final var ernie = new Spieler("Ernie", new ImmerSchereStrategie());
        final var bert = new Spieler("Bert", new ImmerSchereStrategie());
        final var rundenanzahl = new Rundenanzahl(23);
        subject = new Spiel(ernie, bert, rundenanzahl);

        // when
        final var ergebnis = subject.starten();

        // then
        System.out.println(ergebnis);
        assertThat(ergebnis).isInstanceOfSatisfying(Unentschieden.class, unentschieden -> {
            assertThat(unentschieden.gespielteRunden()).isEqualTo(rundenanzahl);
        });
    }

    @Test
    void testeZufall() {
        // given
        final var theWitcher = new Spieler("Gerald von Riva", new ZufaelligeStrategie());
        final var theBard = new Spieler("Rittersporn", new ZufaelligeStrategie());
        final var rundenanzahl = new Rundenanzahl(42);
        subject = new Spiel(theWitcher, theBard, rundenanzahl);

        // when
        final var ergebnis = subject.starten();

        // then
        System.out.println(ergebnis);
        assertThat(ergebnis.gespielteRunden()).isEqualTo(rundenanzahl);
    }
}