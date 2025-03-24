package EjercicioExamen17;

class EntrenamientoFutbol extends Entrenamiento implements Compite{
    @Override
    public String competir() {
        return "Competir en el futbol";
    }

    @Override
    public void entrenar(){
        System.out.println("Estoy entrenando en el futbol");
    }
}