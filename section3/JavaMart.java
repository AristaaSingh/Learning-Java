// Workbook 3.2

public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
 
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        if (wallet >= toyCar) {
            wallet -= toyCar;
            System.out.println("Sure!");
        } else {
            System.out.println("No sorry, I only have " + wallet + " left.");
        }

        double nike = 95.99;
        System.out.println("Can I get these nike shoes?");
        if (wallet >= nike) {
            wallet -= nike;
            System.out.println("Sure!");
        } else {
            System.out.println("No sorry, I only have " + wallet + " left.");
        }

    }
}