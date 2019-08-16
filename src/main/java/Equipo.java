import java.util.ArrayList;
import java.util.List;

public class Equipo{

    private List<Jugador> jugadores= new ArrayList<>();
    Integer puntos = 0;

    public Double promedioEquipo(){
        return getJugadores().stream().mapToDouble(jugador -> jugador.habilidadJugador()).sum()/(getJugadores().size());
    }

    public Boolean tieneUnJugadorEstrella (Equipo equipo){
        return this.jugadores.stream().anyMatch(jugador -> jugador.esJugadorEstrellaContra(equipo));
    }
    public List<Jugador>getJugadores(){
        return jugadores;
    }

    public void SetJugadores(List<Jugador> jugadores) {
    }

    /**PUNTO 3. EL equio gana puntos por meter gol**/



}
