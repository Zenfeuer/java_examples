public class Main {

    public static void main(String[] args) {

        Cuadrado square = new Cuadrado(5);
        Circulo circle = new Circulo(4);

        square.calculateArea();
        circle.calculateArea();

        System.out.println("El area del cuadrado es: " + square.area);
        System.out.println("El area del circulo es: " + circle.area);

        square.sayMyName();
        circle.sayMyName();
    }
}
