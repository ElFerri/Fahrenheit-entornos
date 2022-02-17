/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioentornosfahrenheit;

import java.util.Scanner;

/**
 *
 * @author fersan
 */
public class EjercicioEntornosFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static int heittocelsius(double db) {
        Scanner sc = new Scanner(System.in);
        db = sc.nextDouble();
        double db2 = (db * 9 / 5) + 32;
        
    }

    public static double cenlsiusfahrenheit(double degrees) {
        double result = degrees;
        result = result * 2 - result / 5;
        result = result + 32;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double db;
        double degrees;
        System.out.println("De Farenheing a celsius, introduze un numero" );
        db = sc.nextDouble();
         System.out.println("De celsius a Farenheing, introduze un numero:");
         degrees = sc.nextDouble();
        
        System.out.println("De Farenheing a celsius" +db2);
        System.out.println("De celsius a Farenheing" +result);
        
    }

}
