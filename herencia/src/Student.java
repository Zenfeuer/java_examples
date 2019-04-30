// Para especificar que una clase hereda de otra, es necesario colocar la palabra reservada extends
// y luego la clase a la cual queremos heredar. En este caso, la clase Student hereda de la clase
// Person, es decir, hereda todos los atributos y métodos públicos y protegidos de Person
public class Student extends Person {

    // ATRIBUTOS ----------------------------------------------------------------------------------

    // Se pueden definir nuevos atributos
    public int semester;        // Semestre actual del estudiante
    public String career;       // Nombre de licenciatura
    private String studentID;   // Identificador del estudiante. Es privado

    // FIN ATRIBUTOS ------------------------------------------------------------------------------

    // CONSTRUCTORES ------------------------------------------------------------------------------

    // Se pueden definir nuevos constructores

    public Student() {

    }

    public Student(String name, int age, char sex, int semester, String career) {

        // Para invocar al constructor de la clase padre se usa la palabra reservada super
        // y pasando los parámetros al constructor
        super(name, age, sex);

        // Inicializamos el resto de los atributos que son propios de la clase Student
        this.semester = semester;
        this.career = career;
    }

    // FIN CONSTRUCTORES --------------------------------------------------------------------------

    // METODOS ------------------------------------------------------------------------------------

    public void sayMyStudentID() {

        System.out.println("Mi numero de estudiante es: " + this.studentID);
    }

    public void sayMyCURPAndStudentID() {

        // Dado que el CURP es un atributo en Person, la clase Student de igual manera de be usar
        // un método getter para obtener su valor
        System.out.println("Mi CURP es: " + this.getCURP() + " y mi numero de estudiante es: " + this.studentID);
    }

    // Método getter para obtener el atributo privado studentID
    public String getStudentID() {

        return this.studentID;
    }

    // Método setter para asignar nuevo valor al atributo privado studentID
    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }

    // FIN METODOS --------------------------------------------------------------------------------
}
