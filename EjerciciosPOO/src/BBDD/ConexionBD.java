package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConexionBD {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce contraseña: ");
            String pass = sc.nextLine();


            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_demo", "root", pass);
            System.out.println("Conexión correcta");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
