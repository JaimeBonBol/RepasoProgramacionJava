package POO2_Ejercicios.Ej3;

/**
 * Clase Animal.
 */
public class Animal {

    /**
     * Metodo hacer ruido.
     */
    public void hacerSonido(){
        System.out.println("El animal hace sonido.");
    }

    /**
     * Metodo comer.
     */
    public void comer(){
        System.out.println("El animal come.");
    }

    /**
     * Metodo dormir.
     */
    public void dormir(){
        System.out.println("El animal duerme.");
    }
}

/**
 * Clase Mamifero que hereda de Animal.
 */
class Mamifero extends Animal{

    /**
     *Metodo amamanta.
     */
    public void amamantar(){
        System.out.println("El mamifero amamanta.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El mamifero hace un sonido.");
    }
}

/**
 * Clase Ave que hereda de Animal.
 */
class Ave extends Animal{

    /**
     * Metodo volar.
     */
    public void vuela(){
        System.out.println("El ave vuela.");
    }

}

/**
 * Clase Gato que hereda de Mamifero.
 */
class Gato extends Mamifero{

    /**
     * Metodo hacer sonido.
     */

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }

    public void corre(){
        System.out.println("El gato está corriendo...");
    }
}

/**
 * Clase Perro que hereda de Mamifero
 */
class Perro extends Mamifero{

    /**
     * Metodo hacer sonido
     */
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    /**
     * Metodo saltar.
     */
    public void salta(){
        System.out.println("El perro esta saltando.");
    }
}

// Clase Canario (hereda de Ave)
class Canario extends Ave {
    public void cantar() {
        System.out.println("El canario está cantando.");
    }

    // Sobrescribimos el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El canario canta melodiosamente.");
    }

    public void volar() {
        System.out.println("El canario está volando en su jaula.");
    }
}

// Clase Pinguino (hereda de Ave)
class Pinguino extends Ave {
    public void nadar() {
        System.out.println("El pingüino está nadando.");
    }

    // Sobrescribimos el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El pingüino hace un sonido característico.");
    }

    public void caminar() {
        System.out.println("El pingüino está caminando torpemente.");
    }
}

// Clase Lagarto (hereda de Animal)
class Lagarto extends Animal {
    public void tomarSolecito() {
        System.out.println("El lagarto está tomando el sol.");
    }

    // Sobrescribimos el método hacerSonido
    @Override
    public void hacerSonido() {
        System.out.println("El lagarto hace un sonido suave.");
    }

    public void escabullirse() {
        System.out.println("El lagarto está escabulléndose rápidamente.");
    }
}
