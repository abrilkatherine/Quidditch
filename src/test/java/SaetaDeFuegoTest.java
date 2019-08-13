import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SaetaDeFuegoTest {

    SaetaDeFuego fully;

    @BeforeEach

    public void setUp() {
        fully = new SaetaDeFuego ("Luxe");

    }

    @Test

    public void velocidadEscoba() {
    assertNotEquals (130.00, fully.velocidadEscoba());    }

}