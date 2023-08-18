/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenamiento;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ordenamiento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] numeros = new int[5];
        
        
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el numero: ");
            numeros[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < numeros.length - 1; i++){
            for(int j = 0; j < numeros.length - i - 1; j++){
                if(numero[j] > numeros[j + 1]);
            }
        }
    }
}
