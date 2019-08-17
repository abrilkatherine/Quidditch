import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class GolpeadorTest {
        private Golpeador rocky;
        private Guardian taylor;
        private Equipo lince;
        private SaetaDeFuego saetaDeFuego;

        @BeforeEach
        public void setUp() {
            lince = new Equipo();
            saetaDeFuego = new SaetaDeFuego("SaetaFugaz");
            rocky = new Golpeador(lince, 30.0, 36.0, saetaDeFuego, 35.0, 45.0, 50.0, null);
            taylor = new Guardian(lince, 25.0, 40.0, saetaDeFuego, 30.0, 40.0, null);
        }

        @Test
        public void elGolpeadorGolpeConUnaBludgerAlGuardian() {
            rocky.golpearJugadorConBludger(taylor);
            assertEquals(taylor.skill.doubleValue(), 23.0);

        }

    }


