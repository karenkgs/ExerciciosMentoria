package fizzBuzzTest;

import fizzBuzz.FizzBuzz;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;
import static org.junit.Assert.*;


public class FizzBuzzTest {
    
    FizzBuzz fizzBuzz = new FizzBuzz();
    
    @Test
    public void ifReceives1Prints1(){
        assertThat("Must print expected String",
                   fizzBuzz.generateSampleNumbersList(1),
                   equalTo("1\n"));
    }
    
    @Test
    public void ifReceivesNumberMultipleOf3PrintsFizz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateSampleNumbersList(3),
                   equalTo("1\n2\nFizz\n"));
    }
    
    @Test
    public void ifReceivesNumberMultipleOf5PrintsBuzz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateSampleNumbersList(5),
                   equalTo("1\n2\nFizz\n4\nBuzz\n"));
    }
    
    @Test
    public void ifReceivesNumberMultipleOf3And5PrintsFizzBuzz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateSampleNumbersList(15),
                   equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n"));
    }
    
    @Test
    public void ifReceivesNumberWith3OnItPrintsFizz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateNumbersListWithNewRequirements(13),
                   equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n"));
    }
    
    @Test
    public void ifReceivesNumberWith5OnItPrintsBuzz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateNumbersListWithNewRequirements(52),
                   equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n16\n17\n" +
                           "Fizz\n19\nBuzz\nFizz\n22\nFizz\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\nFizz\nFizz\n" +
                           "Fizz\nFizz\nFizzBuzz\nFizz\nFizz\nFizz\nFizz\nBuzz\n41\nFizz\nFizz\n44\nFizzBuzz\n46\n47\n" +
                           "Fizz\n49\nBuzz\nFizz\nBuzz\n"));
    }
    
    @Test
    public void ifReceivesNumberWith5And3OnItPrintsFizzBuzz(){
        assertThat("Must print expected String",
                   fizzBuzz.generateNumbersListWithNewRequirements(35),
                   equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n14\nFizzBuzz\n16\n17\n" +
                           "Fizz\n19\nBuzz\nFizz\n22\nFizz\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\nFizz\nFizz\n" +
                           "Fizz\nFizz\nFizzBuzz\n"));
    }
}
