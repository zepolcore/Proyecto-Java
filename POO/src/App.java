public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona persona1 = new Persona();
        
        System.out.println(persona1.DarNombreCompleto() + "tiene" + persona1.edad + "años y esta recibido de: " + persona1.carrera.nombreDeCarrera);

    }
}
