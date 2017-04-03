package smileys;

public class Smileys {
    
    //Mooc Fi:
    //Create the support method private static void printWithSmileys(String characterString)
    private static void printWithSmileys(String characterString){
    }
    
    public String printCharacterStringSurroundedBySmiles(String characterString){
        int characterStringLength = characterString.length();
        String characterStringSurroundedBySmiles = "";
        
        characterStringSurroundedBySmiles += generateSmilesLine(characterStringLength+1);
        characterStringSurroundedBySmiles += surroundCharacterStringWithSmiles(characterString);
        characterStringSurroundedBySmiles += generateSmilesLine(characterStringLength+1);
        
        return characterStringSurroundedBySmiles;
    }
    
    public String generateSmilesLine(int smiles){
        String smilesLine = "";
        
        for(int cont = 1;cont <= smiles;cont++){
            smilesLine += ":)";
        }
        
        smilesLine += "\n";
        return smilesLine;
    }
    
    public String surroundCharacterStringWithSmiles(String characterString){
        String characterStringSurroundedBySmiles = "";
        
        characterStringSurroundedBySmiles += ":) " + characterString;
        if(getIfCharacterStringIsOdd(characterString)){
            characterStringSurroundedBySmiles += " ";
        }
        
        characterStringSurroundedBySmiles += " :)";
        characterStringSurroundedBySmiles += "\n";
        return characterStringSurroundedBySmiles;
    }
    
    public boolean getIfCharacterStringIsOdd(String characterString){
        return ((characterString.length() % 2) != 0);
    }
    
}
