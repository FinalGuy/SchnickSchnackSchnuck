package de.tfojuth.schnick_schnack_schnuck.domain;

import java.util.Optional;

public final class Partie {

    final Spieler spielerA, spielerB;

    public Partie(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    /**
     * Lässt beide Spieler gegeneinander antreten.
     *
     * @return Entweder
     * <ul>
     *     <li>ein {@code Optional} gefüllt mit dem Gewinner der Runde</li>
     *     <li>oder ein leeres {@code Optional} im Falle eines Unentschiedens.</li>
     * </ul>
     */
    public Optional<Spieler> spielen() {
        final var symbolSpielerA = spielerA.weahleSymbol();
        final var symbolSpielerB = spielerB.weahleSymbol();
        if (symbolSpielerA.gewinntGegen(symbolSpielerB)) {
            return Optional.of(spielerA);
        }
        if (symbolSpielerB.gewinntGegen(symbolSpielerA)) {
            return Optional.of(spielerB);
        }
        return Optional.empty();
    }

}
