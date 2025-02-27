package POO_EjerciciosRepaso.Ej3_Repaso;

import java.util.Random;

public class Password {

    /**
     * Atributos de la clase Password.
     */
    private int longitud = 8;
    private String password;

    /**
     * Constructor por defecto.
     */
    public Password(){
    }

    /**
     * Constructor que le asigna una longitud y genera una contraseña con esa longitud..
     * @param longitud Longitud de la contraseña.
     */
    public Password(int longitud){
        this.longitud = longitud;
        this.password = generarPassword();
    }

    /**
     * Metodo que genera una contraseña dependiendo de la longitud de la instancia.
     * @return Contraseña generada.
     */
    public String generarPassword(){
        //Variable caracteres donde se almacenan los caracteres disponibles para generar una contraseña.
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789";

        Random random = new Random();

        //StringBuilder donde se irán guardando un caracter hasta llegar a la longitud deseada.
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            //Por cada iteración se irá almacenando en sb un caracter de la variable caracteres de manera aleatoria.
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return sb.toString();
    }

    /**
     * Getter para obtener el valor de la longitud de la contraseña.
     * @return Longitud de la contraseña.
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Getter para obtener el valor de la contraseña.
     * @return La contraseña.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter para asiganr un nuevo valor a la longitud.
     * @param longitud Nueva longitud de la contraseña.
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Metodo para comprobar si la contraseña es fuerte segun si tiene:
     * Más de 2 mayúsculas.
     * Más de 1 minúscula.
     * Más de 5 números
     * @return True si es fuerte, false si es débil.
     */
    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        //Paso password a un array de carácteres para que comprobemos con Chararcter.isUpperCase, isLowerCase o isDigit.
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }

        if (mayusculas > 2 && minusculas >1 && numeros > 5){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Metodo que devuelve un mensaje dependiendo se la contraseña es fuerte o débil.
     * @return Mensaje del nivel de seguridad de la contraseña.
     */
    public String seguridadPassword(){
        if (esFuerte()){
            return "Contraeña fuerte.";
        }else {
            return "Contraseña débil.";
        }
    }

    /**
     * Metodo para mostrar la información de la contraseña.
     * @return Información contraseña.
     */
    @Override
    public String toString() {
        return "Contraseña: "+getPassword()+
                "\nSeguridad: "+seguridadPassword();
    }
}
