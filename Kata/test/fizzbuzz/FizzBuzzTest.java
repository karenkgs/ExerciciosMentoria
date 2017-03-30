package fizzbuzz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fizzbuzz.FizzBuzz;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    
    private final FizzBuzz fizzBuzz = new FizzBuzz();
    private String resultado;

    @Test
    public void deveRetornarString1() {
        resultado = fizzBuzz.gerarResultado(1);
        assertThat("deve retornar uma string com o texto esperado", resultado, equalTo("1\n"));
    }
   
    @Test
    public void deveRetornarListaGerada(){
        resultado = fizzBuzz.gerarResultado(2);
        assertThat("Deve retornar uma string com o texto esperado", resultado, equalTo("1\n2\n"));
    }
    
    @Test
    public void deveRetornarFizzParaNumeroDivisivelPor3(){
        resultado = fizzBuzz.gerarResultado(3);
        assertThat("Deve retornar uma string com o texto esperado",
                resultado, equalTo("1\n2\nFizz\n"));
    }
    
}
