package POO2_Ejercicios.Ej7;

public class Rectangulo extends Figura{

        private int base;
        private int altura;

        public Rectangulo(int base, int altura){
            this.base = base;
            this.altura = altura;
        }

    @Override
    public double calcularArea() {
        return base * altura;
    }

}
