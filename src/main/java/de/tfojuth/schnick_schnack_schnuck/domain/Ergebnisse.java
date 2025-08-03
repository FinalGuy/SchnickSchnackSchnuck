package de.tfojuth.schnick_schnack_schnuck.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ergebnisse {

    private final Map<Spieler, GewonneneRunden> gewonneneRundenProSpieler = new HashMap<>(2);

    public Ergebnisse(Spieler spielerA, Spieler spielerB) {
        gewonneneRundenProSpieler.put(spielerA, new GewonneneRunden());
        gewonneneRundenProSpieler.put(spielerB, new GewonneneRunden());
    }

    public void notiereGewinner(final Spieler gewinner) {
        gewonneneRundenProSpieler.get(gewinner).plus1();
    }

    public Endergebnis berechneEndergebnis(Rundenanzahl rundenanzahl) {
        List<Map.Entry<Spieler, GewonneneRunden>> entries = gewonneneRundenProSpieler.entrySet().stream().toList();
        if (entries.get(0).getValue().punkte > entries.get(1).getValue().punkte) {
            return new Sieg(rundenanzahl, entries.get(0).getKey(), new Rundenanzahl(entries.get(0).getValue().punkte));
        }
        if (entries.get(0).getValue().punkte < entries.get(1).getValue().punkte) {
            return new Sieg(rundenanzahl, entries.get(1).getKey(), new Rundenanzahl(entries.get(1).getValue().punkte));
        }
        return new Unentschieden(rundenanzahl);
    }

    /**
     *
     */
    static final class GewonneneRunden {

        private int punkte = 0;

        public void plus1() {
            this.punkte++;
        }

    }

}
