import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.assertFalse;

public class SaetaDeFuegoTest {

    SaetaDeFuego fully;

    @BeforeEach

    public void setUp() {
        fully = new SaetaDeFuego();

    }

    @Test

    public Double velocidadEscoba() {
    assertFalse (130.00, fully.velocidadEscoba());    }

}