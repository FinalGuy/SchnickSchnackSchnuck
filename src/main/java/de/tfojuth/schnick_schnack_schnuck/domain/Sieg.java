package de.tfojuth.schnick_schnack_schnuck.domain;

public record Sieg(Rundenanzahl gespielteRunden,
                   Spieler gewinner,
                   Rundenanzahl gewonneneRunden) implements Endergebnis {
}
