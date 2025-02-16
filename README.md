El codigo corresponde a la actividad 1, Convenciones y código limpio (clean code) basado en  las convenciones de código "Google Java Style Guide". El programa en Java busca llevar el control del personal de la selección Mexicana de Futbol, un paquete contiene la clase padre y sus tres clases hijas asi como el Main donde se prueba el codigo.
Los principios aplicados en el codigo fueron:

1. Uso de una clase abstracta Persona con los atributos id, nombre, apellido y edad, 
así como los métodos abstractos concentrarse y viajar, los cuales se sobrescriben 
en las clases hijas para evitar duplicidad y fomentar la reutilización de código.

2. Aplicación de la convención UpperCamelCase para los nombres de clases y lowerCamelCase 
para los nombres de métodos y atributos para respetar las prácticas de estilo.

3. Uso de la anotación @Override para indicar correctamente la sobrescritura de métodos de la clase padre.

4. Uso de métodos getter para proporcionar acceso controlado a los atributos privados, promoviendo la encapsulación.

5. Uso de la palabra clave super para llamar al constructor de la clase padre y reutilizar su lógica de inicialización.

6. Organización del código en paquetes para mejorar su estructura y mantenimiento.
