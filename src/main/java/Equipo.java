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

    public void agregarJugadores(Jugador jugador) throws NoSePuedenAgregarJugadoresException{
        if(jugadores.size()==7){
            throw new NoSePuedenAgregarJugadoresException("Maximo de jugadores por equipo");
        }
       else {jugadores.add(jugador);}
    }

    /**PUNTO 3. EL equio gana puntos por meter gol**/
}
