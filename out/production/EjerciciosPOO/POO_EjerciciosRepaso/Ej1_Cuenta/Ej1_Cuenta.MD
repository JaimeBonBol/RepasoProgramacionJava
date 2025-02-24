# Clase Cuenta

Crea una clase llamada `Cuenta` que tendrá los siguientes atributos: `titular` y `cantidad` (puede tener decimales).

El `titular` será obligatorio y la `cantidad` es opcional. Crea dos constructores que cumplan lo anterior.

## Métodos

### Getters, Setters y toString

Se deben crear los métodos `get`, `set` y `toString` para los atributos.

### Métodos especiales

- `ingresar(double cantidad)`: Se ingresa una cantidad a la cuenta. Si la cantidad introducida es negativa, no se hará nada.
- `retirar(double cantidad)`: Se retira una cantidad de la cuenta. Si al restar la cantidad actual con la que nos pasan resulta negativa, la cantidad de la cuenta pasa a ser 0.
