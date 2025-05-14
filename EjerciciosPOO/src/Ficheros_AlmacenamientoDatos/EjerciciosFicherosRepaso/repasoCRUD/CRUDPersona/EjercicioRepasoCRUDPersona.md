# Ejercicio CRUD con persistencia de datos en JSON

## Objetivo:
Desarrollar una aplicación Java que implemente un sistema CRUD (Crear, Leer, Actualizar y Eliminar) para gestionar personas.

Los datos de las personas deben ser almacenados en un archivo **JSON** utilizando la librería **Jackson** para asegurar la persistencia.

## Requisitos:
### 1. **Clase `Persona`**:
- **Atributos**:
    - `nombre` (String)
    - `edad` (int)
    - `email` (String)
- **Constructor** que reciba todos los atributos.
- **Getters y setters** para los atributos.
- Método **`toString()`** para mostrar los datos de la persona en un formato legible.

### 2. **Clase `PersonaService`**:
- Esta clase gestionará las operaciones CRUD sobre las personas, y debe tener:
    - Una lista de objetos `Persona` que representa los datos en memoria.
    - Método **`crear(Persona p)`** para agregar una persona a la lista y persistir los cambios en el archivo JSON.
    - Método **`leer()`** para devolver la lista completa de personas almacenadas.
    - Método **`actualizar(String nombre, Persona nueva)`** para actualizar una persona ya existente (basado en el nombre).
    - Método **`eliminar(String nombre)`** para eliminar una persona por su nombre.
    - Método **`guardarEnJson()`** para guardar la lista de personas en un archivo JSON utilizando **Jackson**.
    - Método **`cargarDesdeJson()`** para cargar la lista de personas desde el archivo JSON al iniciar la aplicación.
- El archivo JSON debe guardarse con el nombre **`personas.json`** en el directorio donde se ejecute el programa.

### 3. **Clase `Main`**:
- Implementar un menú interactivo que permita al usuario realizar las operaciones CRUD:
    1. Crear una nueva persona.
    2. Ver la lista de personas almacenadas.
    3. Actualizar una persona existente.
    4. Eliminar una persona.
    5. Salir del programa.
- Utilizar un **Scanner** para interactuar con el usuario y que este pueda seleccionar las opciones.
- El menú debe ejecutarse en un bucle hasta que el usuario elija salir.

## **Requisitos técnicos**:
- Utilizar la librería **Jackson** para la serialización y deserialización de objetos `Persona` en formato JSON. Puedes usar **`ObjectMapper`** para leer y escribir el archivo JSON.
- El archivo **`personas.json`** debe estar en el mismo directorio donde se ejecute el programa (puedes elegir otro directorio si lo deseas).
- Implementar la persistencia, es decir, que al cerrar y volver a abrir la aplicación, los datos de las personas se mantengan en el archivo **`personas.json`**.

## Ejemplo de flujo de la aplicación:

1. **Al iniciar la aplicación**, si el archivo `personas.json` no existe, se crea automáticamente al persistir datos.
2. El usuario selecciona la opción **1** para agregar una persona, se le pide ingresar los datos y luego la persona se guarda en el archivo JSON.
3. Si el usuario selecciona **2** (Leer), la aplicación debe mostrar la lista de personas almacenadas en el archivo.
4. Si el usuario selecciona **3** (Actualizar), se le solicita el nombre de la persona a actualizar y sus nuevos datos.
5. Si el usuario selecciona **4** (Eliminar), se le solicita el nombre de la persona a eliminar y se actualiza el archivo JSON.
6. Si el usuario elige **0** (Salir), el programa termina.

## **Formato de los datos en el archivo `personas.json`:**

Después de agregar varias personas, el archivo **`personas.json`** debería tener un formato como el siguiente:

```json
[
  {
    "nombre": "Marta",
    "edad": 24,
    "email": "marta@gmail.com"
  },
  {
    "nombre": "Juan",
    "edad": 40,
    "email": "juan@gmail.com"
  },
  {
    "nombre": "Luis",
    "edad": 36,
    "email": "luis@gmail.com"
  }
]
