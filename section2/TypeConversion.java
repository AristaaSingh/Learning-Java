// Section 2 Program 8

public class TypeConversion {
    public static void main(String[] args) {

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        // use explicit type conversion by temporarily casting purchasedBlocksOfCheese variable to double
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + salary);
        System.out.println("My rounded salary is: " + roundedSalary);

    }
}

