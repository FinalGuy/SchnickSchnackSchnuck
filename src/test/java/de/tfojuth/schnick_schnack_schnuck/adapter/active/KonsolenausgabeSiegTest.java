package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSchereStrategie;
import org.junit.jupiter.api.Test;

class KonsolenausgabeSiegTest {

    private KonsolenausgabeSieg subject;

    @Test
    void ausgabeAnschauen() {
        // given
        final var werner = new Spieler("Werner", new ImmerPapierStrategie());
        final var nobelschroeder = new Spieler("Nobelschröder", new ImmerSchereStrategie());
        subject = new KonsolenausgabeSieg();
        subject.kontrahenten(werner, nobelschroeder);
        subject.gewinner(werner);
        subject.anzahlSiege(new Rundenanzahl(42));
        subject.anzahlSpiele(new Rundenanzahl(100));

        // when
        subject.erzeugeAusgabe();
    }
}