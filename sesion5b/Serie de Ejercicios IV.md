# Serie de Ejercicios IV

![Logo CIC](../notas/figuras/logo.png)

    Diplomado de Java - Módulo I
    Departamento de Diplomados y Extensión Profesional
    Centro de Investigación en Cómputo
    Instituto Politécnico Nacional

---

[![Alan Badillo Salas](https://avatars.githubusercontent.com/u/79223578?s=40&v=4 "Alan Badillo Salas")](https://github.com/dragonnomada) Por [Alan Badillo Salas](https://github.com/dragonnomada)

---

## El negocio de renta de películas

Diseña un negocio para la renta de películas, no implementes código en java, 
solo genera los diagramas de clases y los diagramas de componentes.

Responde las siguientes preguntas:

1. ¿Cuáles son las entidades involucradas? Describe cada uno como historias de usuario
2. ¿Cuáles son los componentes involucrados? Describe cada uno como procesos del sistema
3. ¿Cuáles son las interfaces requeridas por cada componente? Describe cada una como lista de requerimientos
4. ¿Cuáles son las interfaces ofrecidas por cada componente? Describe cada una como una lista de requerimientos

> Ejemplo

    ENTIDADES

    Pelicula - Es rentada por un cliente
    Cliente - Renta una película
    Renta - Guarda la información de una película y un cliente
    FechaEntrega - Guarda la información de una renta y su fecha de entrega
    ...

    COMPONENTES

    ElegirPelicula - Determina que película rentará el cliente
        REQUIERE - Un cliente
        OFRECE - Una película
    RentarPelicula - Inicia el proceso de renta de película para el cliente
        REQUIERE - Un cliente y una película
        OFRECE - Una renta
    EstablecerFechaEntrega - Genera la fecha de entrega para una película
        REQUIRE - Una renta
        OFRECE - Una fecha de entrega
    ...

## El negocio de préstamo de libros

Similar al de renta de películas, genera un negocio para préstamo de libros.
Considera ahora tener un límite de libros prestados para el cliente.

## El negocio de venta de productos

Genera el negocio para la venta de productos.

Considera los siguientes puntos.

1. Agregar y quitar los productos a una venta
2. Fijar la venta (ya no se pueden agregar o quitar productos)
3. Cobrar la venta (se calcula el total a pagar)
4. Pagar la venta (se emite un comprobante de pago)
5. Cerrar la venta (Se finaliza la venta)

## El negocio de almacenamiento de productos

Genera el negocio para el almacenamiento de productos.

Considera los siguientes puntos.

1. Registrar el producto (entrada al almacén)
2. Consultar el producto
3. Retirar el producto (salida del almacén)

## El negocio de reservación de habitaciones

Genera el negocio para la reservación de habitaciones.

Considera los siguientes puntos.

1. Fijar las habitaciones
2. Consultar una habitación
3. Reservar una habitación
4. Liberar una habitación
5. Mostrar las habitaciones libres y ocupadas