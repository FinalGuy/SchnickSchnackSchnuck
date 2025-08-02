package de.tfojuth.schnick_schnack_schnuck.domain;

public final class Runde {

    final Spieler spielerA, spielerB;

    public Runde(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    public Spieler spielen() {
        return spielerA;
    }

}
