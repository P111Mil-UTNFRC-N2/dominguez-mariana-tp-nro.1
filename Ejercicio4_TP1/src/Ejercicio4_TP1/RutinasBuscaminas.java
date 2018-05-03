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
public class RutinasBuscaminas {

    public static void crearMatriz(int fil, int col) {

        char caracter;
        int i = fil;
        int j = col;
        char[][] matriz = new char[i][j];
        Scanner leerSecuencia = new Scanner(System.in);
        System.out.println("Por favor, ingrese los caracteres de la matriz");

        System.out.println("Asterisco (*) para indicar la posición de las minas y punto (.) para el resto\n");
        for (i = 0; i < fil; i++) {

            System.out.print("Fila N° " + (i + 1) + ": ");
            String secuencia = leerSecuencia.nextLine();
// A continuación verifica que el número de columnas ingresado sea correcto
            while (secuencia.length() != col) {
                System.out.println("Ingrese " + col + " columnas");
                secuencia = leerSecuencia.nextLine();
            }
            for (j = 0; j < col; j++) {
                caracter = secuencia.charAt(j);
                matriz[i][j] = caracter;
            }
            System.out.println(" ");
        }
//Mostrar Matriz
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
/*Buscar Minas
        for (i = 0; i < fil; i++) {
            for (j = 0; j < col; j++) {
                                
                /*
                switch (matriz[i][j]) {
            case '.':
                System.out.println("El resultado de la suma es: " + (valor1 + valor2));
                break;
            case '*':
                System.out.println("El resultado de la resta es: " + (valor1 - valor2));
                break;
            default:
                System.out.println("El operador que eligió no es correcto");
        }
                */
    }
}
