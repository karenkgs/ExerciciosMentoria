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
    
    @Test
    public void deveRetornarBuzzParaNumeroDivisivelPor5() {
        resultado = fizzBuzz.gerarResultado(5);
        assertThat("Deve conter Buzz" ,resultado, equalTo("1\n2\nFizz\n4\nBuzz\n"));
    }
    
    @Test
    public void deveRetornarFizzBuzzParaNumeroDivisivelPor3e5(){
        resultado = fizzBuzz.gerarResultado(15);
        assertThat("Deve conter BuzzFizz", resultado, equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n"));
    }
    
    @Test
    public void deveRetornarFizzParaNumeroContendo3(){
        resultado = fizzBuzz.gerarResultadoEstagio2(13);
        assertThat("Deve conter BuzzFizz", resultado, equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n"));
    }
}
