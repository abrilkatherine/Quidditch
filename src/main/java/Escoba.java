public abstract class Escoba {

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

}
