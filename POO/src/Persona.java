public class Persona {
    String nombre;
    String apellido;
    int edad;
    
    //al hacer la relacion, ya estoy indicando de que tipo es carrera 
    Carrera carrera;

    //Constructor 
    public Persona(String nombre, String apellido, int edad, String nombreDeCarrera, int duracion, boolean estaEnCurso) {

        carrera = new Carrera();
        // siempre que construyo persona y le paso una carrera, estoy instanciando una carrera

        // El constructor que estoy usando es el por defaut, en caso de yo definir un constructor parametrizado, debo sacar carrera de los paramteros de persona, y poner los paramtros de carrera junto con los parametros de persona 

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tecnologias = tecnologias;
        this.estudiante = estudiante;
        this.carrera.nombre = carrera;
    }

    public String darNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public String enviarSaludo (String saludo){
        if (edad<40) return "buenos dias "+ saludo;
        return "Hola ¿como estas "+ saludo +"?";
    }


}