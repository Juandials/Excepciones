/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        int[] array = {0, 1, 2};
        System.out.println("_Excepción tipo de entrada_");
        try {
            Scanner sc = new Scanner(System.in);
            sc.nextInt();

        } catch (InputMismatchException a) {
            System.out.println("Digite un entero");
        }
        System.out.println("\n_Excepeción desborde array_");
        try {
            System.out.println(array[3]);
        } catch (IndexOutOfBoundsException b) {
            System.out.println("La posición ingresada no existe");
        }
        System.out.println("\n_Excepeción Aritmetica_");
        try {
            int b = 1;
            b = 1 / 0;
        } catch (ArithmeticException c) {
            System.out.println("No se puede dividir por 0");
        }
        System.out.println("\n_Excepeción conversión de formato_");
        try {
            String s = " a";
            int a;
            a = Integer.parseInt(s);
            System.out.println(a);
        } catch (NumberFormatException d) {
            System.out.println("La cadena no se puede convertir");
        }
        System.out.printLn("\n_Excepción desborde de memoria_");        
        Excepciones a = new Excepciones();
        try {
            a.go();
        } catch (StackOverflowError e) {
            System.out.println("Uy, nos hemos quedado sin RAM");
        }
        System.out.println("\n_Exepción puntero null_");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException f) {
            System.out.println("Puntero en null :v");
        }
        System.out.println("\n_Exepción tamaño de arreglo negativo_");
        try{
            int [] a = new int[-3];
        }
        catch(NegativeArraySizeException g){
            System.out.println("El tamaño del arreglo es negativo :v");
        }
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("text.json"));
        } catch (FileNotFoundException h) {
            System.out.println("No existe archivo de texto");
        }
        try{
            Integer a = null;
            System.out.println(a/2);
        }
        catch(NullPointerException i){
            System.out.println("La variable no tiene un valor definido");
        }
    }

}
