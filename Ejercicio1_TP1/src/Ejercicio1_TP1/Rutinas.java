/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_TP1;

/**
 *
 * @author Mariana Dominguez
 */
public class Rutinas {

    //Figura 1 cuadrada
    /**
     * @param fila
     * @param columna *
     */
    public static void figura_1(int fila, int columna) {
        System.out.println("Figura 1\n");
        String[] fila_Figura1 = new String[fila];
        String[] columna_Figura1 = new String[columna];

        for (int i = 0; i < fila; i++) {
            fila_Figura1[i] = "* ";
            for (int c = 0; c < columna; c++) {
                columna_Figura1[c] = "* ";
                System.out.print(columna_Figura1[c]);
            }
            System.out.println(fila_Figura1[i]);
        }
        System.out.println(" ");
    }

    //Figura 2 Alternados
    public static void figura_2(int fila, int columna) {
        System.out.println("Figura 2\n");

        String[] fila_Figura2 = new String[fila];
        String[] columna_Figura2 = new String[columna];

        for (int i = 0; i < fila; i++) {
            fila_Figura2[i] = "*";
            for (int c = 0; c < columna; c++) {
                columna_Figura2[c] = "* ";
                System.out.print(columna_Figura2[c]);
            }
            System.out.println(fila_Figura2[i]);
            if (i % 2 == 0) {
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }

//Figura 3 Triángulo rectángulo
    public static void figura_3(int fila, int columna) {

        System.out.println("Figura 3\n");

        String[] fila_Figura3 = new String[fila];
        String[] columna_Figura3 = new String[columna];

        for (int i = 0; i < fila; i++) {
            fila_Figura3[i] = "* ";
            for (int c = 0; c < i; c++) {
                columna_Figura3[c] = "* ";
                System.out.print(columna_Figura3[c]);
            }
            System.out.println(fila_Figura3[i]);
        }
    }

    //Figura 4 Triángulo isóseles
    public static void figura_4(int fila, int columna) {

        System.out.println("Figura 4\n");

        String[] fila_Figura4 = new String[fila];
        String[] columna_Figura4 = new String[columna];

        for (int i = 0; i < fila; i++) {
            fila_Figura4[i] = "* ";
            for (int c = 0; c < i; c++) {
                columna_Figura4[c] = "* ";
                System.out.print(columna_Figura4[c]);
            }
            System.out.println(fila_Figura4[i]);
        }
        
        for (int i = columna - 1; i > 0; i--) {
            fila_Figura4[i] = "* ";
            for (int c = 0; c < i-1 ; c++) {
                columna_Figura4[c] = "* ";
                System.out.print(columna_Figura4[c]);
            }
            System.out.println(fila_Figura4[i]);
        }
    }

}
