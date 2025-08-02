package de.tfojuth.schnick_schnack_schnuck.domain.strategie;

import de.tfojuth.schnick_schnack_schnuck.domain.Symbol;

public final class ImmerPapierStrategie implements Strategie {

    @Override
    public Symbol naechstesSymbol() {
        return Symbol.PAPIER;
    }

    @Override
    public String toString() {
        return "immer Papier";
    }
}
