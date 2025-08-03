package de.tfojuth.schnick_schnack_schnuck.domain;

public sealed interface Endergebnis permits Sieg, Unentschieden {

    Rundenanzahl gespielteRunden();

}
