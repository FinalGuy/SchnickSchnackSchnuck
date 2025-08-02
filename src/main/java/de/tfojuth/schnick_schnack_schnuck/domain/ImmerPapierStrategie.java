package de.tfojuth.schnick_schnack_schnuck.domain;

public class ImmerPapierStrategie implements Strategie {

    @Override
    public Symbol naechstesSymbol() {
        return new Papier();
    }
}
