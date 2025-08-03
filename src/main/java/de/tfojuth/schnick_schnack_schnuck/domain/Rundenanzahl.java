package de.tfojuth.schnick_schnack_schnuck.domain;

public record Rundenanzahl(long anzahl) {

    public static final Rundenanzahl STANDARD = new Rundenanzahl(100);

    public Rundenanzahl {
        if (anzahl < 0) {
            throw new IllegalArgumentException("Rundenanzahl darf nicht negativ sein");
        }
    }

    @Override
    public String toString() {
        return Long.toString(anzahl);
    }
}
