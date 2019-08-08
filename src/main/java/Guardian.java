import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Guardian extends Jugador {

    private Double fuerza;
    private Boolean poseeLaQuaffle = false;

    public Guardian(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Double fuerza) {
        super(equipo, skill, peso, escoba, nivelDeReflejos);
        this.fuerza = fuerza;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+nivelDeReflejos+fuerza;
    }

    @Override
    public Boolean esBlancoUtil() {
        return equipo.getJugadores().stream().allMatch(jugador -> jugador.tieneLaQuaffle()==false);
    }

    public Boolean tieneLaQuaffle() {
        return poseeLaQuaffle;
    }

    @Override
    public Boolean puedeBloquar(Cazador cazador) {
        return this.getRandomElement(rango)==3;
    }

    List<Integer> rango= IntStream.range(1, 3).boxed().collect(Collectors.toList());
    public int getRandomElement(List<Integer>list){
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));

    }
}
