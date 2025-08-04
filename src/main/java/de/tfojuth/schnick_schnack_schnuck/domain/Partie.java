package de.tfojuth.schnick_schnack_schnuck.domain;

public final class Partie {

    final Spieler spielerA, spielerB;

    public Partie(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    /**
     * Lässt beide Spieler gegeneinander antreten.
     *
     * @return Das @{@link Ergebnis} der Partie.
     *
     */
    public Ergebnis spielen() {
        final var symbolSpielerA = spielerA.weahleSymbol();
        final var symbolSpielerB = spielerB.weahleSymbol();
        return new Ergebnis(spielerA, symbolSpielerA, spielerB, symbolSpielerB);
    }

}
