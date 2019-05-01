public class Circulo extends Figura {

    // ATRIBUTOS ----------------------------------------------------------------------------------

    public double pi = 3.14;    // Valor constante de pi
    public double radio;        // Radio del círculo

    // FIN ATRIBUTOS ------------------------------------------------------------------------------

    // CONSTRUCTORES ------------------------------------------------------------------------------

    public Circulo(double radio) {

        // Llamamos al constructor de la clase Figura
        super("Circulo", 0);

        // Asignamos el valor del radio
        this.radio = radio;
    }

    // FIN CONSTRUCTORES --------------------------------------------------------------------------

    // METODOS ------------------------------------------------------------------------------------

    // Definimos el cuerpo del metodo abstracto
    @Override
    public void calculateArea() {

        // El area de un circulo es A = pi * r * r donde r es el radio
        this.area = this.pi * this.radio * this.radio;
    }

    // Tambien podemos darle un cuerpo diferente a un metodo heredado sin que este haya sido
    // definido como abstract, conocido como override del metodo
    @Override
    public void sayMyName() {

        System.out.println("(Circulo) Yo soy un " + this.name + " y mi area es " + this.area);
    }

    // FIN METODOS --------------------------------------------------------------------------------
}
