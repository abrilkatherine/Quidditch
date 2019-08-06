public class Golpeador extends Jugador {

    private Double punteria;
    private Double fuerza;

    public Golpeador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Double punteria, Double fuerza) {
        super(equipo, skill, peso, escoba, nivelDeReflejos);
        this.punteria = punteria;
        this.fuerza = fuerza;
    }

    public Double habilidadJugador() {
        return super.habilidadJugador() + punteria + fuerza;
    }
}

