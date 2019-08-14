public class Golpeador extends Jugador {

    private Double punteria;
    private Double fuerza;
    private Boolean poseeLaQuaffle=false;

    public Golpeador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Double punteria, Double fuerza, Boolean poseeLaQuaffle) {
        super(equipo, skill, peso, escoba, nivelDeReflejos, poseeLaQuaffle);
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
    public Boolean puedeBloquear(Cazador cazador) {
        return this.esGroso();
    }

    public void golpearJugadorConBludger(Jugador unjugador) {
        unjugador.skill-=2;
        this.escoba.recibeUnGolpe();
    }
}

