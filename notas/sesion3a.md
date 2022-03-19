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

En esta sesión aprenderemos sobre la construcción de clases.

* Establecer atributos y métodos
* Creación de Objetos
* Establecer nivel de acceso de atributos y métodos
* Sobrecargar métodos
* Definir Constructores
* Sobrecargar Constructores
* Objetos y Referencias
* Valores Copiados y Valores Referenciados

## Clase

Representan el diseño que tendrán objetos comunes.

    > Las clases abstraen la naturaleza de un sistema
      para modelarlo mediante atributos y métodos.

> Ejemplo de una clase que representa un Ticket

```java
public class Ticket {
    
    private int id;
    private double total;
    private String fecha;
    private PuntoVenta puntoVenta;
    
    public void imprimir() {
        System.out.printf("[Ticket #%d / %s] $%.2f %s \n",
                this.id, this.puntoVenta, this.total, this.fecha);
    }
    
}
```

## Atributo

Representa un dato que podrán ser retenidos por un objeto y su nivel de acceso.

    > Los atributos estructuran la información de los objetos 
      modelados por la clase.

> Ejemplo de una clase que retiene el dato de si un Aparato está prendido

```java
public class Aparato {
    
    protected boolean encendido;
    
    public void encender() {
        this.encendido = true;
    }
    
    public void apagar() {
        this.encendido = false;
    }
    
}
```

## Método

Representa una funcionalidad que se puede aplicar el objeto y su nivel de acceso.

    > Los métodos estructuran las acciones que se le pueden aplicar
      a un objeto, aceptando información extenerna en forma de parámetros.

> Ejemplo de una clase Cafetera con la acción de prepar café

```java
public class Cafetera {
    
    private boolean preparando;
    
    public void prepararCafe(String tipo) {
        if (this.preparando) {
            System.out.println("La cafetera está ocupada");
            return;
        }
        
        switch (tipo) {
            case "Americano":
                System.out.println("Preparando café americano");
                this.preparando = true;
                break;
            case "Expreso":
                System.out.println("Preparando café expreso");
                this.preparando = true;
                break;
            default:
                System.out.println("No se puede preparar este tipo de café");
                this.preparando = false;
                break;
        }
    }
    
}
```

## Creación de Objetos

Cada clase permite construir objetos diseñados con los mismos atributos
y métodos. La diferencia entre un objeto y otro será el valor contenido
en cada atributo. Estos serán independientes de otros objetos.
Por los que cada objeto será como una caja independiente, diseñada
según la clase.

    > Los objetos permiten retener valores específicos en los atributos
      diseñados por la clase y mandar a aplicarles los métodos definidos.

> Ejemplo de una batalla de Robots

```java
public class TestRobots {
    
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        
        while (!r1.estaAniquilado() && !r2.estaAniquilado()) {
            r1.mover();
            r2.mover();
            r1.atacar();
            r2.atacar();
        }
    }
    
}
```

