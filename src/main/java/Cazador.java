public class Cazador extends Jugador{

    private Integer punteria;
    private Integer fuerza;


    public void SetFuerza(Integer fuerza) {
        this.fuerza= fuerza;
    }

    public void SetPunteria(Integer punteria) {
        this.punteria = punteria;
    }

    public Cazador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos,Integer punteria, Integer fuerza, Boolean poseeLaQuaffle){
        super(equipo, peso, skill, escoba, nivelDeReflejos, poseeLaQuaffle);
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

    @Override
    public Boolean tieneLaQuaffle() {
        return poseeLaQuaffle;
    }

    /**4.PUNTO 3. el cazador pierde la Quaffle**/
    @Override
    public void juega(){
         this.poseeLaQuaffle=false;
    }

    public Boolean puedeBloquear(Cazador cazador) {
        return this.lePasaElTrapoA(cazador);
    }

    @Override
    public void golpearJugadorConBludger(Jugador unjugador) {
        unjugador.skill-=2;
        this.escoba.recibeUnGolpe();
        unjugador.pierdeLaQuaffle();
    }

    public Boolean seBloqueaElTiro(Equipo equipoContrario) {
       return this.tieneLaQuaffle() == true && equipoContrario.getJugadores().stream().anyMatch(jugador -> jugador.puedeBloquear(this));
    }

    public void meteGol(Equipo nuestroEquipo, Equipo equipoContrario){

        if (this.seBloqueaElTiro(equipoContrario)==false){
            nuestroEquipo.puntos+=10;
            this.skill+=5;
        }
    }
}


