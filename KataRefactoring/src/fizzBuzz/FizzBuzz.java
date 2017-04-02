package fizzBuzz;

public class FizzBuzz {
    
    public String generateSampleNumbersList(int lastNumber){
        String numberList = "";
        for(int cont = 1; cont <= lastNumber; cont++){
            if(getIfNumberIsAMultipleOf3And5(cont)) {
                numberList += "FizzBuzz";
            } else if(getIfNumberIsAMultipleOf3(cont)){
                numberList += "Fizz";
            } else if(getIfNumberIsAMultipleOf5(cont)) {
                numberList += "Buzz";
            } else {
                numberList += cont;
            }
            
            numberList += "\n";
        }
        return numberList;
    }
    
    public String generateNumbersListWithNewRequirements(int lastNumber){
                String numberList = "";
        for(int cont = 1; cont <= lastNumber; cont++){
            if(getIfNumberIsAMultipleOf3And5(cont) || getIfNumberHas3And5OnIt(cont)) {
                numberList += "FizzBuzz";
            } else if(getIfNumberIsAMultipleOf3(cont) || getIfNumberHas3OnIt(cont)){
                numberList += "Fizz";
            } else if(getIfNumberIsAMultipleOf5(cont) || getIfNumberHas5OnIt(cont)) {
                numberList += "Buzz";
            } else {
                numberList += cont;
            }
            
            numberList += "\n";
        }
        return numberList;
    }
    
    private boolean getIfNumberIsAMultipleOf3(int number){
        return (number % 3) == 0;
    }
    
    private boolean getIfNumberIsAMultipleOf5(int number){
        return (number % 5) == 0;
    }
    
    private boolean getIfNumberIsAMultipleOf3And5(int number){
        return ((number % 3) == 0 && (number % 5) == 0);
    }
    
    private boolean getIfNumberHas3OnIt(int number){
        return String.valueOf(number).contains("3");
    }
    
    private boolean getIfNumberHas5OnIt(int number){
        return String.valueOf(number).contains("5");
    }
    
    private boolean getIfNumberHas3And5OnIt(int number){
        return (String.valueOf(number).contains("3") && String.valueOf(number).contains("5"));
    }
    
}
