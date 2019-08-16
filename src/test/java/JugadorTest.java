import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class JugadorTest {

    private Jugador jugador;
    private Equipo equipo;
    private Nimbus nimbus;
    private List<Jugador> jugadores;
    private Buscador buscador;
    private Cazador cazador;
    private Cazador cazador1;
    private SaetaDeFuego saetita;
    private Guardian guardian;

    @BeforeEach
    public void setUp() {

        equipo = mock(Equipo.class);
        jugadores = new ArrayList<>();
        nimbus = mock(Nimbus.class);
        saetita = new SaetaDeFuego("A fuego lento 3000");
        guardian = new Guardian(equipo, 20.0, 30.0, saetita, 45.0, 25.0, null);
        buscador = new Buscador(equipo, 60.0, 40.0, nimbus, 30, 35.0, null);
        cazador = new Cazador(equipo, 15.0, 80.0, nimbus, 35.0, 25, 35, null);
        cazador1= new Cazador (equipo, 50.0, 120.0, nimbus, 75.0, 75, 80, null);

    }

    @Test
    void esGroso() {

        when(buscador.habilidadJugador()).thenReturn(6.0);
        when(equipo.promedioEquipo()).thenReturn(10.0);
        when(nimbus.velocidadEscoba()).thenReturn(10.0);
        when(nimbus.getVelocidadPorDefecto()).thenReturn(5);
        assertTrue(buscador.esGroso());

    }

    @Test
    void cazadorNoLePasaElTrapoABuscador() {
        assertFalse(cazador.lePasaElTrapoA(buscador));
    }
    @Test
    void cazadorLePasaElTrapoABuscador() {
        assertTrue(cazador1.lePasaElTrapoA(buscador));

    }
}

