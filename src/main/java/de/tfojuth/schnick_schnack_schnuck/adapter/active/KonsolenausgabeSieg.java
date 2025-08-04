package de.tfojuth.schnick_schnack_schnuck.adapter.active;

import com.github.lalyos.jfiglet.FigletFont;
import de.tfojuth.schnick_schnack_schnuck.domain.Endergebnis;
import de.tfojuth.schnick_schnack_schnuck.domain.Rundenanzahl;
import de.tfojuth.schnick_schnack_schnuck.domain.Spieler;

import java.io.IOException;

public final class KonsolenausgabeSieg implements Endergebnis.VorlageSieg {

    private Spieler spielerA;
    private Spieler spielerB;
    private Spieler gewinner;
    private Rundenanzahl siege;
    private Rundenanzahl spieleInsgesamt;

    @Override
    public void kontrahenten(Spieler spielerA, Spieler spielerB) {
        this.spielerA = spielerA;
        this.spielerB = spielerB;
    }

    @Override
    public void gewinner(Spieler gewinner) {
        this.gewinner = gewinner;
    }

    @Override
    public void anzahlSiege(Rundenanzahl siege) {
        this.siege = siege;
    }

    @Override
    public void anzahlSpiele(Rundenanzahl spieleInsgesamt) {
        this.spieleInsgesamt = spieleInsgesamt;
    }

    @Override
    public void erzeugeAusgabe() {
        final StringBuffer output = new StringBuffer();
        output.append(String.format("Es spielt %s gegen %s \n", spielerA, spielerB));
        try {
            output.append(FigletFont.convertOneLine("Gewinner"));
            output.append(FigletFont.convertOneLine(gewinner.name()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        output.append(String.format("gewann %d Spiele ", siege.anzahl()));
        output.append(String.format("von %d Spielen insgesamt", spieleInsgesamt.anzahl()));
        System.out.println(output);
    }
}
