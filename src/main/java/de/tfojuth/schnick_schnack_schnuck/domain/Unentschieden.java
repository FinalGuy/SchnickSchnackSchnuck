package de.tfojuth.schnick_schnack_schnuck.domain;

public record Unentschieden(Rundenanzahl gespielteRunden) implements Endergebnis {

//    @Override
//    public String asTextReport() {
//        return """
//                ================================================================================
//                =                                                                              =
//                =                        U N E N T S C H I E D E N                             =
//                =                                                                              =
//                ================================================================================
//                """;
//    }
}
