/* Las clases abstractas nos permitirán definir clases que deriven de esta clase
 * con comportamientos diferentes. Las clases abstractas tienen la particularidad
 * que no se pueden instanciar.
 */
public abstract class Figura {

    // ATRIBUTOS ----------------------------------------------------------------------------------

    public String name;         // Nombre de la figura
    public double area;         // Area de la figura
    public int numberOfSides;   // Número de lados de la figura si aplica

    // FIN ATRIBUTOS ------------------------------------------------------------------------------

    // CONSTRUCTORES ------------------------------------------------------------------------------

    /* Las clases abstractas pueden poseer constructores a pesar de que no
     * seran instanciadas, pero estos constructores se pueden utilizar por
     * ejemplo desde las clases derivadas usando super()
     */

    public Figura(String name, int numberOfSides) {

        this.name = name;
        this.numberOfSides = numberOfSides;
    }

    // FIN CONSTRUCTORES --------------------------------------------------------------------------

    // METODOS ------------------------------------------------------------------------------------

    // Método genérico para probar el polimorfismo
    public void sayMyName() {

        System.out.println("(Figura) Yo soy un " + this.name);
    }

    // Método abstracto que debe ser definido en cada clase derivada de la clase Figura
    public abstract void calculateArea();

    // FIN METODOS --------------------------------------------------------------------------------
}
