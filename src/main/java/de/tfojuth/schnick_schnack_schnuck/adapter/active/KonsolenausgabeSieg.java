package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import com.github.lalyos.jfiglet.FigletFont;
import de.tfojuth.schnick_schnack_schnuck.domain.Endergebnis;
import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;

import java.io.IOException;

public class KonsolenausgabeSieg implements Endergebnis.VorlageSieg {

    private final StringBuffer output = new StringBuffer();

    @Override
    public void kontrahenten(Spieler spielerA, Spieler spielerB) {
        output.append(String.format("Es spielt %s gegen %s \n", spielerA, spielerB));
    }

    @Override
    public void gewinner(Spieler gewinner) {
        try {
            output.append(FigletFont.convertOneLine("Gewinner"));
            output.append(FigletFont.convertOneLine(gewinner.name()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void anzahlSiege(Rundenanzahl siege) {
        output.append(String.format("gewann %d Spiele ", siege.anzahl()));
    }

    @Override
    public void anzahlSpiele(Rundenanzahl spieleInsgesamt) {
        output.append(String.format("von %d Spielen insgesamt", spieleInsgesamt.anzahl()));
    }

    @Override
    public void erzeugeAusgabe() {
        System.out.println(output);
    }
}
