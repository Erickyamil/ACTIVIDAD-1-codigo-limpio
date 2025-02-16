package Seleccion;

public class Futbolista extends Persona{
    private int numeroJugador;
    private String posicion;

    public Futbolista(int id, String nombre, String apellido, int edad, int numeroJugador, String posicion) {
        super(id, nombre, apellido, edad);
        this.numeroJugador = numeroJugador;
        this.posicion = posicion;
    }

    public void jugarPartido() {
        System.out.println("Jugando partido");
    }

    public void entrenar() {
        System.out.println("Entrenando");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrandose en el juego");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando");
    }

    public void getNumeroJugador(){
        System.out.println("Numero de jugador: " + numeroJugador);
    }

    public void getPosicion(){
        System.out.println("Posicion: " + posicion);
    }
}
