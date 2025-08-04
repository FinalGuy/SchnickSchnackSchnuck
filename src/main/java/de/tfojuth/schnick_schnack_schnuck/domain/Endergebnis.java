package de.tfojuth.schnick_schnack_schnuck.domain;

public sealed interface Endergebnis permits Sieg, Unentschieden {

    Rundenanzahl gespielteRunden();

    void erzeugeAusgabe(VorlageSieg vorlageSieg, VorlageUnentschieden vorlageUnentschieden);


    interface VorlageSieg {

        void gewinner(Spieler gewinner);

        void anzahlSiege(Rundenanzahl siege);

        void anzahlSpiele(Rundenanzahl spieleInsgesamt);

//        void ergebnisse(Ergebnisse ergebnisse);

        void erzeugeAusgabe();

    }

    interface VorlageUnentschieden {

        void anzahlSpiele(Rundenanzahl spieleInsgesamt);

//        void ergebnisse(Ergebnisse ergebnisse);

        void erzeugeAusgabe();

    }

}
