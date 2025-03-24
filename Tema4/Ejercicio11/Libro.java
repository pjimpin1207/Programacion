package Ejercicio11;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private int annoPublicacion;


    public Libro(String titulo, String autor, String isbn, int annoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.annoPublicacion = annoPublicacion;
    }


    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + annoPublicacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Libro libro = (Libro) obj;
        return isbn.equals (anObject: libro.isbn);
    }
}