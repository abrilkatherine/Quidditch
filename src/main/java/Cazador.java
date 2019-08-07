public class Cazador extends Jugador{

    private Integer punteria;
    private Integer fuerza;

    public void SetFuerza(Integer fuerza) {
        this. fuerza= fuerza;
    }

    public void SetPunteria(Integer punteria) {
        this.punteria = punteria;
    }

    public Cazador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos,Integer punteria, Integer fuerza){
        super(equipo, peso, skill, escoba, nivelDeReflejos);
        this.punteria=punteria;
        this.fuerza=fuerza;
    }

    public Double habilidadJugador(){
        return super. habilidadJugador()+fuerza+punteria;
    }

    /**PUNTO 4.a bloqueos**/
    public Boolean puedeBloquearA(Jugador jugador){
        return equipo.getJugadores().stream().anyMatch(j->j.lePasaElTrapoA(this));
    }

    /** PUNTO 3.c El cazador gana 5 puntos**/
    public void meteGol(){
        skill=skill+5;
    }
    /**3.d Si el tiro es inerrumpido por un bloqueo, piede 2 puntos de skills**/
    public void esBloqueadoPor(Jugador jugador){
        skill=skill-2;
    }

    /**PUNTO 4.b Saber si un jugador es blanco util**/
    public Boolean esBlancoUtil(){
        return this.tieneLaQuaffle()==true;
    }

    /**4.PUNTO 3. el cazador pierde la Quaffle**/
    public Boolean pierdeLaQuaffle(){
        return this.tieneLaQuaffle()==false;
    }
}
