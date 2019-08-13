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
<<<<<<< HEAD
    public void golpearJugadorConBludger(Jugador unjugador) {
        unjugador.skill-=2;
        this.escoba.recibeUnGolpe();
            }
=======

    @Override
    public void golpearJugadorConBludger(Jugador unjugador) {
        unjugador.skill-=2;
        this.escoba.recibeUnGolpe();
    }
>>>>>>> 6d4e44bc70be5d336d9fd856d020732e4b943b8f
}

