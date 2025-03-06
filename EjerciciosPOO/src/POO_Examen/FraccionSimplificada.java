package POO_Examen;

public class FraccionSimplificada extends Fraccion{

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

    @Override
   public FraccionSimplificada suma(Fraccion fraccion) {
        int numSuma = (this.num * fraccion.den) + (this.den * fraccion.num);
        int denSuma = (this.den * fraccion.den);

        FraccionSimplificada fraccionSuma = new FraccionSimplificada(numSuma, denSuma);

        return fraccionSuma;
    }

    @Override
    public FraccionSimplificada restar(Fraccion fraccion) {
        int numResta = (this.num * fraccion.den) - (this.den * fraccion.num);
        int denResta = (this.den * fraccion.den);

        FraccionSimplificada fraccionResta = new FraccionSimplificada(numResta, denResta);

        return fraccionResta;
    }

    @Override
    public FraccionSimplificada multiplicar(Fraccion fraccion) {
        int numMult = (this.num * fraccion.num);
        int denMult = (this.den * fraccion.den);

        FraccionSimplificada fraccionMultiplicacion = new FraccionSimplificada(numMult, denMult);

        return fraccionMultiplicacion;
    }

    @Override
    public FraccionSimplificada dividir(Fraccion fraccion) {
        int numDiv = (this.num * fraccion.den);
        int denDiv = (this.den * fraccion.num);

        FraccionSimplificada fraccionDivision = new FraccionSimplificada(numDiv, denDiv);

        return fraccionDivision;
    }
}
