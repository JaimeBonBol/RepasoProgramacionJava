package BBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertarUsuario {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduce contraseña: ");
            String pass = sc.nextLine();

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_demo", "root", pass);
            System.out.println("Conexión correcta");

            String sql = "INSERT INTO usuarios(nombre, email) VALUES(?,?)";

            /*PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, "Carlos");
            statement.setString(2, "carlos@gmail.com");
            statement.setString(1, "Marta");
            statement.setString(2, "marta@gmail.com");
            statement.setString(1, "Pepe");
            statement.setString(2, "pepe@gmail.com");

             */

            PreparedStatement statement = connection.prepareStatement(sql);

            System.out.println("Inserta cuántos usuarios quiere ingresar: ");
            int usuarios = sc.nextInt();

            for (int i = 0; i < usuarios; i++) {
                System.out.println("Introduce nombre:");
                String nombre = sc.next();
                System.out.println("Introduce email:");
                String email = sc.next();

                statement.setString(1, nombre);
                statement.setString(2, email);
                statement.execute();

            }

            System.out.println("Registro insertado");
            connection.close();

        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
