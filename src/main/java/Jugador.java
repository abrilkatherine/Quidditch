package main.java;

public class Jugador {

    private Integer skill;
    private Double peso;
    private Escoba escoba;
    private Categoria categoria;
    private Equipo equipo;

    /**
     * PUNTO 1.a: saber nivel de manejo de escoba de un jugador
     **/
    public Double nivelDeManejoDeEscoba() {
        return getSkill() / getPeso();

    }

    /**
     * PUNTO 1.b: saber la velocidad de un jugador
     **/
    public Double velocidadDeJugador() {
        return this.getEscoba().velocidadEscoba() * nivelDeManejoDeEscoba();

    }

    /**
     * PUNTO 1.c saber la habilidad de un jugador
     * **/
    public Integer habilidadJugador() {
        return this.getCategoria().habilidadDeLaCategoria();

    }

    public Integer getSkill() {
        return skill;
    }

    public void setSkill(Integer skill) {
        this.skill = skill;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Escoba getEscoba() {
        return escoba;
    }

    public void setEscoba(Escoba escoba) {
        this.escoba = escoba;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}