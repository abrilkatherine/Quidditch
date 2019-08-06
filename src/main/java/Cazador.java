public class Cazador extends Jugador{

    private Integer punteria;
    private Integer fuerza;

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Cazador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos,Integer punteria, Integer fuerza){
        super(equipo, peso, skill, escoba, nivelDeReflejos);
        this.punteria=punteria;
        this.fuerza=fuerza;
    }

    public Double habilidadJugador(){
        return super. habilidadJugador()+fuerza+punteria;
    }
}
