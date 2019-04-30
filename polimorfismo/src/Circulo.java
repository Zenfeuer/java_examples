public class Circulo extends Figura {

    public double pi = 3.14;
    public double radio;

    public Circulo(double radio) {

        this.name = "Circulo";
        this.radio = radio;
    }

    @Override
    public void calculateArea() {

        this.area = this.pi * this.radio * this.radio;
    }

    @Override
    public void sayMyName() {

        System.out.println("(Circulo) Yo soy un " + this.name + " y mi area es " + this.area);
    }

}
