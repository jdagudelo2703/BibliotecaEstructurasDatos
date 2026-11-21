# Estructuras de datos aplicadas a una biblioteca

Repositorio académico con ejemplos prácticos en Java para estudiar estructuras de datos lineales y no lineales mediante situaciones sencillas de biblioteca.

## Objetivo

Comprender cómo se almacenan, buscan, recorren y actualizan datos como títulos, códigos, solicitudes de préstamo, reservas y conexiones entre sedes.

## Organización del proyecto

El repositorio agrupa los temas en dos categorías: las estructuras lineales organizan los datos en secuencia; las no lineales representan jerarquías o conexiones.

```text
BibliotecaEstructurasDatos/
├── README.md
├── .gitignore
├── lineales/
│   ├── 1arreglos/
│   │   ├── BuscarLibro.java
│   │   ├── OrdenarTitulos.java
│   │   ├── ContarEjemplares.java
│   │   └── notas.txt
│   ├── 2listas/
│   │   ├── CatalogoDinamico.java
│   │   ├── EliminarLibro.java
│   │   ├── RecorrerCatalogo.java
│   │   └── notas.txt
│   ├── 3pilas/
│   │   ├── HistorialCambios.java
│   │   ├── RevertirPrestamo.java
│   │   ├── RevisarUltimaAccion.java
│   │   └── notas.txt
│   └── 4colas/
│       ├── ColaSolicitudes.java
│       ├── ReservasPendientes.java
│       ├── TurnosAtencion.java
│       └── notas.txt
└── nolineales/
    ├── 5arboles/
    │   ├── ArbolCodigos.java
    │   ├── BuscarCodigo.java
    │   ├── RecorridoPorNiveles.java
    │   └── notas.txt
    ├── 6grafos/
    │   ├── ConexionesSedes.java
    │   ├── RecorridoBFS.java
    │   ├── RecorridoDFS.java
    │   └── notas.txt
    └── 7tablashash/
        ├── BuscarPorIsbn.java
        ├── RegistrarPrestamo.java
        ├── ContarPrestamos.java
        └── notas.txt
```

## Estructuras y ejemplos

### Lineales

- **Arreglos:** buscar un título, ordenar títulos y sumar ejemplares.
- **Listas enlazadas:** agregar y retirar libros, y recorrer el catálogo.
- **Pilas:** guardar acciones recientes, revertir una acción y consultar la última acción.
- **Colas:** atender solicitudes y turnos en el orden de llegada, y revisar reservas pendientes.

### No lineales

- **Árboles:** organizar códigos, buscar un código y recorrer nodos por niveles.
- **Grafos:** representar sedes conectadas y recorrerlas en anchura (BFS) o profundidad (DFS).
- **Tablas hash:** buscar por ISBN y registrar o contar préstamos.

Cada carpeta incluye `notas.txt` con una explicación breve, operaciones principales, costos aproximados y una actividad para practicar.

## Requisitos

- Java JDK 11 o superior.
- Una terminal o un entorno de desarrollo compatible con Java.

## Cómo ejecutar un ejemplo

Cada archivo tiene su propio método `main` y se puede ejecutar de forma independiente. Por ejemplo:

```text
cd lineales/1arreglos
javac BuscarLibro.java
java BuscarLibro
```

Reemplaza `BuscarLibro` por el nombre del programa que quieras ejecutar y entra primero a la carpeta correspondiente.

## Nota académica

Los registros incluidos son ficticios y se utilizan únicamente para practicar. Los ejemplos de este proyecto fueron elaborados para el caso de una biblioteca.
