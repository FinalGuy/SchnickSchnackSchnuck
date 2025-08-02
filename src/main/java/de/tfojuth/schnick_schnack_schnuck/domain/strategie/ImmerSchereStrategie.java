package de.tfojuth.schnick_schnack_schnuck.domain.strategie;

import de.tfojuth.schnick_schnack_schnuck.domain.Symbol;

public final class ImmerSchereStrategie implements Strategie {

    @Override
    public Symbol naechstesSymbol() {
        return Symbol.SCHERE;
    }

    @Override
    public String toString() {
        return "immer Schere";
    }
}
