public class Main {

    public static void main(String[] args) {

        Student estudiante = new Student("Darwing", 29, 'M', 5, "Computación");

        // Dado que el CURP es privado en la clase padre, la unica manera de poder asignarle un valor
        // es llamando a su correspondiente metodo setter
        estudiante.setCURP("ABCD19000101ABCD01");

        // Dado que el studentID es privado en la clase Student, la unica manera de poder asignarle
        // un valor es llamando a su correspondiente metodo setter
        estudiante.setStudentID("Student00000001");

        estudiante.sayMyCURPAndStudentID();
    }
}
