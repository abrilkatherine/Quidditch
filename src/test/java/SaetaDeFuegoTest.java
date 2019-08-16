import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;

public class SaetaDeFuegoTest {

    SaetaDeFuego saetita;

    @BeforeEach
    public void setUp() {        saetita = new SaetaDeFuego("versionChic");    }

    @Test
    public void velocidadEscoba() {
        assertNotEquals(100.0, saetita.velocidadEscoba());
    }
}
