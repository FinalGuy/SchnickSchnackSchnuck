package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import com.github.lalyos.jfiglet.FigletFont;
import de.tfojuth.schnick_schnack_schnuck.domain.Endergebnis;
import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;

import java.io.IOException;

public final class KonsolenausgabeUnentschieden implements Endergebnis.VorlageUnentschieden {

    private Spieler spielerA;
    private Spieler spielerB;
    private Rundenanzahl spieleInsgesamt;

    private static String erzeugeAsciiArt() {
        try {
            return FigletFont.convertOneLine("Unentschieden!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void kontrahenten(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    @Override
    public void anzahlSpiele(final Rundenanzahl spieleInsgesamt) {
        this.spieleInsgesamt = spieleInsgesamt;
    }

    @Override
    public void erzeugeAusgabe() {
        final var output = new StringBuffer();
        output.append(String.format("Es spielt %s gegen %s\n", spielerA, spielerB));
        output.append(erzeugeAsciiArt());
        output.append(String.format("\tnach %d Spielen", spieleInsgesamt.anzahl()));
        System.out.println(output);
    }
}
