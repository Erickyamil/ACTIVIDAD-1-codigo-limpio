import Seleccion.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Entrenador entrenador = new Entrenador(1, "Juan", "Perez", 45, 123);
        Futbolista futbolista = new Futbolista(2, "Leny", "Blue", 25, 10, "Delantero");
        Masajista masajista = new Masajista(3, "Maria", "Lopez", 30, "Fisioterapeuta", 5);

        futbolista.concentrarse();
        futbolista.jugarPartido();
        futbolista.entrenar();
        futbolista.viajar();

        entrenador.concentrarse();
        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();
        entrenador.viajar();
        
        masajista.concentrarse();
        masajista.darMasaje();
        masajista.viajar();
    }
}

/*
Uso de una clase abstracta Persona con los atributos id, nombre, apellido y edad, 
así como los métodos abstractos concentrarse y viajar, los cuales se sobrescriben 
en las clases hijas para evitar duplicidad y fomentar la reutilización de código.

Aplicación de la convención UpperCamelCase para los nombres de clases y lowerCamelCase 
para los nombres de métodos y atributos para respetar las prácticas de estilo.

Uso de la anotación @Override para indicar correctamente la sobrescritura de métodos de la clase padre.

Uso de métodos getter para proporcionar acceso controlado a los atributos privados, promoviendo la encapsulación.

Uso de la palabra clave super para llamar al constructor de la clase padre y reutilizar su lógica de inicialización.

Organización del código en paquetes para mejorar su estructura y mantenimiento.
*/

