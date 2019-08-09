import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Buscador extends Jugador {

    private Double cantidadDeKilometrosRecorridos;
    private Integer nivelDeVision;
    private Boolean poseeLaQuafle;
    private Double turnos=0.0;

    public Buscador (Equipo equipo, Double peso, Double skill, Escoba escoba, Integer nivelDeVision, Double nivelDeReflejos){
        super(equipo, peso, skill, escoba, nivelDeReflejos);
        this.nivelDeVision= nivelDeVision;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+nivelDeVision;
    }

    @Override
    public Boolean esBlancoUtil() {
        return  null;
    }

    @Override
    public Boolean tieneLaQuaffle() {
        return poseeLaQuafle;
    }

    @Override
    public Boolean puedeBloquear(Cazador cazador) {
        return false;
    }

    public Boolean encontroLaSnitch(){
        return getRandomElement(rango) < this.habilidadJugador()+turnos;
    }

    public Boolean atrapoLaSnitch(){
        return encontroLaSnitch()==true && this.velocidadDeJugador()/1.6+turnos>=5000;
    }
/* Numero random para el metodo encontroLaSnitch*/
    List<Integer> rango= IntStream.range(1, 1000).boxed().collect(Collectors.toList());
    public int getRandomElement(List<Integer>list){
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));

    }
    public void golpearJugadorConBludger(Jugador unjugador) {
        unjugador.skill-=2;
        this.escoba.recibeUnGolpe();
        this.encontroLaSnitch();    }
}
