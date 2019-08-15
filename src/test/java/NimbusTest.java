import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NimbusTest {

    Nimbus fully;

    @BeforeEach
    public void setUp() {
        fully = new Nimbus ("Luxe");
    }

    @Test
    public void velocidadEscoba() {
        assertNotEquals(130.00, fully.velocidadEscoba());
    }
}
