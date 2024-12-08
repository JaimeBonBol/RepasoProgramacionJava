package POO1_EjerciciosIntermedios.Ej15;

public class FichaDomino {
    /**
     * Atributos de la clase FichaDomino.
     */
    protected int numero1;
    protected int numero2;

    /**
     * Constructor de la clase Fichadomino.
     * @param numero1
     * @param numero2
     */
    public FichaDomino(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * Metodo toString de donde muestra los números de la ficha cada uno en su posición.
     * @return
     */
    @Override
    public String toString() {
        if (this.numero1 == 0){
            return "[ |"+numero2+"]";
        }
        else if (this.numero2 == 0){
            return"["+ numero1+"| ]";
        }
        else {
            return "["+numero1+"|"+numero2+"]";
        }
    }

    /**
     * Metodo para voltear una ficha, donde muestra la ficha con sus dos posiciones pero intercambiadas.
     * @return
     */
    public String  voltea(){
        if (this.numero1 == 0){
            return"["+this.numero2+"|"+" ]";
        }
        else if (this.numero2 == 0){
            return"[ "+"|"+this.numero1+"]";
        }
        else {
            return"["+this.numero2+"|"+this.numero1+"]";
        }

    }

    /**
     * Metodo para saber si una ficha encaja con otra.
     * @param f
     * @return
     */
    public boolean encaja(FichaDomino f){
        if (this.numero1 == f.numero1 || this.numero1 == f.numero2 || this.numero2 == f.numero1 || this.numero2 == f.numero2){
            return true;
        }else {
            return false;
        }
    }
}
