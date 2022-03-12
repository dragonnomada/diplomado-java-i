// En Java podemos definir Clases, Interfaces o Enumeraciones.

// Las clases, interfaces o enumeraciones se tienen 
// que llamar igual que el archivo.

// Por convención se utiliza la notación PascalCase, 
// donde las clases, interfaces y enumeraciones se nombran
// con una Mayúscula inicial, seguido de minúsculas, 
// y en cada cambio de palabra se alterna de minúsculas a Mayúsculas.

// Las clases tienen la posibilidad de ser ejecutables,
// es decir, que las ejecutemos como programas,
// si definimos un punto de entrada, dicho punto de entrada
// es un método de ejecución llamado `main`
// el cual debe ser público, estático, que no devuelva nada (`void`)
// y que reciba los argumentos pasados mediante 
// un arreglo de textos (`String`).

class Hola {
  
  public static void main(String[] args) {
    // TODO: Colocar cualquier expresión válida de Java
    // - Definir variables
    // - Instanciar objetos
    // - Llamar a métodos estáticos
    // - Llamar a métodos de los objetos
    // - Leer datos de la entrada estándar (teclado)
    // - Escribir datos a la salida estándar (consola)
    // - Crear ventanas con Swing, Iniciar un Servidor, ...

    // Podemos imprimir hacía la salida estándar
    // mediante la clase `System`, el subpaquete `out`
    // y los métodos `println`, `printf`, ...

    System.out.println("Hola Java :D");
  }

}