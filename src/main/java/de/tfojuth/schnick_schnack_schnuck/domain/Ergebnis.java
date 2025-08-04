package de.tfojuth.schnick_schnack_schnuck.domain;

import java.util.Optional;

public final class Ergebnis {

    private final Spieler spielerA;
    private final Spieler spielerB;
    private final Symbol symbolSpielerA;
    private final Symbol symbolSpielerB;

    public Ergebnis(final Spieler spielerA,
                    final Symbol symbolSpielerA,
                    final Spieler spielerB,
                    final Symbol symbolSpielerB) {
        this.spielerA = spielerA;
        this.symbolSpielerA = symbolSpielerA;
        this.spielerB = spielerB;
        this.symbolSpielerB = symbolSpielerB;
    }

    public boolean gewonnenVonSpielerA() {
        return symbolSpielerA.gewinntGegen(symbolSpielerB);
    }

    public boolean gewonnenVonSpielerB() {
        return symbolSpielerB.gewinntGegen(symbolSpielerA);
    }

    public Optional<Spieler> gewinner() {
        if (gewonnenVonSpielerA()) {
            return Optional.of(spielerA);
        }
        if (gewonnenVonSpielerB()) {
            return Optional.of(spielerB);
        }
        return Optional.empty();
    }

    public Spieler spielerA() {
        return spielerA;
    }

    public Spieler spielerB() {
        return spielerB;
    }
}
