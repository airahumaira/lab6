/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humaira
 */
public class Lab6_act5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int building = 1;
        
        while (building <= 20){
            int apartment = 1;
             
            while (apartment <= 15){
                int month = 1;
                
                while (month <= 12) {
                    String monthName = getMonthName(month);
                    String rentDueDate = getDueDate(month);
                    
                    System.out.println("Payment Coupon for: " + monthName);
                    System.out.println("Building Number: " + building + "Unit Number:  " + apartment);
                    System.out.println("Amount of Rent: RM 800.00");
                    System.out.println("Rent Due: " + rentDueDate);
                    System.out.println("********");
                    
                    month++;
                }
                apartment++;
            }
            building++;
        }
        
    }
    public static String getMonthName(int month){
        return switch (month) {
            case 1 -> "JANUARY";
            case 2 -> "FEBRUARY";
            case 3 -> "MARCH";
            case 4 -> "APRIL";
            case 5 -> "MAY";
            case 6 -> "JUNE";
            case 7 -> "JULY";
            case 8 -> "AUGUST";
            case 9 -> "SEPTEMBER";
            case 10 -> "OCTOBER";
            case 11 -> "NOVEMBER";
            case 12 -> "DECEMBER";
            default -> "";
        };
    }
    public static String getDueDate(int month){
        return switch (month) {
            case 1 -> "31/1/2016";
            case 2 -> "28/2/2016";
            case 3 -> "31/3/2016";
            case 4 -> "30/4/2016";
            case 5 -> "31/5/2016";
            case 6 -> "30/6/2016";
            case 7 -> "31/7/2016";
            case 8 -> "31/8/2016";
            case 9 -> "30/9/2016";
            case 10 -> "31/10/2016";
            case 11 -> "30/11/2016";
            case 12 -> "31/12/2016";
            default -> "";
        };
        
    } 
    
}

