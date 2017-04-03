package smileys;

import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class SmileysTest {
    
    Smileys smileys = new Smileys();
    
    @Test
    public void ifReceives4printsASmileLineWith4Smiles(){
        assertThat("Prints a Smile Line",
                   smileys.generateSmilesLine(4),
                   equalTo(":):):):)\n"));
    }
    
    @Test
    public void ifReceivesACharacterStringSurroundsItWithSmiles(){
        assertThat("Prints the character string surrounded by smiles",
                   smileys.surroundCharacterStringWithSmiles("AA"),
                   equalTo(":) AA :)\n"));
    }
    
    @Test
    public void ifReceivesAnOddCharacterStringPrintsAnAdditionalSpaceBesideIt(){
        assertThat("Prints the character string surrounded by smiles",
                   smileys.surroundCharacterStringWithSmiles("AAA"),
                   equalTo(":) AAA  :)\n"));
    }
    
    @Test
    public void ifReceivesKarenPrintsItSurroundedBySmilesAndWithAdditionalSpaceBesideIt(){
        assertThat("Prints Karen surrounded by smiles and with an additonal space beside it",
                   smileys.printCharacterStringSurroundedBySmiles("Karen"),
                   equalTo(":):):):):):)\n:) Karen  :)\n:):):):):):)\n"));
    }
    
    @Test
    public void ifReceivesLucasPrintsItSurroundedBySmilesAndWithAdditionalSpaceBesideIt(){
        assertThat("Prints Lucas surrounded by smiles and with an additonal space beside it",
                   smileys.printCharacterStringSurroundedBySmiles("Lucas"),
                   equalTo(":):):):):):)\n:) Lucas  :)\n:):):):):):)\n"));
    }
    
    @Test
    public void ifReceivesJoaoPrintsItSurroundedBySmilesWithoutAdditionalSpaceBesideIt(){
        assertThat("Prints Joao surrounded by smiles and without an additonal space beside it",
                   smileys.printCharacterStringSurroundedBySmiles("Joao"),
                   equalTo(":):):):):)\n:) Joao :)\n:):):):):)\n"));
    }
    
}
