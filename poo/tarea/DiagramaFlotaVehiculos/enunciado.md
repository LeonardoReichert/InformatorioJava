# Escenario: Sistema de Gestión de Vehículos
Imagina que estamos creando un sistema para gestionar diferentes tipos de vehículos en una flota de transporte. Este sistema nos permitirá representar vehículos, sus características y comportamientos. Resolverlos aplicando los conceptos de abstracción, herencia, polimorfismo y encapsulamiento que se aplicarán en este ejercicio.

## Enunciado del Ejercicio
Objetivo: Crear un sistema de gestión de vehículos que incluya diferentes tipos de vehículos, como coches y motos. Deberás implementar los siguientes conceptos de programación orientada a objetos:

* Abstracción: Crea una clase abstracta llamada Vehículo que contenga atributos y métodos comunes para todos los vehículos. Debe incluir un método abstracto llamado mover() que describa cómo se mueve el vehículo.

* Herencia: Crea dos clases que hereden de Vehículo: Coche y Moto. Cada clase debe implementar el método mover() de manera específica. Por ejemplo, un coche puede tener un método que imprima "El coche está conduciendo", mientras que una moto puede imprimir "La moto está acelerando".

 * Polimorfismo: Implementa un método en una clase llamada Flota que acepte un objeto de tipo Vehiculo y llame al método mover(). Este método debe ser capaz de manejar tanto coches como motos, demostrando el polimorfismo.

 * Encapsulamiento: En la clase Vehículo, los atributos marca y modelo deben ser privados. Debes proporcionar métodos públicos para acceder a estos atributos, como getMarca() y getModelo().

Crear el diagrama de clases del escenario
Resolver el enunciado aplicando los principio de POO
