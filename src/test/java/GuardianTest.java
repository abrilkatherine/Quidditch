import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuardianTest {

    private Equipo equipoR = mock(Equipo.class);
    private SaetaDeFuego superSaeta = mock(SaetaDeFuego.class);
    private Guardian dany;

    @BeforeEach

    public void setUp(){
        dany = new Guardian (equipoR, 90.00, 25.0, superSaeta, 4.0, 7.0, false );
            }


    @Test

    public void habilidadJugador(){
        when(superSaeta.velocidadEscoba()).thenReturn(90.0);
        assertEquals(425.0, dany.habilidadJugador().doubleValue());

    }

}
