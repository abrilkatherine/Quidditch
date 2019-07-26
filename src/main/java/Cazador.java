package main.java;

public class Cazador {

    private Integer velocidad;
    private Integer skill;
    private Integer punteria;
    private Integer fuerza;

    public Integer habilidadDeLaCategoria(){
        return velocidad+skill+punteria*fuerza;
    }
}
