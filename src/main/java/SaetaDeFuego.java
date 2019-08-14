public class SaetaDeFuego extends Escoba {

private Double saludEscoba=100.0;
private Integer velocidadPorDefecto=0;

    public SaetaDeFuego(String modelo){
        super(modelo);
    }

    //1.b
    public Double velocidadEscoba(){
        return 100.0;
    }

    @Override

    public void recibeUnGolpe(){
        this.saludEscoba+=0;

    }
}
