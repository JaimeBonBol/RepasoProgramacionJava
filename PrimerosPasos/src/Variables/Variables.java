package Variables;

public class Variables {
    public static void main(String[] args) {
        //Constante.
        final double apulgadas=2.54;

        double cm=6;

        double resultado= cm / apulgadas;

        System.out.println("En  "+cm+" centímetros hay "+resultado+" pulgadas");

        float num=5.54F;

        //Manipulación de cadenas.

        String nombre = "Jaime";
        System.out.println("Mi nombre es "+nombre);

        System.out.println("Mi nombre tiene "+nombre.length()+" letras.");
        System.out.println("La primera letra de "+nombre+" es la "+nombre.charAt(0));

        int ultima_letra;
        ultima_letra=nombre.length();
        System.out.println("La ultima letra de "+nombre+" es la "+nombre.charAt(ultima_letra-1));

        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        System.out.println(frase);

        String frase_resumen = frase.substring(29,57);
        System.out.println(frase_resumen);





    }
}
