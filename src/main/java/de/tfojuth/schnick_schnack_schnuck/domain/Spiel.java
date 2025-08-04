package de.tfojuth.schnick_schnack_schnuck.domain;

public final class Spiel {

    final Spieler spielerA, spielerB;
    final Rundenanzahl rundenanzahl;

    public Spiel(final Spieler spielerA, final Spieler spielerB, final Rundenanzahl rundenanzahl) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
        this.rundenanzahl = rundenanzahl;
    }

    public Endergebnis starten() {
        final var ergebnisse = new Ergebnisse();
        final var partie = new Partie(spielerA, spielerB);
        for (int i = 0; i < rundenanzahl.anzahl(); i++) {
            ergebnisse.notiereErgebnis(partie.spielen());
        }
        return ergebnisse.berechneEndergebnis();
    }
}
