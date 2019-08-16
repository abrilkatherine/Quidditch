import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class CazadorTest {

    private Nimbus nimbusLoca= mock(Nimbus.class);
    private Equipo equipoJ = mock(Equipo.class);
    private SaetaDeFuego saetaLoca= mock(SaetaDeFuego.class);
    private Equipo equipoR;
    Cazador john;
    Cazador ron;

    @BeforeEach
    public void setUp(){

        john= new Cazador(equipoJ, 80.0, 100.00, nimbusLoca,20.0,10,5, false);
        ron= new Cazador(equipoR,50.0,80.0,saetaLoca,30.0,5,3, true);
    }

    @Test
    void EsGolpeadoPorUnaBludger(){
        john.golpearJugadorConBludger(ron);
        assertFalse(ron.tieneLaQuaffle());
    }



}
