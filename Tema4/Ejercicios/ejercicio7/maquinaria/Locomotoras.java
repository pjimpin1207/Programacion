package tema4.ejercicio7.maquinaria;

import tema4.ejercicio7.personal.Mecanicos;

public class Locomotoras {

    private String matricula;
    private int potencia;
    private int antiguedad;
    private Mecanicos mecanicoAsig;

    public Locomotoras(String matricula, int potencia, int antiguedad, Mecanicos mecanicoAsig) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanicoAsig = mecanicoAsig;
    }
}
