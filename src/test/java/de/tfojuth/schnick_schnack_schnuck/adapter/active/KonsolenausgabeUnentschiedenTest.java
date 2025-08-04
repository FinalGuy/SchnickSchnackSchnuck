package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KonsolenausgabeUnentschiedenTest {

    private KonsolenausgabeUnentschieden subject;

    @Test
    void ausgabeAnschauen() {
        // given
        subject = new KonsolenausgabeUnentschieden();
        subject.anzahlSpiele(new Rundenanzahl(100));

        // when
        subject.erzeugeAusgabe();
    }
}