package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import de.tfojuth.schnick_schnack_schnuck.domain.Endergebnis;
import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spiel;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ZufaelligeStrategie;

public class ConsoleStarter {

    public static void main(String[] args) {
        Endergebnis endergebnis = new Spiel(new Spieler("John Doe", new ImmerPapierStrategie()), new Spieler("Jane Doe", new ZufaelligeStrategie()), Rundenanzahl.STANDARD).starten();
        System.out.println(endergebnis);
    }

}
