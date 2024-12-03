/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humaira
 */
public class Lab6_act2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int kilogram = 1; 
       double pound = 0;
       
       
       System.out.printf("%-10s %-10s%n", "Kilograms", "Pounds");
       System.out.println("*****************");
     
       while (kilogram <= 200) {
           pound = kilogram * 2.2;
           System.out.printf("%-10d %-10.1f%n", kilogram, pound);
           
           kilogram +=2;
       }
       
    }
    
}
