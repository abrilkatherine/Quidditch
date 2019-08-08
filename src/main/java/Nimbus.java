import java.util.Calendar;

public class Nimbus extends Escoba {

    private Double salud= 70.00;
    private Integer añoDeFabricacion= 2010;

    public Nimbus(String modelo) {
        super(modelo);
    }

    public Double velocidadEscoba(){
        return (80- (Calendar.getInstance().get(Calendar.YEAR)-añoDeFabricacion))*salud/100;
    }

    public Double getSalud() {
        return salud;
    }

    public void setSalud(Double salud) {
        this.salud = salud;
    }

    public Integer getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(Integer añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
}