package poo;

public class Coche {
    //Las propiedades están encapusuladas, lo que hace que no se pueda modificarlos si no es desde un metodo de la propia clase.
    //Atributos o propiedades.
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    //Estos atributos pueden variar dependiendo del coche.
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    //Metodo constructor. Este metodo lo que hace es inicializar los atributos de la clase
     public Coche(){
         ruedas = 4;
         largo = 2000;
         ancho = 300;
         motor = 1600;
         peso_plataforma = 500;
     }

     public String getDatosGenerales(){
         return "La plataforma del vehículo tiene "+ruedas+" ruedas. Mide " + largo/1000+" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+
                 peso_plataforma+ " kg";
     }
    //En principio vamos a poner que todos son de color azul.

     public void setColor(String color_coche){
         this.color = color_coche;
     }

     public String getColor(){
         return "El color del coche es "+color;
     }

     public void setAsientos_cuero(String asientos_cuero){  //SETTER
         if (asientos_cuero.equalsIgnoreCase("si")){
             this.asientos_cuero = true;
         }else {
             this.asientos_cuero = false;
         }
     }

     public String getAsientos_cuero(){
         if (asientos_cuero==true){
             return "El coche tiene asientos de cuero.";
         }else {
             return "El coche no tiene asientos de cuero.";
         }
     }

     public void setClimatizador(String climatizador){
         if (climatizador.equalsIgnoreCase("si")){
             this.climatizador = true;
         }else {
             this.climatizador = false;
         }
     }

     public String getClimatizador(){
         if (climatizador==true){
             return "El coche incorpora climatizador";
         }else {
             return "El coche no incorpora climatizador.";
         }
     }

     public String dimePesoTotal(){      //SETTER + GETTER
         int peso_carroceria = 500;
         peso_total = peso_plataforma + peso_carroceria;

         if (asientos_cuero == true){
             peso_total = peso_total+50;
         }
         if (climatizador == true) {
             peso_total = peso_total + 20;
         }
         return "El peso del coche es "+peso_total;
     }

     public int precioCoche(){
         int precio_final = 10000;
         if (asientos_cuero==true){
             precio_final += 2000;
         }
         if (climatizador==true){
             precio_final +=1500;
         }
         return precio_final;
     }
}
