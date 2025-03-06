package POO_ExamenMejorado;

public class Main_Examen {
    public static void main(String[] args) {
        //PRIMERA PARTE EXAMEN.
        /**
         * Creación de 4 fracciones.
         */
        Fraccion f1 = new Fraccion(1,4);
        Fraccion f2 = new Fraccion(1,2);
        Fraccion f3 = new Fraccion();
        Fraccion f4 = new Fraccion(4);

        /**
         * Operaciones aritméticas con fracciones.
         */
        Fraccion suma = f1.suma(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);

        /**
         * Mostrar resultados.
         */
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);


        System.out.println();
        System.out.println();
        //SEGUNDA PARTE EXAMEN. Mejora creando instancias de FraccionSimplificada a partir del numerador y el denomindador de cada operación
        //realizada anteriormente, para así evitar realizar de nuevo la operación. Y siobre esa instancia ya se puede simplificar, así evito el tener que sobreescribir
        // todos los métodos de operaciones en la clase FraccionSimplificada.
        FraccionSimplificada sumaSimplificada = new FraccionSimplificada(suma.num, suma.den);
        FraccionSimplificada restaSimplificada = new FraccionSimplificada(resta.num, resta.den);
        FraccionSimplificada productoSimplificado = new FraccionSimplificada(producto.num, producto.den);
        FraccionSimplificada cocienteSimplificado = new FraccionSimplificada(cociente.num, cociente.den);

        System.out.println(f1 + " + " + f2 + " = " + sumaSimplificada.simplificar());
        System.out.println(f1 + " - " + f3 + " = " + restaSimplificada.simplificar());
        System.out.println(f1 + " * " + f4 + " = " + productoSimplificado.simplificar());
        System.out.println(f1 + " / " + f2 + " = " + cocienteSimplificado.simplificar());

        System.out.println();
        FraccionSimplificada frac = new FraccionSimplificada(6,2);
        System.out.println("Muestro una fracción: "+frac+" y ahora la simplifico obteniendo "+frac.simplificar());
    }
}
