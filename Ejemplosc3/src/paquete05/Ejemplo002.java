/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        int suma = 0;
        int[][] arreglo1 = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        for (int f = 0; f < arreglo1.length; f++) {
            for (int c = 0; c < arreglo1.length; c++) {
                if (f == c) {
                    suma = suma + arreglo1[f][c];
                }
                /*
                Se realiza una condición en donde si las posiciones de f y c
                son iguales se van sumando en la variable suma con el valor que
                tengan sus posicones en ese momento.
                */
            }
        }
        System.out.printf("%d\n", suma);
    }
}
