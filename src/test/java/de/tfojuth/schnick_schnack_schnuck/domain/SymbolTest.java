package de.tfojuth.schnick_schnack_schnuck.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SymbolTest {

    @ParameterizedTest
    @CsvSource(
            delimiterString = "->",
            value = {"SCHERE->PAPIER", "PAPIER->STEIN", "STEIN->SCHERE"})
    void gewinntGegen(Symbol gewinner, Symbol verlierer) {
        // WHEN
        boolean hatGewonnen = gewinner.gewinntGegen(verlierer);
        // THEN
        assertThat(hatGewonnen).isTrue();
    }

}