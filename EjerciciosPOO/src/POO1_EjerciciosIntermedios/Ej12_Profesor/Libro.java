package POO1_EjerciciosIntermedios.Ej12_Profesor;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado = false;

    public Libro(String isbn, String titulo, int anio) {
        super(isbn, titulo, anio);
    }

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("El libro está prestado");
        } else {
            this.prestado = true;
            System.out.println("Libro entregado...");
        }
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        String estadoPrestado;
        if (this.prestado) {
            estadoPrestado = "prestado";
        } else {
            estadoPrestado = "no prestado";
        }
        return super.toString() + " (" + estadoPrestado + ") ";
    }
}
