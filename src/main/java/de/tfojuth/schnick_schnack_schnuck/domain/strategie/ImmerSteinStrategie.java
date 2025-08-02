package de.tfojuth.schnick_schnack_schnuck.domain.strategie;

import de.tfojuth.schnick_schnack_schnuck.domain.Symbol;

public final class ImmerSteinStrategie implements Strategie {

    @Override
    public Symbol naechstesSymbol() {
        return Symbol.STEIN;
    }

    @Override
    public String toString() {
        return "immer Stein";
    }
}
