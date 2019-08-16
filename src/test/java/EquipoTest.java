import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

public class EquipoTest {

    private Equipo equipo1;
    private Equipo equipo2;
    private List<Jugador> jugadores;
    private Jugador jugadorNumero1;
    private Jugador jugadorNumero2;

    @BeforeEach
    void setUp(){
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        jugadores = new ArrayList<>();
        jugadorNumero1 = mock(Jugador.class);
        jugadorNumero2 = mock(Jugador.class);

        jugadores.add(jugadorNumero1);
        jugadores.add(jugadorNumero2);
        equipo1.setJugadores(jugadores);
    }

    @Test
    when(jugadorNumero1.esJugadorEstrellaContra((equipo2))).thenReturn(true);
    assertTrue(equipo1.tieneUnJugadorEstrella(equipo2));
}
