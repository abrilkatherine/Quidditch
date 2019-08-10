import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    /**PUNTO 3. EL equio gana puntos por meter gol**/



}
