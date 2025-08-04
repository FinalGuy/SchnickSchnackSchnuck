package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import org.junit.jupiter.api.Test;

class KonsolenausgabeSiegTest {

    private KonsolenausgabeSieg subject;

    @Test
    void ausgabeAnschauen() {
        // given
        subject = new KonsolenausgabeSieg();
        subject.gewinner(new Spieler("Werner", new ImmerPapierStrategie()));
        subject.anzahlSiege(new Rundenanzahl(42));
        subject.anzahlSpiele(new Rundenanzahl(100));

        // when
        subject.erzeugeAusgabe();
    }
}