package de.tfojuth.schnick_schnack_schnuck.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatException;


class RundenanzahlTest {

    @Test
    void sollKeineUngültigenWerteZulassen() {
        assertThatException().isThrownBy(() -> new Rundenanzahl(-1));
    }
}