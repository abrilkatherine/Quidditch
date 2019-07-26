package main.java;

public class Buscador implements Categoria {

    private Integer velocidad;
    private Integer skill;
    private Integer nivelDeReflejos;
    private Integer nivelDeVision;

    public Integer habilidadDeLaCategoria(){
        return velocidad+skill+nivelDeReflejos*nivelDeVision;
    }
}
