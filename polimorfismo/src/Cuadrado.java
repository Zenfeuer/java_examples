public class Cuadrado extends Figura {

    public double sideLength;

    public Cuadrado(double sideLength) {

        this.name = "Cuadrado";
        this.numberOfSides = 4;
        this.sideLength = sideLength;
    }

    @Override
    public void calculateArea() {

        this.area = this.sideLength * this.sideLength;
    }
}
