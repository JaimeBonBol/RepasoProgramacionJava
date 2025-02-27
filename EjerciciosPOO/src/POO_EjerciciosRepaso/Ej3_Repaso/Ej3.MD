# Enunciado: Clase Password

## Definición de la Clase Password

Crea una clase llamada `Password` que siga las siguientes condiciones:

- Debe tener los atributos `longitud` y `contraseña`. Por defecto, la longitud será de **8**.
- Los constructores serán los siguientes:
    - Un constructor por defecto.
    - Un constructor que reciba la longitud como parámetro y genere una contraseña aleatoria con esa longitud.

### Métodos a implementar:
- `esFuerte()`: Devuelve un **booleano** indicando si la contraseña es fuerte o no.
    - Para que sea fuerte, debe contener:
        - Más de **2 mayúsculas**.
        - Más de **1 minúscula**.
        - Más de **5 números**.
- `generarPassword()`: Genera una contraseña aleatoria con la longitud establecida en el objeto.
- Métodos **get** para `contraseña` y `longitud`.
- Método **set** para `longitud`.

---

## Clase Ejecutable

En la clase principal se debe hacer lo siguiente:

1. Crear un **array de Passwords** con el tamaño que el usuario indique por teclado.
2. Antes del bucle, pedir por teclado la longitud de las contraseñas.
3. Utilizar un bucle para:
    - Crear un objeto `Password` para cada posición del array.
    - Almacenar en otro array de booleanos si la contraseña generada es fuerte o no (usando `esFuerte()`).
4. Al finalizar, mostrar cada contraseña junto con su respectivo valor booleano indicando si es fuerte o no.

### Formato de salida esperado:
