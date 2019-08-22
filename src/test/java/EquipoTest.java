import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EquipoTest {

    private Equipo equipo1;
    private Equipo equipo2;
    private Jugador jugadorNumero1;
    private Jugador jugadorNumero2;



    @BeforeEach
    void setUp(){
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        jugadorNumero1 = mock(Jugador.class);
        jugadorNumero2 = mock(Jugador.class);
        equipo1.agregarJugadores(jugadorNumero1);
        equipo2.agregarJugadores(jugadorNumero2);

    }

   @Test
   void jugadorEsJugadorEstrella() {
       when(jugadorNumero1.esJugadorEstrellaContra((equipo2))).thenReturn(true);
       assertTrue(equipo1.tieneUnJugadorEstrella(equipo2));
   }
}
