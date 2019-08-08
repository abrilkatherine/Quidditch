public class Buscador extends Jugador {

    private Integer cantidadDeKilometrosRecorridos;
    private Integer nivelDeVision;

    public Buscador (Equipo equipo, Double peso, Double skill, Escoba escoba, Integer nivelDeVision, Double nivelDeReflejos){
        super(equipo, peso, skill, escoba, nivelDeReflejos);
        this.nivelDeVision= nivelDeVision;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+nivelDeVision;
    }

    @Override
    public Boolean esBlancoUtil() {
        return null;
    }
}
