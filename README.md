# FizzBuzz Kata con TDD en Java

## Descripción del Problema

La Kata FizzBuzz es un ejercicio de programación muy conocido, utilizado para enseñar los conceptos básicos de desarrollo de software y TDD. El problema es simple pero efectivo para practicar TDD.

### Reglas del FizzBuzz

Para una lista de números enteros del 1 al 100:

- Si el número es divisible entre 3, el programa deberá imprimir "Fizz".
- Si el número es divisible entre 5, el programa deberá imprimir "Buzz".
- Si el número es divisible entre 3 y 5, el programa deberá imprimir "FizzBuzz".
- Si el número no es divisible ni entre 3 ni entre 5, el programa deberá imprimir el número como tal.

## Pre-requisitos

- JDK 11 o superior
- Maven
- IDE de su elección (IntelliJ IDEA, Eclipse, etc.)

## Instalación

1. Clonar el repositorio:

    ```bash
    git clone https://github.com/lovera00/fizzbuzz-tdd-java.git
    ```

2. Navegar al directorio del proyecto:

    ```bash
    cd fizzbuzz-tdd-java
    ```

3. Compilar el proyecto:

    ```bash
    mvn clean install
    ```

## Cómo correr las pruebas

Abrir el proyecto en tu IDE de elección y luego buscar la clase de pruebas (usualmente llamada `FizzBuzzTest`). Haz clic derecho en la clase y selecciona "Run 'FizzBuzzTest'".

Alternativamente, puedes correr las pruebas desde la línea de comandos con Maven:

```bash
mvn test
