package Seleccion;

public class Entrenador extends Persona {
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println("Dirigiendo partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando");
    }

    public void getIdFederacion(){
        System.out.println("ID Federacion: " + idFederacion);
    }
}
