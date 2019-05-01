public class Cuadrado extends Figura {

    // ATRIBUTOS ----------------------------------------------------------------------------------

    public double sideLength;   // Longitud de cada lado del cuadrado

    // FIN ATRIBUTOS ------------------------------------------------------------------------------

    // CONSTRUCTORES ------------------------------------------------------------------------------

    public Cuadrado(double sideLength) {

        // Llamamos al constructor de la clase Figura
        super("Cuadrado", 4);

        // Asignamos el valor de la longitud de cada lado
        this.sideLength = sideLength;
    }

    // FIN CONSTRUCTORES --------------------------------------------------------------------------

    // METODOS ------------------------------------------------------------------------------------

    // Definimos el cuerpo del método abstracto
    @Override
    public void calculateArea() {

        // El área de un cuadrado es A = L*L, donde L es la longitud de cada lado
        this.area = this.sideLength * this.sideLength;
    }

    // FIN METODOS --------------------------------------------------------------------------------
}
