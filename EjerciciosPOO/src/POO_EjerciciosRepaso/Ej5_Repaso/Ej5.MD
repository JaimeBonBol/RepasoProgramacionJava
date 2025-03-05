# Ejercicio: Gestión de Series y Videojuegos en Java

## 1. Clase Serie

Crearemos una clase llamada `Serie` con las siguientes características:

- **Atributos**:
    - `titulo`
    - `numero de temporadas`
    - `entregado`
    - `genero`
    - `creador`

- **Valores por defecto**:
    - `numero de temporadas = 3`
    - `entregado = false`
    - Los demás atributos tendrán valores por defecto según su tipo.

- **Constructores**:
    1. Un constructor por defecto.
    2. Un constructor con el `titulo` y `creador` (el resto con valores por defecto).
    3. Un constructor con todos los atributos, excepto `entregado`.

- **Métodos**:
    - Métodos `get` de todos los atributos, excepto `entregado`.
    - Métodos `set` de todos los atributos, excepto `entregado`.
    - Sobrescribe el método `toString()`.

---

## 2. Clase Videojuego

Crearemos una clase llamada `Videojuego` con las siguientes características:

- **Atributos**:
    - `titulo`
    - `horas estimadas`
    - `entregado`
    - `genero`
    - `compañia`

- **Valores por defecto**:
    - `horas estimadas = 10`
    - `entregado = false`
    - Los demás atributos tendrán valores por defecto según su tipo.

- **Constructores**:
    1. Un constructor por defecto.
    2. Un constructor con el `titulo` y `horas estimadas` (el resto con valores por defecto).
    3. Un constructor con todos los atributos, excepto `entregado`.

- **Métodos**:
    - Métodos `get` de todos los atributos, excepto `entregado`.
    - Métodos `set` de todos los atributos, excepto `entregado`.
    - Sobrescribe el método `toString()`.

---

## 3. Interfaz Entregable

Dado que `Serie` y `Videojuego` comparten ciertas características, crearemos una interfaz llamada `Entregable` con los siguientes métodos:

- `entregar()`: cambia el atributo `entregado` a `true`.
- `devolver()`: cambia el atributo `entregado` a `false`.
- `isEntregado()`: devuelve el estado del atributo `entregado`.
- `compareTo(Object a)`: compara las horas estimadas en los videojuegos y en las series el número de temporadas.
    - Este método recibe un objeto y requiere hacer *casting* de objetos para la comparación.

---

## 4. Aplicación ejecutable

Ahora, crearemos una aplicación ejecutable que realice lo siguiente:

1. Crear **dos arrays**, uno de `Series` y otro de `Videojuegos`, de **5 posiciones cada uno**.
2. Crear un objeto en cada posición del array con los valores que desees, utilizando distintos constructores.
3. Entregar algunos `Videojuegos` y `Series` utilizando el método `entregar()`.
4. Contar cuántos `Series` y `Videojuegos` han sido entregados y devolverlos.
5. Identificar:
    - El **Videojuego con más horas estimadas**.
    - La **Serie con más temporadas**.
6. Mostrar en pantalla la información del `Videojuego` y la `Serie` con más horas/temporadas usando `toString()`.

---

¡Manos a la obra! 🚀
