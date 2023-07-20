package dos;

public class Animal{

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    //Clase anidada
    public class Coordenada implements Elemento{

        private Double x;
        private Double y;
        private Double z;

        public Coordenada(Double x, Double y, Double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public Double getX() {
            return x;
        }

        public void setX(Double x) {
            this.x = x;
        }

        public Double getY() {
            return y;
        }

        public void setY(Double y) {
            this.y = y;
        }

        public Double getZ() {
            return z;
        }

        public void setZ(Double z) {
            this.z = z;
        }

        @Override
        public void mostrarCoornedadas() {
            System.out.println("El " + getEspecie() + " tiene esta coordenada x-> " + getX() + " y-> " + getY() + " z-> " + getZ());
        }
    }


}
