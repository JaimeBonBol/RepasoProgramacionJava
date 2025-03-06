package POO_Examen;

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
        //SEGUNDA PARTE EXAMEN.
        FraccionSimplificada f5 = new FraccionSimplificada(1,4);
        FraccionSimplificada f6 = new FraccionSimplificada(1,2);
        FraccionSimplificada f7 = new FraccionSimplificada();
        FraccionSimplificada f8 = new FraccionSimplificada(4);

        FraccionSimplificada sum = f5.suma(f6);
        FraccionSimplificada rest = f5.restar(f7);
        FraccionSimplificada prod = f5.multiplicar(f8);
        FraccionSimplificada coc = f5.dividir(f6);

        System.out.println(f5 + " + " + f6 + " = " + sum.simplificar());
        System.out.println(f5 + " + " + f7 + " = " + rest.simplificar());
        System.out.println(f5 + " + " + f6 + " = " + prod.simplificar());
        System.out.println(f5 + " + " + f6 + " = " + coc.simplificar());

        System.out.println();
        FraccionSimplificada frac = new FraccionSimplificada(6,2);
        System.out.println("Muestro una fracción: "+frac+" y ahora la simplifico obteniendo "+frac.simplificar());
    }
}