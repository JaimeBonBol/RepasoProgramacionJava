package POO2_Ejercicios.Ej3;

public class Main {
    public static void main(String[] args) {
        // Creamos objetos de las clases
        Gato gato = new Gato();
        Perro perro = new Perro();
        Canario canario = new Canario();
        Pinguino pinguino = new Pinguino();
        Lagarto lagarto = new Lagarto();

        System.out.println("Probando Gato:");
        gato.hacerSonido();
        gato.comer();
        gato.amamantar();
        gato.dormir();

        System.out.println("\nProbando Perro:");
        perro.hacerSonido();
        perro.comer();
        perro.dormir();

        System.out.println("\nProbando Canario:");
        canario.hacerSonido();
        canario.comer();
        canario.cantar();
        canario.volar();
        canario.dormir();

        System.out.println("\nProbando Pingüino:");
        pinguino.hacerSonido();
        pinguino.comer();
        pinguino.nadar();
        pinguino.caminar();
        pinguino.dormir();

        System.out.println("\nProbando Lagarto:");
        lagarto.hacerSonido();
        lagarto.comer();
        lagarto.tomarSolecito();
        lagarto.escabullirse();
        lagarto.dormir();
    }

}
