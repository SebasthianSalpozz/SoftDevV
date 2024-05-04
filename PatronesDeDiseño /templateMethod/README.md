# Template Method

### Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase pero permite que las subclases sobrescriban pasos de la logica sin cambiar su estructura.

## Que es un patron de comportamiento?
### Estos patrones estandarizan y organizan el diseño de software, facilitando la comunicación entre los desarrolladores y permitiendo la reutilización de soluciones probadas en diferentes contextos.


## Pros
* Puedes permitir que sobrescriban tan solo ciertas partes de un algoritmo grande, para que les afecten menos los cambios que tienen lugar en otras partes del algoritmo
* Puedes colocar el código duplicado dentro de una superclase

## Herencia vs Composicion
| Herencia   | Composicion |
| ------------- |-------------|
| En la herencia una clase puede heredar atributos y métodos de otra clase | En la composición una clase contiene instancias de otras clases como parte de su estructura interna |
| La herencia sigue el principio "es un/a", lo que significa que la subclase es una versión específica o especialización de la superclase|La composición sigue el principio "tiene un/a", lo que significa que la clase compuesta tiene componentes que son instancias de otras clases|
|Permite la reutilización de código ya que la subclase puede aprovechar los miembros (atributos y métodos) de la superclase sin necesidad de volver a escribirlos|Permite construir objetos complejos al combinar diferentes clases y sus funcionalidades|

## Herencia con el Template Method 
### El patrón Template Method utiliza principalmente herencia en lugar de composición debido a su objetivo de permitir la reutilización del código común mientras se permite la personalización de ciertos pasos del algoritmo.
### Si bien la composición también podría ser utilizada para implementar el patrón Template Method, generalmente se reserva para escenarios donde la relación "tiene-un" es más apropiada que la relación "es-un", o cuando se desea una mayor flexibilidad y modularidad en el diseño. En el caso del patrón Template Method, la herencia suele ser la elección más natural y efectiva.

     