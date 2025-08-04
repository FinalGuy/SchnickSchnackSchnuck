package de.tfojuth.schnick_schnack_schnuck.domain;

// TODO: Gemeinsame Oberklasse für Sieg und Unentschieden einführen, da sie mindestens die Kontrahenten und Gesamtzahl gemeinsam haben
public record Sieg(Spieler spielerA,
                   Spieler spielerB,
                   Rundenanzahl gespielteRunden,
                   Spieler gewinner,
                   Rundenanzahl gewonneneRunden) implements Endergebnis {

    @Override
    public void erzeugeAusgabe(final VorlageSieg vorlageSieg, final VorlageUnentschieden vorlageUnentschieden) {
        vorlageSieg.kontrahenten(spielerA, spielerB);
        vorlageSieg.gewinner(gewinner);
        vorlageSieg.anzahlSiege(gewonneneRunden);
        vorlageSieg.anzahlSpiele(gespielteRunden);
        vorlageSieg.erzeugeAusgabe();
    }
}
