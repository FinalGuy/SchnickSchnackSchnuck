package de.tfojuth.schnick_schnack_schnuck.domain;

public record Unentschieden(Rundenanzahl gespielteRunden) implements Endergebnis {

    @Override
    public void erzeugeAusgabe(VorlageSieg vorlageSieg, VorlageUnentschieden vorlageUnentschieden) {
        vorlageUnentschieden.anzahlSpiele(gespielteRunden);
        vorlageUnentschieden.erzeugeAusgabe();
    }

}
