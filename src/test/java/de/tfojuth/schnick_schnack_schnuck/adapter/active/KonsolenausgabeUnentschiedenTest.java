package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSchereStrategie;
import org.junit.jupiter.api.Test;

class KonsolenausgabeUnentschiedenTest {

    private KonsolenausgabeUnentschieden subject;

    @Test
    void ausgabeAnschauen() {
        // given
        final var ryu = new Spieler("Ryu", new ImmerSchereStrategie());
        final var chunLi = new Spieler("Chun Li", new ImmerSchereStrategie());
        subject = new KonsolenausgabeUnentschieden();
        subject.kontrahenten(ryu, chunLi);
        subject.anzahlSpiele(new Rundenanzahl(100));

        // when
        subject.erzeugeAusgabe();
    }
}