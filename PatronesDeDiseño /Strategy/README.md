# Strategy

### Strategy es un patrón de diseño de comportamiento que te permite definir una logica, colocar cada uno de ellos en una clase separada y hacer sus objetos intercambiables.

## Que es un patron de comportamiento 
### Estos patrones estandarizan y organizan el diseño de software, facilitando la comunicación entre los desarrolladores y permitiendo la reutilización de soluciones probadas en diferentes contextos.


## Pros

* Puedes intercambiar la logica usados dentro de un objeto mientras se ejecuta 
* Puedes aislar los detalles de implementacion de una logica del codigo que lo utiliza 
* Puedes introducir nuevas estrategias sin tener que cambiar de contexto
* Puedes sustituir la herencia por composición.

## Herencia vs Composicion

| Herencia   | Composicion |
| ------------- |-------------|
| En la herencia una clase puede heredar atributos y métodos de otra clase | En la composición una clase contiene instancias de otras clases como parte de su estructura interna |
| La herencia sigue el principio "es un/a", lo que significa que la subclase es una versión específica o especialización de la superclase|La composición sigue el principio "tiene un/a", lo que significa que la clase compuesta tiene componentes que son instancias de otras clases|
|Permite la reutilización de código ya que la subclase puede aprovechar los miembros (atributos y métodos) de la superclase sin necesidad de volver a escribirlos|Permite construir objetos complejos al combinar diferentes clases y sus funcionalidades|

## Composicion con el Strategy 
### La composición en el patrón Strategy ofrece más flexibilidad, evita la sobrecarga de la jerarquía de clases, facilita la reutilización de código y promueve principios de diseño sólidos, en comparación con la herencia.
### La composición permite una mayor flexibilidad y modularidad al encapsular comportamientos en objetos separados. Cada objeto puede tener su propia estrategia, que puede ser intercambiada dinámicamente en tiempo de ejecución. Esto promueve un diseño más flexible, extensible y fácil de mantener en comparación con la herencia.