package poo;

public class Coche {
    //Atributos o propiedades.
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    //Estos atributo spueden variar dependiendo del coche.
    String color;
    int peso_total;
    boolean asientos_cuero, climatizador;

    //Metodo constructor.
     public Coche(){
         ruedas = 4;
         largo = 2000;
         ancho = 300;
         motor = 1600;
         peso_plataforma = 500;
     }

     public String getLargo(){
         return "El largo del coche es "+largo;
     }
    //En principio vamos a poner que todos son de color azul.
     public void setColor(){
         color = "azul";
     }

     public String getColor(){
         return "El color del coche es "+color;
     }
}
