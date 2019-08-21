public  abstract class Jugador {

    protected Double skill;
    protected Double peso;
    protected Escoba escoba;
    protected Equipo equipo;
    protected Double nivelDeReflejos;
    protected Boolean poseeLaQuaffle;

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Jugador(Equipo equipo, Double skill, Double peso, Escoba escoba, Double nivelDeReflejos, Boolean poseeLaQuaffle) {
        this.equipo = equipo;
        this.skill = skill;
        this.peso = peso;
        this.escoba = escoba;
        this.nivelDeReflejos = nivelDeReflejos;
        this.poseeLaQuaffle= poseeLaQuaffle;

    }
    /**
     * PUNTO 1.a: saber nivel de manejo de escoba de un jugador
     **/
    public Double nivelDeManejoDeEscoba() {
        return skill / peso;
    }

    /**
     * PUNTO 1.b: saber la velocidad de un jugador
     **/
    public Double velocidadDeJugador() {
        return this.escoba.velocidadEscoba() * nivelDeManejoDeEscoba();

    }

    /**
     * PUNTO 1.c saber la habilidad de un jugador
     **/
    public Double habilidadJugador() {
        return this.velocidadDeJugador() + skill;

    }

    /**
     * PUNTO 2.a Saber si un jugador le pasa el trapo a otro
     **/
    public Boolean lePasaElTrapoA(Jugador jugador) {
        return this.habilidadJugador() >= 2 * jugador.habilidadJugador();

    }

    /**
     * 2b Saber si un jugador es groso
     **/
    public Boolean esGroso() {
        return (this.habilidadJugador() > equipo.promedioEquipo()) && velocidadDeJugador() > escoba.getVelocidadPorDefecto();
    }

    /**
     * 2c Saber si un jugador es estrella
     **/

    public Boolean esJugadorEstrellaContra(Equipo equipo) {
        return equipo.getJugadores().stream().allMatch(j -> this.lePasaElTrapoA(j));

    }
    public void pierdeLaQuaffle(){
        this.poseeLaQuaffle=false;
    }

    /** PUNTO 3 El que bloquea gana 10 puntos**/
    public void bloqueoA(Jugador jugador) {
        skill = skill + 10.0;
    }
    /**PUNTO 4.b Saber si un jugador es blnaco util**/
    public abstract Boolean esBlancoUtil();

    public abstract Boolean tieneLaQuaffle();

    /**PUNTO 4a**/

    public abstract Boolean puedeBloquear(Cazador cazador);
    public abstract void golpearJugadorConBludger(Jugador unjugador);
    public abstract void juega();


}