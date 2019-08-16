public abstract class Escoba {

    private Integer velocidadPorDefecto= 0;
    private String modelo;
    private Double saludEscoba;

    public Escoba(String modelo){
        this.modelo=modelo;
    }

    public abstract Double velocidadEscoba();
    public abstract void recibeUnGolpe();

    public Integer getVelocidadPorDefecto() {
        return velocidadPorDefecto;
    }

    public void setVelocidadPorDefecto(Integer velocidadPorDefecto) {
        this.velocidadPorDefecto = velocidadPorDefecto;
    }

}
