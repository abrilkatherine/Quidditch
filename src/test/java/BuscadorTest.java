import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuscadorTest {

    private Equipo equipoA = mock(Equipo.class);
    private Nimbus  primeraNimbus= mock(Nimbus.class);
    private Buscador willy;


    @BeforeEach
    public void setUp(){
        willy=new Buscador(equipoA, 70.0, 80.0, primeraNimbus, 10,5.0, false);
    }
    //El valor esperado de la habilidadJugador
    @Test
    public void habilidadJugador(){
        when(primeraNimbus.velocidadEscoba()).thenReturn(90.0);
        assertEquals(158.75, willy.habilidadJugador());

    }

}
