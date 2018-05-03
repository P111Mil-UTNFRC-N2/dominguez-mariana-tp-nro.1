/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_TP1;

import java.util.Scanner;

/**
 *
 * @author Mariana Dominguez
 */
public class Ejercicio2_TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Ingrese el código ISBN");
        String dato = leerDato.nextLine();
        int contador = 10;
        int acumulador = 0;
        for (int i = 0; i < dato.length(); i++) {
            char caracter = dato.charAt(i);
            if (caracter != '-') {
                int numero = Character.getNumericValue(caracter);
                acumulador = acumulador + numero * contador;
                contador = contador - 1;
            }
        }
        int resto = acumulador % 11;
        if (resto == 0) {
            System.out.println("El código ingresado ES válido");
        } else {
            System.out.println("El código ingresado NO ES válido");
        }
    }
}
