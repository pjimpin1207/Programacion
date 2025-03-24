package Ejercicio14;

public class Direccion {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;

    public Direccion(String calle, String ciudad, String provincia, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public boolean validar() {
        return calle != null && ciudad != null && provincia != null && codigoPostal != null && pais != null;
    }

    public void imprimir() {
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal + ", " + pais);
    }
}
