package de.tfojuth.schnick_schnack_schnuck.domain;

import java.util.ArrayList;
import java.util.List;

public class Ergebnisse {

    private final List<Spieler> gewonneneRundenProSpieler = new ArrayList<>();
    private final Spieler spielerA;
    private final Spieler spielerB;

    public Ergebnisse(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    public void notiereGewinner(final Spieler gewinner) {
        gewonneneRundenProSpieler.add(gewinner);
    }

    public Endergebnis berechneEndergebnis(Rundenanzahl rundenanzahl) {
        long gewonneneSpieleSpielerA = gewonneneRundenProSpieler.stream().filter(spieler -> spieler.equals(spielerA)).count();
        long gewonneneSpieleSpielerB = gewonneneRundenProSpieler.stream().filter(spieler -> spieler.equals(spielerB)).count();

        if (gewonneneSpieleSpielerA > gewonneneSpieleSpielerB) {
            return new Sieg(rundenanzahl, spielerA, new Rundenanzahl(gewonneneSpieleSpielerA));
        }
        if (gewonneneSpieleSpielerA < gewonneneSpieleSpielerB) {
            return new Sieg(rundenanzahl, spielerB, new Rundenanzahl(gewonneneSpieleSpielerB));
        }
        return new Unentschieden(rundenanzahl);
    }

}
