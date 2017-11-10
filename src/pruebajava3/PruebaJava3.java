/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava3;
import interfaces.Interfaz;
import javax.swing.JFrame;
/**
 * Claudia Millan Lopez
 * @author lab12
 * Fecha: 10 de Noviembre de 2017
 * Programa: PruebaJava3
 * Responsabilidad: Conexion de Escritorio
 */
public class PruebaJava3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
   
      Interfaz w = new Interfaz();
      w.setVisible(true);
      w.setBounds(0, 0, 400, 400);
      w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}