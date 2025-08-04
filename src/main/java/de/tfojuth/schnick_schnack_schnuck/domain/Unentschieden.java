package de.tfojuth.schnick_schnack_schnuck.domain;

public record Unentschieden(Spieler spielerA, Spieler spielerB, Rundenanzahl gespielteRunden) implements Endergebnis {

    @Override
    public void erzeugeAusgabe(final VorlageSieg vorlageSieg, final VorlageUnentschieden vorlageUnentschieden) {
        vorlageUnentschieden.kontrahenten(spielerA, spielerB);
        vorlageUnentschieden.anzahlSpiele(gespielteRunden);
        vorlageUnentschieden.erzeugeAusgabe();
    }

}
