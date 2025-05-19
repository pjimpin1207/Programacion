package Ejercicio10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializarPersona {
    private static final String FILE_NAME = "misteriosa.dat";
        public static void main(String[] args) {
            try (ObjectInputStream ois =
                         new ObjectInputStream(new FileInputStream(FILE_NAME))) {

                Persona p = (Persona) ois.readObject();
                System.out.println("¡El personaje es: " + p.getNombre() + "!");

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
