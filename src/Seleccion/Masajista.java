package Seleccion;

public class Masajista extends Persona{
    private String profesion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String profesion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje() {
        System.out.println("Dando masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrandose en el masaje");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando");
    }

    public void getProfesion(){
        System.out.println("Profesion: " + profesion);
    }

    public void getAñosExperiencia(){
        System.out.println("Años de experiencia: " + añosExperiencia);
    }
}
