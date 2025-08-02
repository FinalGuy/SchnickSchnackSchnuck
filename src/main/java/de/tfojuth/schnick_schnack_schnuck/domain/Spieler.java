package de.tfojuth.schnick_schnack_schnuck.domain;

import de.tfojuth.schnick_schnack_schnuck.domain.strategie.Strategie;

public final class Spieler {

    final String name;
    final Strategie strategie;

    public Spieler(String name, Strategie strategie) {
        this.name = name;
        this.strategie = strategie;
    }

    public Symbol weahleSymbol() {
        return strategie.naechstesSymbol();
    }

    @Override
    public String toString() {
        return String.format("%s (spielt Strategie '%s')", name, strategie);
    }
}
