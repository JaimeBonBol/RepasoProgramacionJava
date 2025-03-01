# Ejercicio: Electrodomésticos, Lavadora y Televisión

## Superclase: Electrodoméstico

Crearemos una superclase llamada `Electrodomestico` con las siguientes características:

- **Atributos**: precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
- **Valores por defecto**:
    - Color: blanco.
    - Consumo energético: F.
    - Precio base: 100 €.
    - Peso: 5 kg.
    - Usa constantes para estos valores.
- **Colores disponibles**: blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o minúsculas.

### Constructores

- **Constructor por defecto**.
- **Constructor con precio y peso**, el resto de atributos tendrán valores por defecto.
- **Constructor con todos los atributos**.

### Métodos

- **Getters** para todos los atributos.
- **`comprobarConsumoEnergetico(char letra)`**: verifica que la letra es correcta; si no lo es, asigna la letra por defecto. Se invoca al crear el objeto y no será visible.
- **`comprobarColor(String color)`**: verifica que el color es válido; si no lo es, asigna el color por defecto. Se invoca al crear el objeto y no será visible.
- **`precioFinal()`**: aumenta el precio según el consumo energético y el tamaño:

#### Incremento por consumo energético

| Letra | Precio |
|--------|--------|
| A      | 100 €  |
| B      | 80 €   |
| C      | 60 €   |
| D      | 50 €   |
| E      | 30 €   |
| F      | 10 €   |

#### Incremento por peso

| Peso (kg) | Precio |
|------------|--------|
| 0 - 19     | 10 €   |
| 20 - 49    | 50 €   |
| 50 - 79    | 80 €   |
| +80        | 100 €  |

---

## Subclase: Lavadora

- **Atributo**: `carga`, además de los atributos heredados.
- **Valor por defecto**: `carga = 5 kg` (usa una constante).

### Constructores

- **Constructor por defecto**.
- **Constructor con precio y peso**, el resto por defecto.
- **Constructor con la carga y el resto de atributos heredados** (llama al constructor de la clase padre).

### Métodos

- **Getter** de `carga`.
- **`precioFinal()`**:
    - Si la carga es mayor de 30 kg, aumenta el precio en **50 €**.
    - Llama al método `precioFinal()` del padre y añade este ajuste.

---

## Subclase: Televisión

- **Atributos**: `resolución (pulgadas)` y `sintonizador TDT (booleano)`, además de los atributos heredados.
- **Valores por defecto**:
    - `resolución = 20 pulgadas`
    - `sintonizador TDT = false`.

### Constructores

- **Constructor por defecto**.
- **Constructor con precio y peso**, el resto por defecto.
- **Constructor con resolución, sintonizador TDT y el resto de atributos heredados** (llama al constructor de la clase padre).

### Métodos

- **Getters** de `resolución` y `sintonizador TDT`.
- **`precioFinal()`**:
    - Si la resolución es mayor de **40 pulgadas**, el precio aumenta un **30%**.
    - Si tiene **sintonizador TDT**, el precio aumenta **50 €**.
    - Llama al método `precioFinal()` del padre y añade estos ajustes.

---

## Clase ejecutable

### Instrucciones:

1. **Crear un array de `Electrodomestico` de 10 posiciones**.
2. **Asignar objetos de `Electrodomestico`, `Lavadora` y `Televisión`** con valores que elijas.
3. **Recorrer el array y ejecutar `precioFinal()` en cada objeto**.
4. **Calcular el precio total**:
    - Precio total de **todas las televisiones**.
    - Precio total de **todas las lavadoras**.
    - Precio total de **todos los electrodomésticos** (incluyendo `Electrodomestico`, `Television` y `Lavadora`).
5. **Usar `instanceof`** para clasificar los objetos correctamente.

### Ejemplo de salida:

Si tenemos:

- Un `Electrodomestico` con precio final de **300 €**.
- Una `Lavadora` con precio final de **200 €**.
- Una `Television` con precio final de **500 €**.

La salida será:

