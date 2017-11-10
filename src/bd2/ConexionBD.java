/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Claudia Millan Lopez
 * @author lab12
 * Fecha: 10 de Noviembre de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Conexion de Escritorio
 */
public class ConexionBD 
{
    //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3336/PruebaJava3";
    
    //PASO 12 - COSTRUCTOR DE LA CLASE
    public ConexionBD()
    {
        conex = null;//Inicializar la variable 
        
        //Metodo para manejar excepciones
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Conexion tuvo exito");
        }
    }
    
    //PASO 13 - DEFINICION METODOS PARA CONECTAR Y DESCONECTAR
    public Connection conectar()
    {
        return conex;//Retorna el objeto conex  
    }
    
    public void desconectar()
    {
      conex=null;
        if (conex==null) 
        {
          System.out.println("Conexion Finalizada");
        }
    }
}

