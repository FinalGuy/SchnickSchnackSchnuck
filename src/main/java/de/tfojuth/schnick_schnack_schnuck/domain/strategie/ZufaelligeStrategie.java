package de.tfojuth.schnick_schnack_schnuck.domain.strategie;

import de.tfojuth.schnick_schnack_schnuck.domain.Symbol;

public final class ZufaelligeStrategie implements Strategie {

    @Override
    public Symbol naechstesSymbol() {
        return null;
    }

    @Override
    public String toString() {
        return "zufällige Auswahl";
    }
}
