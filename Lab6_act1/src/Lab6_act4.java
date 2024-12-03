/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Humaira
 */
public class Lab6_act4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int years = 10;
        double initialTuition = 4000.00;
        double increaseRate = 0.05;
        
        double futureTuition = initialTuition;
        int yearCounter = 0;
        
        while (yearCounter < years){
            futureTuition += futureTuition * increaseRate;
            yearCounter++;
        }
       System.out.printf("Tuition fee after %d years: RM%.2f\n", years, futureTuition);
       
       int semesterCounter = 0;
       double totalCost = 0; 
       double currentTuition = initialTuition;
       
       while (semesterCounter < 4){
           totalCost += currentTuition;
           currentTuition += currentTuition * increaseRate;
           semesterCounter++;
       }
       
       System.out.println(String.format("Total cost for 4 years starting from now: RM%.2f", totalCost));
       
        
        
        
        
    }
    
    
}
