package fizzbuzz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class FizzBuzz {
    private String retorno = "";
    
    String gerarResultado(int i) {
        
        for(int cont=1; cont<=i; cont++){
            if((cont % 3) == 0){
                retorno += "Fizz";
            } else {
                
                retorno += cont;
            }
            
            retorno += "\n";
        }

        return retorno;
    }
    
}
