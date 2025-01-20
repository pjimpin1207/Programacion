package tema4.ejercicio3;

public class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;

    // Constructores
    public Persona(String nombre, String apellido, int edad, double estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    public Persona() {
        this.nombre = "anónimo";
        this.apellido = "desconocido";
        this.edad = 18;
        this.estatura = 1.70;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellido = "desconocido";
        this.edad = 18;
        this.estatura = 1.70;
    }

    // Métodos para acceder y modificar los atributos (getters y setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) { 
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        } else {
            System.out.println("La estatura debe ser positiva.");
        }
    }

    // Métodos adicionales
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellido);
    }

    public void cumplirAnyo() {
        this.edad += 1;
        System.out.println("Ahora tengo " + edad + " años.");
    }

    public void crecer(double incremento) {
        if (incremento > 0) {
            this.estatura += incremento;
            System.out.println("Ahora mido " + estatura + " metros.");
        } else {
            System.out.println("El incremento de estatura debe ser positivo.");
        }
    }
}
