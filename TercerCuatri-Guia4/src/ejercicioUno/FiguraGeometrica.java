package ejercicioUno;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public class Punto{
        private Integer x;
        private Integer y;

        public Punto(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        public String mostrarPuntos(){
           return "Vertice x-> " + getX() + " y vertice y-> " + getY();
        }

    }

}
