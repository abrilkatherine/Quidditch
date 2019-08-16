public class Snitch implements Pelota {
    private Integer puntos= 150;

    public Integer getPuntos() {
        return puntos;
    }

    @Override
    public Integer puntos() {
        return puntos;
    }
}
