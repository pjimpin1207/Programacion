package Ejercicio10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarPersona {

        private static final String FILE_NAME = "misteriosa.dat";

        public static void main(String[] args) {
            // Cambia el nombre si quieres otro personaje famoso
            Persona famosa = new Persona("Fali");

            try (ObjectOutputStream oos =
                         new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

                oos.writeObject(famosa);
                System.out.println("Objeto serializado en " + FILE_NAME);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
