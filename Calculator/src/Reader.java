
import java.util.Scanner;


public class Reader {
    private final Scanner scanner = new Scanner(System.in);
    
    public String readString(){
        return this.scanner.nextLine();
    }
    
    public int readInteger(){
        int intToReturn = this.scanner.nextInt();
        this.scanner.nextLine();
        return intToReturn;
        
    }
}
