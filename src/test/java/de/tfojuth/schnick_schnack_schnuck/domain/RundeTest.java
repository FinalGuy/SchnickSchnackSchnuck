package de.tfojuth.schnick_schnack_schnuck.domain;

import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerPapierStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSchereStrategie;
import de.tfojuth.schnick_schnack_schnuck.domain.strategie.ImmerSteinStrategie;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RundeTest {


    @Nested
    class Schere {

        @Test
        void schereGewinntGegenPapierSpielerA() {
            // given
            final var schere = new Spieler("Alice", new ImmerSchereStrategie());
            final var papier = new Spieler("Bob", new ImmerPapierStrategie());

            // when
            final var gewinner = new Runde(schere, papier).spielen();

            // then
            assertThat(gewinner).isEqualTo(schere);
        }

        @Test
        void schereGewinntGegenPapierSpielerB() {
            // given
            final var papier = new Spieler("Hinz", new ImmerPapierStrategie());
            final var schere = new Spieler("Kunz", new ImmerSchereStrategie());

            // when
            final var gewinner = new Runde(papier, schere).spielen();

            // then
            assertThat(gewinner).isEqualTo(papier);
        }

        @Test
        void schereVerliertGegenSteinSpielerA() {
            // given
            final var schere = new Spieler("Ernie", new ImmerSchereStrategie());
            final var stein = new Spieler("Bert", new ImmerSteinStrategie());

            // when
            final var gewinner = new Runde(schere, stein).spielen();

            // then
            assertThat(gewinner).isEqualTo(stein);
        }

        @Test
        void schereVerliertGegenSteinSpielerB() {
            // given
            final var stein = new Spieler("Batman", new ImmerSteinStrategie());
            final var schere = new Spieler("Robin", new ImmerSchereStrategie());

            // when
            final var gewinner = new Runde(stein, schere).spielen();

            // then
            assertThat(gewinner).isEqualTo(stein);
        }

    }

    @Nested
    class Stein {

        @Test
        void steinGewinntGegenSchereSpielerA() {
            // given
            final var stein = new Spieler("Beaves", new ImmerSteinStrategie());
            final var schere = new Spieler("Butthead", new ImmerSchereStrategie());

            // when
            final var gewinner = new Runde(stein, schere).spielen();

            // then
            assertThat(gewinner).isEqualTo(stein);
        }

        @Test
        void steinGewinntGegenSchereSpielerB() {
            // given
            final var schere = new Spieler("Simon", new ImmerSchereStrategie());
            final var stein = new Spieler("Garfunkel", new ImmerSteinStrategie());

            // when
            final var gewinner = new Runde(schere, stein).spielen();

            // then
            assertThat(gewinner).isEqualTo(stein);
        }

        @Test
        void steinVerliertGegenPapierSpielerA() {
            // given
            final var stein = new Spieler("Pinky", new ImmerSteinStrategie());
            final var papier = new Spieler("Brain", new ImmerPapierStrategie());

            // when
            final var gewinner = new Runde(stein, papier).spielen();

            // then
            assertThat(gewinner).isEqualTo(papier);
        }

        @Test
        void schereVerliertGegenSteinSpielerB() {
            // given
            final var papier = new Spieler("Sherlock Homes", new ImmerPapierStrategie());
            final var stein = new Spieler("Dr. Watson", new ImmerSteinStrategie());

            // when
            final var gewinner = new Runde(papier, stein).spielen();

            // then
            assertThat(gewinner).isEqualTo(papier);
        }

    }

    @Nested
    class Papier {

        @Test
        void papierGewinntGegenSteinSpielerA() {
            // given
            final var papier = new Spieler("Starsky", new ImmerPapierStrategie());
            final var stein = new Spieler("Hutch", new ImmerSteinStrategie());

            // when
            final var gewinner = new Runde(papier, stein).spielen();

            // then
            assertThat(gewinner).isEqualTo(papier);
        }

        @Test
        void papierGewinntGegenSteinSpielerB() {
            // given
            final var stein = new Spieler("Siegfried", new ImmerSteinStrategie());
            final var papier = new Spieler("Roy", new ImmerPapierStrategie());

            // when
            final var gewinner = new Runde(stein, papier).spielen();

            // then
            assertThat(gewinner).isEqualTo(papier);
        }

        @Test
        void papierVerliertGegenSchereSpielerA() {
            // given
            final var papier = new Spieler("Bud Spencer", new ImmerPapierStrategie());
            final var schere = new Spieler("Terrence Hill", new ImmerSchereStrategie());

            // when
            final var gewinner = new Runde(papier, schere).spielen();

            // then
            assertThat(gewinner).isEqualTo(schere);
        }

        @Test
        void papierVerliertGegenSchereSpielerB() {
            // given
            final var schere = new Spieler("Lilo", new ImmerSchereStrategie());
            final var papier = new Spieler("Stitch", new ImmerPapierStrategie());

            // when
            final var gewinner = new Runde(schere, papier).spielen();

            // then
            assertThat(gewinner).isEqualTo(schere);
        }

    }

    @Nested
    class Unentschieden {

        @Test
        void schereGegenSchere() {
            // given
            final var schere = new Spieler("Dr. Jeckyl", new ImmerSchereStrategie());
            final var auchSchere = new Spieler("Mr. Hide", new ImmerSchereStrategie());

            // when
            final var gewinner = new Runde(schere, auchSchere).spielen();

            // then
            assertThat(gewinner).isEqualTo(schere);
        }

        @Test
        void steinGegenStein() {
            // given
            final var stein = new Spieler("Jake B.", new ImmerSteinStrategie());
            final var auchStein = new Spieler("Elwood B.", new ImmerSteinStrategie());

            // when
            final var gewinner = new Runde(stein, auchStein).spielen();

            // then
            assertThat(gewinner).isEqualTo(stein);
        }

        @Test
        void papierGegenPapier() {
            // given
            final var papier = new Spieler("Roadrunner", new ImmerPapierStrategie());
            final var auchPapier = new Spieler("Coyote", new ImmerPapierStrategie());

            // when
            final var gewinner = new Runde(papier, auchPapier).spielen();

            // then
            assertThat(gewinner).isEqualTo(auchPapier);
        }


    }

}