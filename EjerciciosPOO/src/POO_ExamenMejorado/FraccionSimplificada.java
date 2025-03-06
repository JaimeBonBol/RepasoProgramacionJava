package POO_ExamenMejorado;

public class FraccionSimplificada extends Fraccion {

    public FraccionSimplificada(int num, int den) {
        super(num, den);
    }

    public FraccionSimplificada() {
        this.num = 0;
        this.den = 1;
    }

    public FraccionSimplificada(int num) {
        super(num);
        this.den = 1;
    }

    /**
     * Metodo para calcular el mcd de una Fracción.
     * @return Mcd.
     */
    private int mcd(){
        int u = Math.abs(num);
        int v = Math.abs(den);
        while (v != 0){
            int r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public FraccionSimplificada simplificar(){
        int numSimplificada = this.num / mcd();
        int denSimplificada = this.den / mcd();

        FraccionSimplificada fraccionSimplificada = new FraccionSimplificada(numSimplificada, denSimplificada);

        return fraccionSimplificada;
    }

}
