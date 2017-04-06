
public class Calculator {
    private final Reader reader = new Reader();
    private int totalOfOperations = 0;
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            } else if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum() {
       System.out.print("value1: ");
       int value1 = this.reader.readInteger();
       System.out.print("value2: ");
       int value2 = this.reader.readInteger();
       System.out.print("sum of the values " + (value1+value2));
       this.totalOfOperations++;
    }
    
    private void difference() {
       System.out.print("value1: ");
       int value1 = this.reader.readInteger();
       System.out.print("value2: ");
       int value2 = this.reader.readInteger();
       System.out.print("difference of the values " + (value1-value2));
       this.totalOfOperations++;
    }
    
    private void product() {
       System.out.print("value1: ");
       int value1 = this.reader.readInteger();
       System.out.print("value2: ");
       int value2 = this.reader.readInteger();
       System.out.print("product of the values " + (value1*value2));
       this.totalOfOperations++;
    }
    
    private void statistics() {
       System.out.print("Calculations done: " + this.totalOfOperations);
    }
}
