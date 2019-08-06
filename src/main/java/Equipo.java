import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Equipo{

    private List<Jugador> jugadores= new ArrayList<>();

    public Double promedioEquipo(){
        return getJugadores().stream().mapToDouble(jugador -> jugador.habilidadJugador()).sum()/(getJugadores().size());
    }

    public Boolean tieneUnJugadorEstrella (Equipo equipo){
        return this.jugadores.stream().anyMatch(jugador -> jugador.esJugadorEstrellaContra(equipo));
    }
    public List<Jugador>getJugadores(){
        return jugadores;
    }

    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    //private List<Integer> rangoDeJugador = IntStream.range(1, 3).boxed().collect(Collectors.toList());
}
