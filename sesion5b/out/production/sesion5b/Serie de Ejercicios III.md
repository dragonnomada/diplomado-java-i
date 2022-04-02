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

1. Crea una clase llamada `Catafixia`
   1. Coloca un atributo entero llamado `cuartoPremio` 
   2. En un constructor vacío 
      1. Inicializa `cuartoPremio` con un valor aleatorio entre `1` y `3`
   3. Genera un método llamado `void abrirCuarto(int cuarto)`
      1. Si el cuarto es igual que el cuarto del premio
         1. Pregunta al usuario si está seguro o quiere cambiar de catafixia (usa `Scanner`)
         2. Si el usuario se mantiene seguro muestra el mensaje "GANASTE"
         3. Sino muestra el mensaje "LOS OTROS CUARTOS ESTÁN VACÍOS, PERDISTE"
      2. Si el cuarto es diferente del premio
         1. Muestra el mensaje "ESTE CUARTO ESTÁ VACÍO, PERO TIENES OTRA OPORTUNIDAD"
         2. Lee una nueva oportunidad para el usuario
         3. Si el cuarto es igual que el cuarto del premio
            1. Pregunta al usuario si está seguro o quiere cambiar de catafixia (usa `Scanner`)
            2. Si el usuario se mantiene seguro muestra el mensaje "GANASTE"
            3. Sino muestra el mensaje "LOS OTROS CUARTOS ESTÁN VACÍOS, PERDISTE"

## El juego del Gato

1. Diseña la clase `Gato` con una matriz de `3x3`
   1. Diseña los métodos necesarios para tirar un `O` o `X` en una posición dada
   2. Diseña el método que evalue si gana `O`
   3. Diseña el método que evalue si gana `X`

## El juego del Monopoli

1. Diseña la clase `Monopoli` que debería tener las siguientes características
   1. Se debe componer una lista de casillas de tamaño `N`
   2. Una casilla debería ser la clase `Casilla`
   3. La clase `Casilla` debe tener los atributos `jugador` de la clase `Jugador`
      1. También si está ocupada
      2. El costo por estar en esa casilla
      3. Y un método llamado `cobrarJugador(jugador)` que al caer en la casilla le descuente dinero
   4. La clase `Jugador` debe tener un atributo de dinero y un método para descontar
   5. La clase `Monopoli` debe tener un método `tirar(jugador)`
      1. Buscar el jugador en la casilla
      2. Tirar los dados
      3. Moverlo a otra casilla
      4. Si el jugador ya no tiene dinero, quitarlo del tablero (ya no meterlo a otra casilla)
      5. Considera las condiciones en caso que el jugador ya no esté en ninguna casilla
      
## El juego de Serpientes y Escaleras

1. Diseña la clase `Serpientes y Escaleras`
   1. ¿Qué atributos tiene?
   2. ¿Qué otras clases se necesitan?
   3. ¿Cómo puede un jugador tirar y avanzar de una casilla a otra?
   4. ¿Cómo podemos avanzar o retroceder al jugador si la casilla tiene una serpiente o escalera?
   5. ¿Cómo definimos las serpientes o escaleras?