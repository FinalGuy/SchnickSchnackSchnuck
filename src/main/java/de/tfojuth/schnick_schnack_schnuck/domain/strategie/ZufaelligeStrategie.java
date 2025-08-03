package de.tfojuth.schnick_schnack_schnuck.domain.strategie;

import de.tfojuth.schnick_schnack_schnuck.domain.Symbol;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Diese Implementierung der {@link Strategie} nutzt einen schwachen Zufallsgenerator ({@link ThreadLocalRandom}),
 * um das nächste Symbol zu ermitteln.
 */
public final class ZufaelligeStrategie implements Strategie {

    private static final int ANZAHL_SYMBOLE = Symbol.values().length;

    @Override
    public Symbol naechstesSymbol() {
        return Symbol.values()[ThreadLocalRandom.current().nextInt(ANZAHL_SYMBOLE)];
    }

    @Override
    public String toString() {
        return "zufällige Auswahl";
    }
}
