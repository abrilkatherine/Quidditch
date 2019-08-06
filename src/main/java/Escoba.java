public abstract class Escoba {

    private Integer valorArbitrario;
    private String modelo;

    public Escoba(String modelo){
        this.modelo=modelo;
    }

    public Integer getValorArbitrario() {
        return valorArbitrario;
    }

    public abstract Double velocidadEscoba();

}
