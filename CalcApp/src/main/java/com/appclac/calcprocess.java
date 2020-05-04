package com.appclac;

import java.util.Scanner;

public class calcprocess {

	public static void main(String[] args) {

       
        
        
       
        boolean run = true;
       
        while (run) {

       
            System.out.println("=====================================");
            System.out.println("               Calculator            ");
            System.out.println("=====================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Exit");
            System.out.printf("Please pick an operation(1-5): ");
            Scanner scanner = new Scanner(System.in);
             int operation = scanner.nextInt();
             double number1, number2;
             if(operation == 5)
             {
            	 System.out.println("you are exited");
            	 run=false;
            	 break;
             }
            
             
             System.out.println("Enter first number");
             number1 = scanner. nextDouble();

             System.out.println("Enter second number");
             number2 = scanner. nextDouble();

             calcprocess doCalcprocess=new calcprocess();
             doCalcprocess.doMath(operation, number1, number2);        
        }
    }
        
        
        public void doMath(int Mathoperation, double number1, double number2){
        	   switch (Mathoperation)  
        	   {
        	     case 1:
        	     System.out.println("Your answer is " + add(number1, number2));
        	     break;

        	     case 2:
        	     System.out.println("Your answer is " + sub(number1, number2));
        	     break;

        	     case 3:
        	     System.out.println("Your answer is " + div(number1, number2));
        	     break;

        	     case 4:
        	     System.out.println("Your answer is " + mul(number1, number2));
        	     break;

        	     default:
        	     System.out.println("");      
        	   }   
        	 }
	
        
        public double add(double number1, double number2){
        	   return number1 + number2;
        	 }
        	 public double sub(double number1, double number2){
        	   return number1 - number2;
        	 }
        	 public double mul(double number1, double number2){
        	   return number1 * number2;
        	 }
        	 public double div(double number1, double number2){
        	   return number1 / number2;
        	 }

}
