/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.*;

/**
 *
 * @author Estudiantes
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int[] array = {0, 1, 2};
//        System.out.println("_Excepción tipo de entrada_");
//        try {
//            Scanner sc = new Scanner(System.in);
//            sc.nextInt();
//
//        } catch (InputMismatchException a) {
//            System.out.println("Digite un entero");
//        }
//        System.out.println("\n_Excepeción desborde array_");
//        try {
//            System.out.println(array[3]);
//        } catch (IndexOutOfBoundsException b) {
//            System.out.println("La posición ingresada no existe");
//        }
//        System.out.println("\n_Excepeción Aritmetica_");
//        try {
//            int b = 1;
//            b=1/0;
//        } catch (ArithmeticException c) {
//            System.out.println("No se puede dividir por 0");
//        }
        System.out.println("\n_Excepeción conversión de formato_");
        try {
            String s = " a";
            int a;
            a = Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException d) {
            System.out.println("La cadena no se puede convertir");
        }
        try{
            
        }
        catch(){
            
        }
    }

}
