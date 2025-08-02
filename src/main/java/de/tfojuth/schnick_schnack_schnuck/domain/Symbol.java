package de.tfojuth.schnick_schnack_schnuck.domain;

public enum Symbol {

    SCHERE {
        @Override
        public boolean gewinntGegen(Symbol anderesSymbol) {
            return anderesSymbol == PAPIER;
        }
    },

    STEIN {
        @Override
        public boolean gewinntGegen(Symbol anderesSymbol) {
            return anderesSymbol == SCHERE;
        }
    },

    PAPIER {
        @Override
        public boolean gewinntGegen(Symbol anderesSymbol) {
            return anderesSymbol == STEIN;
        }
    };

    String toAsciiArt() {
        return "~ ascii art missing ~";
    }

    public abstract boolean gewinntGegen(Symbol anderesSymbol);
}
