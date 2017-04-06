
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Mikael");
         printWithSmileys("Matti");
         printWithSmileys("Arto");
    }

    private static void printWithSmileys(String characterString){
        System.out.print(generateSmilesListWithCharacterStringSurroundedBySmiles(characterString));
    }
    
    private static String generateSmilesListWithCharacterStringSurroundedBySmiles(String characterString){
        String smilesListWithCharacterStringSurroundedBySmiles = "";
        int characterStringLength = characterString.length();
        smilesListWithCharacterStringSurroundedBySmiles += generateSmilesList(characterStringLength+1);
        smilesListWithCharacterStringSurroundedBySmiles += generateCharacterStringSurroundedBySmiles(characterString);
        smilesListWithCharacterStringSurroundedBySmiles += generateSmilesList(characterStringLength+1);
        
        return smilesListWithCharacterStringSurroundedBySmiles;
    }
    
    private static String generateSmilesList(int smiles){
        String smilesList = "";
        for(int cont = 0; cont<smiles; cont++){
            smilesList += ":)";
        }
        smilesList += "\n";
        
        return smilesList;
    }
    
    private static String generateCharacterStringSurroundedBySmiles(String characterString){
        String characterStringSurroundedBySmiles = "";
        characterStringSurroundedBySmiles += ":) " + characterString;
        if(getIfACharacterStringLengthIsOdd(characterString.length())){
            characterStringSurroundedBySmiles += " ";
        }
        characterStringSurroundedBySmiles += " :)\n";
        
        return characterStringSurroundedBySmiles;
    }
    
    private static boolean getIfACharacterStringLengthIsOdd(int characterStringLength){
            return (characterStringLength % 2) != 0;
    }
    
}
