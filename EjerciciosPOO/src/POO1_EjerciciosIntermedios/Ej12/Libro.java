package POO1_EjerciciosIntermedios.Ej12;

public class Libro extends Publicacion implements Prestable{
    /**Atributos propio de la clase Libro.
     */
    private boolean prestado;

    public Libro(String ISBN, String titulo, int agnoPublicacion){
        super(ISBN, titulo, agnoPublicacion);
        this.prestado = false;
    }


    @Override
    public void presta(){
        if (this.prestado == true){
            System.out.println("Lo siento, el libro '"+this.titulo+"' ya está prestado.");
        }else {
            this.prestado = true;
            System.out.println("EL libro '"+this.titulo+"' ha sido prestado correctamente.");
        }

    }

    @Override
    public void devuelve() {
        if (this.prestado == true){
            this.prestado = false;
            System.out.println("El libro '"+this.titulo+"' ha sido devuelto correctamente.");
        }

    }

    @Override
    public String estaPrestado() {
        if (this.prestado==true){
            return  "EL libro está prestado.";
        }else {
           return "EL libro no está prestado";
        }
    }

    public String toString() {
        return "ISBN: "+this.ISBN+". Titulo: "+this.titulo+". Año de publicación: "+this.agnoPublicacion+". "+estaPrestado();
    }
}
