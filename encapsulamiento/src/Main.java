public class Main {

    public static void main(String[] args)
    {
        Person personObject = new Person("Darwing", 29, 'M');

        // Una vez creado el objeto Person, podemos modificar los atributos públicos
        // y protegidos que posea, incluyendo los que inicializamos en el constructor
        personObject.lastname = "Hernandez";
        personObject.isSingle = true;

        // El método sayMyName() es público entonces puede ser accedido sin problemas
        personObject.sayMyName();

        // Si Ud descomenta la siguiente línea e intenta ejecutar el programa, le arrojará un error
        // porque el método canIMarry() es privado
        // personObject.canIMarry();

        // El método sayIfIAmSingle() se puede invocar aca porque está protegido y la clase Main
        // pertenece al mismo paquete que la clase Person
        System.out.println("Estoy yo soltero? Respuesta = " + personObject.sayIfIAmSingle());

        // Dado que el atributo CURP es privado en la clase Person, para poder asignarle un valor
        // es necesario usar un método setter que esta definido en Person
        personObject.setCURP("ABCD19000101ABCD01");

        // Igualmente para obtener el valor del CURP por ser privado es necesario usar un método
        // getter que esta definido en Person
        System.out.println("Mi CURP es: " + personObject.getCURP());
    }
}
