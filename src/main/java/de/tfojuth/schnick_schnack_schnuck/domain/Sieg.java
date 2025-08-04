package de.tfojuth.schnick_schnack_schnuck.domain;

public record Sieg(Spieler spielerA, Spieler spielerB,
                   Rundenanzahl gespielteRunden,
                   Spieler gewinner,
                   Rundenanzahl gewonneneRunden) implements Endergebnis {

    @Override
    public void erzeugeAusgabe(VorlageSieg vorlageSieg, VorlageUnentschieden vorlageUnentschieden) {
        vorlageSieg.kontrahenten(spielerA, spielerB);
        vorlageSieg.gewinner(gewinner);
        vorlageSieg.anzahlSiege(gewonneneRunden);
        vorlageSieg.anzahlSpiele(gespielteRunden);
        vorlageSieg.erzeugeAusgabe();
    }
}
