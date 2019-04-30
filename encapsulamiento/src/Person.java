public class Person {

    /* Modificadores de acceso:
     *
     * - public: atributos o métodos que sean definidos públicos van a poder accedidos
     *           directamente, es decir, tendremos acceso a ellos desde cualquier otra
     *           clase o instancia sin importar la procedencia.
     *
     * - private: atributos o métodos que sean definidos privados van a poder ser
     *            accedidos únicamente por la misma clase donde se encuentran definidos.
     *
     * - protected: atributos o métodos que sean definidos protegitos van a ser poder
     *              accedidos solamente por las clases que sean del mismo paquete o
     *              clases que herenden de ella.
     */

    // ATRIBUTOS ----------------------------------------------------------------------------------

    public String name;         // Nombre de la persona
    public String lastname;     // Apellido de la persona
    public int age;             // Edad de la persona
    public char sex;            // Sexo de la persona
    private String CURP;        // CURP de la persona. Lo colocamos privado
    protected boolean isSingle; // Variable para determinar si está soltero. Será protegida

    // FIN ATRIBUTOS ------------------------------------------------------------------------------

    // CONSTRUCTORES ------------------------------------------------------------------------------

    /* Se pueden tener la cantidad de constructores que se deseen siempre y cuando no
     * coincidan en los mismos parámetros. Tampoco es necesario inicializar todos los
     * atributos en el constructor. Mínimo se necesita un constructor para instaciar
     * la clase
     */

    public Person() {

    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    // FIN CONSTRUCTORES --------------------------------------------------------------------------

    // METODOS ------------------------------------------------------------------------------------

    // Como es público, podremos invocar este método en otras clases
    public void sayMyName() {

        System.out.println("Mi nombre es: " + this.name);
    }

    // Como es privado, este método sólo puede ser utilizado por la misma clase donde se encuentra
    // definido, en este caso, solo puede ser invocado por otros máétodos de la clase Person
    private boolean canIMarry() {

        return this.isSingle == true;
    }

    // Al ser protegido, este método sólo puede ser invocado por la clase Person, clases que
    // herenden de la clase Person y clases que pertenezcan al mismo paquete
    protected boolean sayIfIAmSingle() {

        // Esto es posible porque el método canIMarry() a pesar de se privado, se está invocando
        // en un método que está definido dentro de la clase Person
        return this.canIMarry();
    }

    // Si queremos acceder al atributo privado CURP, necesitamos definir un método getter que nos
    // permitirá obtener su valor
    public String getCURP() {

        return this.CURP;
    }

    // Si queremos modificar el valor del atributo CURP, necesitamos definir un método setter
    // que nos permitirá asignarle un nuevo valor
    public void setCURP(String CURP) {

        this.CURP = CURP;
    }

    // FIN METODOS --------------------------------------------------------------------------------
}
