package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import com.github.lalyos.jfiglet.FigletFont;
import de.tfojuth.schnick_schnack_schnuck.domain.Endergebnis;
import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;

import java.io.IOException;

public class KonsolenausgabeUnentschieden implements Endergebnis.VorlageUnentschieden {

    private final StringBuffer output = new StringBuffer();

    public KonsolenausgabeUnentschieden() {
        try {
            this.output.append(FigletFont.convertOneLine("Unentschieden!"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void anzahlSpiele(final Rundenanzahl spieleInsgesamt) {
        output.append(String.format("\tnach %d Spielen", spieleInsgesamt.anzahl()));
    }

    @Override
    public void erzeugeAusgabe() {
        System.out.println(output);
    }
}
