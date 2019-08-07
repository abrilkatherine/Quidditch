public class Guardian extends Jugador {

    private Double fuerza;

    public Guardian(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Double fuerza) {
        super(equipo, skill, peso, escoba, nivelDeReflejos);
        this.fuerza = fuerza;
    }

    public Double habilidadJugador(){
        return super.habilidadJugador()+nivelDeReflejos+fuerza;
    }

    @Override
    public Boolean esBlancoUtil() {
        return null;
    }
}
