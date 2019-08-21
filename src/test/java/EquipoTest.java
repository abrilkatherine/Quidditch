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
    private List<Jugador> jugadores;
    private Jugador jugadorNumero1;
    private Jugador jugadorNumero2;
    private Jugador jugadorNumero3;
    private Jugador jugadorNumero4;
    private Jugador jugadorNumero5;
    private Jugador jugadorNumero6;
    private Jugador jugadorNumero7;
    private Jugador jugadorNumero8;
    private Jugador jugadorNumero9;


    @BeforeEach
    void setUp(){
        equipo1 = new Equipo();
        equipo2 = new Equipo();
        jugadorNumero1 = mock(Jugador.class);
        jugadorNumero2 = mock(Jugador.class);
        jugadorNumero3 = mock(Jugador.class);
        jugadorNumero4 = mock(Jugador.class);
        jugadorNumero5 = mock(Jugador.class);
        jugadorNumero6 = mock(Jugador.class);
        jugadorNumero7 = mock(Jugador.class);
        jugadorNumero8 = mock(Jugador.class);
        jugadorNumero9 = mock(Jugador.class);
        equipo1.agregarJugadores(jugadorNumero1);
        equipo2.agregarJugadores(jugadorNumero2);
        equipo2.agregarJugadores(jugadorNumero3);
        equipo2.agregarJugadores(jugadorNumero4);
        equipo2.agregarJugadores(jugadorNumero5);
        equipo2.agregarJugadores(jugadorNumero6);
        equipo2.agregarJugadores(jugadorNumero7);
        equipo2.agregarJugadores(jugadorNumero8);
        equipo2.agregarJugadores(jugadorNumero9);
    }

   @Test
   void jugadorEsJugadorEstrella() {
       when(jugadorNumero1.esJugadorEstrellaContra((equipo2))).thenReturn(true);
       assertTrue(equipo1.tieneUnJugadorEstrella(equipo2));
   }
}
