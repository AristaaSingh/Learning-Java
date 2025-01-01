public class Decimals {
    public static void main(String[] args) {
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up");

        double wallet = 20;
        int people = 3;
        System.out.println(wallet / people); // if we store even one of these values as double, java returns a double result

    }
}

/**
 * double type can store up to 15 decimal places
 * don't use integers for math calculations, java will always return an integer as the answer and
 * cut off all the decimals!
 */