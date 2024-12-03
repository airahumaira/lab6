/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6_act1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab6_act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integer_number, number_sum = 0, count_positive = 0, count_negative = 0, count = 0;
       double average; 
       Scanner scan = new Scanner (System.in);
       
       System.out.print("enter integer number: ");
       integer_number = scan.nextInt();
       
       while(integer_number != 0){
           if (integer_number > 0){
               count_positive = count_positive + 1;
           }else{ 
               count_negative = count_negative + 1;
           }
        
        number_sum = number_sum + integer_number;
        count++;
        
        System.out.println("Enter integer number:");
        integer_number = scan.nextInt();
       }
       
       average = number_sum / count;
       System.out.println("Total of positive number: " + count_positive);
       System.out.println("Total of negative number: " + count_negative);
       System.out.println("Total sum of all number:" + number_sum);
       System.out.println("Average: %.2f" + average);
    }
    }
    

