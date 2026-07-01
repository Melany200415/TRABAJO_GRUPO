package org.example.crud_electrodomesticos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion  {

       private static final String Url = "jdbc:mysql://localhost:3306/db_electrodomesticos";
    private static final   String user = "root";
    private static final String password = "root";
    public static Connection getConexion(){
            Connection conexion = null;
            try {
             conexion= DriverManager.getConnection(Url ,user,password);
             System.out.println("Conectado la database");

            } catch (SQLException e) {
                System.out.printf("Error al conectar la database: %s\n",e.getMessage());
            }

            return conexion;
        }

}

