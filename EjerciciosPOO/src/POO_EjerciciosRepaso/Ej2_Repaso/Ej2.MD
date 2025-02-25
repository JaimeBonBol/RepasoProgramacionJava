# Enunciado de la clase Persona

Haz una clase llamada `Persona` que siga las siguientes condiciones:

## **Atributos**
- `nombre`: Nombre de la persona.
- `edad`: Edad de la persona.
- `DNI`: Documento Nacional de Identidad.
- `sexo`: Sexo de la persona (`H` hombre, `M` mujer).
- `peso`: Peso en kilogramos.
- `altura`: Altura en metros.

No queremos que se accedan directamente a estos atributos. Piensa en el modificador de acceso más adecuado, así como su tipo. Si deseas añadir algún atributo adicional, puedes hacerlo.

Por defecto, todos los atributos, excepto el DNI, tendrán valores predeterminados según su tipo:
- `0` para números.
- Cadena vacía (`""`) para `String`.
- El `sexo` será hombre por defecto, utiliza una constante para ello.

---

## **Constructores**
Se implementarán los siguientes constructores:
1. **Constructor por defecto**.
2. **Constructor con nombre, edad y sexo**, el resto de los atributos será por defecto.
3. **Constructor con todos los atributos como parámetros**.

---

## **Métodos a implementar**
- **`calcularIMC()`**: Calcula si la persona está en su peso ideal utilizando la fórmula:

  \[
  IMC = \frac{\text{peso}}{\text{altura}^2}
  \]

  Si el valor devuelto por la fórmula es:
    - Menor que 20, la función devuelve `-1`.
    - Entre 20 y 25 (incluidos), la función devuelve `0` (peso ideal).
    - Mayor que 25, la función devuelve `1` (sobrepeso).

  Se recomienda usar constantes para estos valores.

- **`esMayorDeEdad()`**: Indica si la persona es mayor de edad (18 años o más), devolviendo un valor booleano.

- **`comprobarSexo(char sexo)`**: Verifica si el sexo introducido es correcto. Si no lo es, se establece por defecto como `H`. Este método no será visible al exterior.

- **`toString()`**: Devuelve toda la información del objeto como un `String`.

- **`generaDNI()`**: Genera un número aleatorio de 8 cifras y genera a partir de este número su letra correspondiente. Este método se invocará al crear el objeto y no será visible al exterior.

- **Métodos `set`** para cada parámetro, excepto el `DNI`.

---

## **Clase Ejecutable**

Ahora, crea una clase ejecutable que haga lo siguiente:

1. **Solicitar por teclado** los siguientes datos:
    - Nombre
    - Edad
    - Sexo
    - Peso
    - Altura

2. **Crear tres objetos** de la clase `Persona`:
    - **Primer objeto**: Obtendrá todos los atributos desde las variables ingresadas por teclado.
    - **Segundo objeto**: Obtendrá los mismos atributos, pero con valores predeterminados para `peso` y `altura`.
    - **Tercer objeto**: Se creará con los valores predeterminados, pero luego se actualizarán los atributos usando los métodos `set`.

3. **Para cada objeto**:
    - Comprobar si está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal y mostrar un mensaje.
    - Indicar si es mayor de edad.
    - Mostrar toda la información de cada objeto.

Puedes usar métodos adicionales en la clase ejecutable para facilitar la implementación.
