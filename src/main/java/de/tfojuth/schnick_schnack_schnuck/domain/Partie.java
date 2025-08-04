package de.tfojuth.schnick_schnack_schnuck.domain;

public final class Partie {

    private final Spieler spielerA;
    private final Spieler spielerB;

    public Partie(final Spieler spielerA, final Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    public Ergebnis spielen() {
        final var symbolSpielerA = spielerA.weahleSymbol();
        final var symbolSpielerB = spielerB.weahleSymbol();
        return new Ergebnis(spielerA, symbolSpielerA, spielerB, symbolSpielerB);
    }

}
