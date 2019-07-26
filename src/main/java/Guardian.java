package main.java;

public class Guardian {

    private Integer velocidad;
    private Integer skill;
    private Integer nivelDeReflejos;
    private Integer fuerza;

    public Integer habilidadDeLaCategoria(){
        return velocidad+skill+nivelDeReflejos+fuerza;
    }
}
