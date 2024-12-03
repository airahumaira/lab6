
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humaira
 */
public class Lab6_act3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int first, second;
       Scanner scan = new Scanner(System.in);
       do{
           System.out.println("Enter first integer: ");
           first = scan.nextInt();
           System.out.println("Enter second integer: ");
           second = scan.nextInt();
           
           
           if (first >= second)
               System.out.println("Error occured: First number must be less than second number");
           
       }while (first >= second);
       
       System.out.println(" Odd number between " + first + " and " + second + " second number " );
       int testNumber = first;
       while (testNumber <= second){
           if (testNumber%2 !=0){
               System.out.println(" "+testNumber);
               //System.out.println();
           }
           testNumber++;
       }
       System.out.println("Even number between "+ first + " and " + second + " second number ");
       testNumber = first;
       while (testNumber <= second){
           if (testNumber%2 == 0){
               System.out.println(" "+testNumber);
               //System.out.println();
           }
           testNumber++;
       }
    }
}
