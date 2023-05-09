package ejercicioUno;

public class Cuadrado extends FiguraGeometrica implements Figura{

    private Double anchoAlto;

    public Cuadrado(String nombre, Double anchoAlto) {
        super(nombre);
        this.anchoAlto = anchoAlto;
    }

    public Double getAnchoAlto() {
        return anchoAlto;
    }

    public void setAnchoAlto(Double anchoAlto) {
        this.anchoAlto = anchoAlto;
    }

    @Override
    public Double calcularArea() {
        return getAnchoAlto() * 2;
    }

    @Override
    public Double calcularPerimetro() {
        return getAnchoAlto() * 4;
    }
}
