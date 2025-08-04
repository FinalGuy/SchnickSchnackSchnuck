package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spiel;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ZufaelligeStrategie;

public class ConsoleStarter {

    public static void main(String[] args) {
        final var spielerA = new Spieler("Asterix", new ImmerPapierStrategie());
        final var spielerB = new Spieler("Obelix", new ZufaelligeStrategie());
        final var endergebnis = new Spiel(spielerA, spielerB, Rundenanzahl.STANDARD).starten();
        endergebnis.erzeugeAusgabe(new KonsolenausgabeSieg(), new KonsolenausgabeUnentschieden());
    }

}
