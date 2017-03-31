package main;

import fizzbuzz.FizzBuzz;

public class Application {
    
    public static void main(String args[]){
        FizzBuzz fizzBuzz = new FizzBuzz();
        
        System.out.println("Até 20: ");
        System.out.print(fizzBuzz.gerarResultado(20));
        
        System.out.println("Até 100: ");
        System.out.print(fizzBuzz.gerarResultado(100));
        
    }
}
