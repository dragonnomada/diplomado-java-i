# Serie de Ejercicios III

![Logo CIC](../notas/figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## El problema de la Jarra

1. Crear una clase llamada `Jarra` como se describe.
   1. La jarra tiene una capacidad máxima (en mililitros)
   2. La jarra tiene una cantidad actual ocupada (en mililitros)
   3. Al agregar más cantidad a la jarra determina si esta cabe
      1. Si no cabe regresa falso
      2. Si cabe agregar la cantidad solicitada a la cantidad de la jarra y regresa verdadero
   4. Al quitar cantidad de la jarra determina si la jarra tiene al menos esa cantidad
      1. Si no tiene dicha cantidad regresa falso
      2. Si tiene la cantidad o más quita la cantidad solicitada a la cantidad de la jarra y devuelve verdadero
   5. Al llenar la jarra devuelve los mililitros usados para llenarla
   6. Al vaciar la jarra devuelve los mililitros sobrantes al vaciarla
   7. Al describir la jarra muestra la cantidad ocupada, la capacidad máxima y el porcentaje de ocupación
2. Prueba que la jarra funcione con varias jarras de prueba
   1. Reporta las diferencias y si se pudo agregar o quitar cantidad
   2. Describe constantemente la jarra

> Clase `Jarrra`

    Jarra
    -----------------
    - capacidad : int
    - cantidad : int
    -----------------
    + agregar(cantidad) : boolean
    + quitar(cantidad) : boolean
    + llenar() : int
    + vaciar() : int
    + describir()

## El problema de las 3 Jarras

1. Crea una clase llamada `TresJarras`
   1. Define los atributos `jarra1`, `jarra2` y `jarra3` de la clase `Jarra`
   2. Define un constructor que solicite la capacidad máxima de cada jarra
   3. Inicializa las tres jarras dentro del constructor con sus capacidades
   4. Crea un método llamado `boolean agregar(int jarra, int cantidad)`
      1. Según el número de jarra se debería agregar la cantidad a esa jarra
      2. Si no es posible devuelve falso, sino devuelve verdadero
   5. Repite para el método llamado `boolean quitar(int jarra, int cantidad)`
   6. Repite para el método llamado `int llenar(int jarra)`
   7. Repite para el método llamado `int vaciar(int jarra)`
   8. Crea un método llamado `int vertir(int jarraA, int jarraB)`
      1. Pasa el contenido de la `jarraA` a la `jarraB`
      2. Calcula los mililitros que sobran en la `jarraA` y devuélvelos

## El juego de la Catafixia



## El juego del Gato

## El juego del Monopoli

## El juego de Serpientes y Escaleras