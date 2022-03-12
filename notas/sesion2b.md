# Sesión 2.B - Java JDK: Instalación, Compilación y Ejecución

![Logo CIC](./figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## Introducción

En esta sesión aprenderemos a instalar, compilar y ejecutar archivos de Java. También veremos el `Classpath`, las variables y estructuras de control del lenguaje.

## Instalación de Java JDK

> Figura 4.1 - Página de descarga de Java

![Figura 4.1](./figuras/4.1.png)

[https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)

> Figura 4.2 - Instalación

    NOTA: Copiar la ruta donde será instalado el JDK

    >>> C:\Program Files\Java\jdk-17.0.2

![Figura 4.2](./figuras/4.2.png)

### Configuración de Java JDK

> Figura 4.3 - Ubicamos la carpeta del JDK

![Figura 4.3](./figuras/4.3.png)

> Figura 4.4 - Abrir la `Configuración Avanzada del Sistema`

![Figura 4.4](./figuras/4.4.png)

> Figura 4.5 - Abrir las `Variables de Entorno`

![Figura 4.5](./figuras/4.5.png)

> Figura 4.6 - Ajustar las `Variables del Sistema`

![Figura 4.6](./figuras/4.6.png)

> Figura 4.7 - Crear la variable `JAVA_HOME` con la ruta al JDK

![Figura 4.7](./figuras/4.7.png)

> Figura 4.8 - Eliminar de `Path` los `javapath`

    NOTA: Esto suprime la versión jre 1.8.X

    >>> Dejamos sólo el JDK

![Figura 4.8](./figuras/4.8.png)

> Figura 4.9 - Agregamos a `Path` el `%JAVA_HOME\bin%`

    NOTA: Esto activa el JDK

![Figura 4.9](./figuras/4.9.png)

### Verificación de Java JDK

> Figura 4.10 - Abrimos la configuración de Java

![Figura 4.10](./figuras/4.10.png)

> Figura 4.11 - Se muestra el Panel de Control de Java

![Figura 4.11](./figuras/4.11.png)

> Figura 4.12 - Opcionalmente podemos actualizar

    NOTA: Se puede desactivar la actualización

![Figura 4.12](./figuras/4.12.png)

> Figura 4.12b - Agregamos el JDK al Java Runtime Environment

![Figura 4.12b](./figuras/4.12b.png)

> Figura 4.13 - Verificamos `java -version`, `javac -version`, `jconsole`

![Figura 4.13](./figuras/4.13.png)

> Figura 4.14 - Revisamos la consola de monitoreo de la JVM

![Figura 4.14](./figuras/4.14.png)

## Compilación y Ejecución de Clases

Todas las clases de Java se pueden compilar, sin embargo sólo algunas serán ejecutables.

La siguiente lista numera algunas restricciones de Java.

* Las clases, interfaces o enumeraciones se tienen que llamar igual que el archivo.
* Por convención se utiliza la notación PascalCase, donde las clases, interfaces y enumeraciones se nombran con una Mayúscula inicial, seguido de minúsculas, y en cada cambio de palabra se alterna de minúsculas a Mayúsculas.
* Las clases tienen la posibilidad de ser ejecutables, es decir, que las ejecutemos como programas, si definimos un punto de entrada, dicho punto de entrada es un método de ejecución llamado `main` el cual debe ser público, estático, que no devuelva nada (`void`) y que reciba los argumentos pasados mediante un arreglo de textos (`String`). Es decir, `public static void main(String[] args) { ... }`.

### 1. Definir una clase que sea ejecutable (con punto de entrada/ejecución)

> Hola.java

```java
class Hola {
  
  public static void main(String[] args) {
    System.out.println("Hola Java :D");
  }

}
```

### 2. Compilar la clase `Hola.java` en el archivo `bytecode` `Hola.class`

    $ javac Hola.java

    --> Hola.class

### 3. Ejecutar el archivo `Hola.class` (sin la extensión)

    $ java Hola

    >>> Hola Java :D

### Notas

    TODO: Colocar cualquier expresión válida de Java
    - Definir variables
    - Instanciar objetos
    - Llamar a métodos estáticos
    - Llamar a métodos de los objetos
    - Leer datos de la entrada estándar (teclado)
    - Escribir datos a la salida estándar (consola)
    - Crear ventanas con Swing, Iniciar un Servidor, ...

    Podemos imprimir hacía la salida estándar
    mediante la clase `System`, el subpaquete `out`
    y los métodos `println`, `printf`, ...


