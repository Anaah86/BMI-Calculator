/*
 * This program will output a BMI(Body Mass Index )calculator.
   Where height and weight can be inserted and and BMI will be calculated in kgm2
   It will also output  if the BMI is underweight or normal oroverweight or obese.

 * Name : Anaah Mohamed Farook
 

 */
package bmicalculator;

import java.util.Scanner; // make the object scanneer

public class BMIcalculator { // class

   
    public static void main(String[] args) { //main method
        System.out.println("*****BODY MASS INDEX CALCULATOR*****");
        
        //To ask the user for input the height in meters
        Scanner height = new Scanner(System.in);
        System.out.println("Enter your height in meters: " );
        Double h = height.nextDouble(); // value given to the object height
        
        
        //To ask the user for input the weight in kg 
        Scanner weight = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: " );
        Double w = weight.nextDouble(); // value given to the object weight
        
        double BMI=  ((w/(h*h))); // calculation for BMI (user input height is timesed by height then devided by user input weight)
        
        System.out.println("Your Body Mass Index is:" + BMI + "kgm2" );  //output of BMI
        
        
        //if statement is used to do the selection to determine the catogerythat the BMI of the user falls
        if (BMI<18.5){  //BMI is less than 18.5 then 
            System.out.println("You are underweight!");       
        }
        
        else if (BMI<=24.9){ //if BMI is less than or equal to 24.9 then 
            System.out.println("Your Body Mass Index is normal.");
        }
        
        else if (BMI<=29.9){ //if BMI is less than or equal to 29.9 then 
            System.out.println("You are overweight!");
        }
        
        else { //if BMI is greater than 30.0 then 
        System.out.println("You are obese!");
        }
        
    } //end of main method
    
} //end of class
