package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    private List<Integer> lista = new ArrayList<>();

        public void añadirNumero(int numero) throws NumeroDuplicado {
            if (lista.contains(numero)) {
                throw new NumeroDuplicado("El número " + numero + " ya está en la lista.");
            }
            lista.add(numero);
            System.out.println("Número " + numero + " añadido con éxito.");
        }

        public List<Integer> getLista() {
            return lista;
        }
    }

