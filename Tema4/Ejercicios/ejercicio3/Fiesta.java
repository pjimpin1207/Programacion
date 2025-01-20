
package tema4.ejercicio3;

public class Fiesta {

    public static void main(String[] args) {
        Persona pepe = new Persona();
        Persona paco =new Persona();
        Persona juan = new Persona("Juan", 18, 1.80);
        
        
        
        System.out.println(pepe);
        pepe.nombre = "Pepe";
        pepe.edad =  20;
        pepe.estatura = 1.84;
        pepe.crecer(0);
        pepe.cumplirAnyo();
        pepe.saludar();
    }
    
}