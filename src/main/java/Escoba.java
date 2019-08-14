public abstract class Escoba {

    private Integer velocidadPorDefecto= 0;
    private Integer valorArbitrario;
    private String modelo;
    private Double saludEscoba;

    public Escoba(String modelo){
        this.modelo=modelo;
    }

    public Integer getValorArbitrario() {
        return valorArbitrario;
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
