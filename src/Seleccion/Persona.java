package Seleccion;

public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public abstract void concentrarse();

    public abstract void viajar();

    public void getId(){
        System.out.println("ID: " + id);
    }

    public void getNombre(){
        System.out.println("Nombre: " + nombre);
    }

    public void getApellido(){
        System.out.println("Apellido: " + apellido);
    }

    public void getEdad(){
        System.out.println("Edad: " + edad);
    }
}
