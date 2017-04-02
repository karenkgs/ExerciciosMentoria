package main;

import fizzBuzz.FizzBuzz;

public class Main {
   public static void main(String[] args){
       FizzBuzz fizzBuzz = new FizzBuzz();
       System.out.println("Sample List: \n" + fizzBuzz.generateNumbersListWithNewRequirements(100));
       System.out.println("List with new Requirements: \n" + fizzBuzz.generateNumbersListWithNewRequirements(100));
   } 
}
