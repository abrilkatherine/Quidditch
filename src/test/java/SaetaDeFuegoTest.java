import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SaetaDeFuegoTest {

    SaetaDeFuego saetita;

    @BeforeEach
    public void setUp() {  saetita = new SaetaDeFuego("versionChic");    }

    @Test
    public void velocidadEscoba() {
        assertEquals(100.0, saetita.velocidadEscoba().doubleValue());
    }
}
