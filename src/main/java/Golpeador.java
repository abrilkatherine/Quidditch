public class Golpeador extends Jugador {

    private Double punteria;
    private Double fuerza;
    private Boolean poseeLaQuaffle=false;

    public Golpeador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Double punteria, Double fuerza) {
        super(equipo, skill, peso, escoba, nivelDeReflejos);
        this.punteria = punteria;
        this.fuerza = fuerza;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteria + fuerza;
    }

    @Override
    public Boolean esBlancoUtil() {
        return null;
    }

    @Override
    public Boolean tieneLaQuaffle() {
        return poseeLaQuaffle;
    }

    @Override
    public Boolean puedeBloquar(Cazador cazador) {
        return this.esGroso();
    }
}

