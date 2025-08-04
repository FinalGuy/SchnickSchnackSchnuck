package de.tfojuth.schnick_schnack_schnuck.domain;

import java.util.ArrayList;
import java.util.List;

public class Ergebnisse {

    private final List<Ergebnis> ergebnisse = new ArrayList<>();

    public void notiereErgebnis(Ergebnis ergebnis) {
        // TODO: Verifizieren, dass die Ergebnisse immer die selben Spieler haben
        ergebnisse.add(ergebnis);
    }

    public Endergebnis berechneEndergebnis() {
        final var gewonneneSpieleSpielerA = ergebnisse.stream().filter(Ergebnis::gewonnenVonSpielerA).count();
        final var gewonneneSpieleSpielerB = ergebnisse.stream().filter(Ergebnis::gewonnenVonSpielerB).count();
        final var rundenanzahl = new Rundenanzahl(ergebnisse.size());

        if (gewonneneSpieleSpielerA > gewonneneSpieleSpielerB) {
            return new Sieg(spielerA(), spielerB(), rundenanzahl, spielerA(), new Rundenanzahl(gewonneneSpieleSpielerA));
        }
        if (gewonneneSpieleSpielerA < gewonneneSpieleSpielerB) {
            return new Sieg(spielerA(), spielerB(), rundenanzahl, spielerB(), new Rundenanzahl(gewonneneSpieleSpielerB));
        }
        return new Unentschieden(spielerA(), spielerB(), rundenanzahl);
    }

    private Spieler spielerA() {
        return ergebnisse.getFirst().spielerA;
    }

    private Spieler spielerB() {
        return ergebnisse.getFirst().spielerB;
    }
}
