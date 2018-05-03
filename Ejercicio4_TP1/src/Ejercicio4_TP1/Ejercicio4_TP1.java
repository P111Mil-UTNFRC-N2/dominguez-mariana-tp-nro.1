/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_TP1;
import java.util.Scanner;
/**
 *
 * @author Mariana Dominguez
 */
public class Ejercicio4_TP1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         Scanner leerDato = new Scanner(System.in);

        System.out.println("Ingrese el Nro. de FILAS que tendrá su matriz: ");
        int filas = leerDato.nextInt();
        System.out.println("Ingrese el Nro. de COLUMNAS que tendrá su matriz: ");
        int columnas = leerDato.nextInt();
        
        RutinasBuscaminas.crearMatriz(filas, columnas);
    }
    
}