package fizzbuzz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class FizzBuzz {
    private String retorno = "";
    
    public String gerarResultadoEstagio2(int i){
        for(int cont=1; cont<=i; cont++){
            
            if(ehDivisivelPor(cont, 3) && ehDivisivelPor(cont, 5)){
                retorno += "FizzBuzz";
            } else if(ehDivisivelPor(cont, 3) || contemNumero(cont, "3")){
                retorno += "Fizz";
            } else if(ehDivisivelPor(cont, 5) || contemNumero(cont, "5")){
                retorno += "Buzz";
            } else {
                retorno += cont;
            }
            
            retorno += "\n";
        }

        return retorno;
    }
    
    public String gerarResultado(int i) {
        
        for(int cont=1; cont<=i; cont++){
            if(ehDivisivelPor(cont, 3) && ehDivisivelPor(cont, 5)){
                retorno += "FizzBuzz";
            } else if(ehDivisivelPor(cont, 3)){
                retorno += "Fizz";
            } else if(ehDivisivelPor(cont, 5)){
                retorno += "Buzz";
            } else {
                retorno += cont;
            }
            
            retorno += "\n";
        }

        return retorno;
    }
    
    private boolean ehDivisivelPor(int num, int divisor){
        return ((num % divisor) == 0);
    }
    
    private boolean contemNumero(int num, String digito){
        return String.valueOf(num).contains(digito);
    }
    
}
