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
            if(getIfNumberIsAMultipleOf3And5OrHas3And5OnIt(cont)) {
                numberList += "FizzBuzz";
            } else if(getIfNumberIsAMultipleOf3OrHas3OnIt(cont)){
                numberList += "Fizz";
            } else if(getIfNumberIsAMultipleOf5OrHas5OnIt(cont)) {
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
    
    private boolean getIfNumberHas3OnIt(int number){
        return String.valueOf(number).contains("3");
    }
    
    private boolean getIfNumberHas5OnIt(int number){
        return String.valueOf(number).contains("5");
    }
    
    
    private boolean getIfNumberIsAMultipleOf3And5(int number){
        return ((number % 3) == 0 && (number % 5) == 0);
    }
        
    private boolean getIfNumberHas3And5OnIt(int number){
        return (String.valueOf(number).contains("3") && String.valueOf(number).contains("5"));
    }
    
    
    private boolean getIfNumberIsAMultipleOf3And5OrHas3And5OnIt(int number){
        return (getIfNumberIsAMultipleOf3And5(number) || getIfNumberHas3And5OnIt(number));
    }
    
    private boolean getIfNumberIsAMultipleOf3OrHas3OnIt(int number){
        return (getIfNumberIsAMultipleOf3(number) || getIfNumberHas3OnIt(number));
    }
    
    private boolean getIfNumberIsAMultipleOf5OrHas5OnIt(int number){
        return (getIfNumberIsAMultipleOf5(number) || getIfNumberHas5OnIt(number));
    }
}
