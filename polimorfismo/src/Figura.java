public abstract class Figura {

    public String name;         // Nombre de la figura
    public double area;         // Area de la figura
    public int numberOfSides;   // Numero de lados de la figura si aplica

    public void sayMyName() {

        System.out.println("(Figura) Yo soy un " + this.name);
    }

    public abstract void calculateArea();
}
