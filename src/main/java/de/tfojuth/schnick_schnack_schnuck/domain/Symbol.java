package de.tfojuth.schnick_schnack_schnuck.domain;

public sealed interface Symbol permits Schere, Stein, Papier {

    default String toAsciiArt() {
        return "~missing~";
    }

}
