public class WholeNumbers {
    public static void main (String[] args) {
        // we have to use 'L' with the integer to let java know we are storing this correctly
        long globalPopulation = 8_000_000_000L;
        // the underscore doesnt change anything, only makes the code more readable
        System.out.println("The global population is " + globalPopulation);

        long dailyGoogleSearches = 8_500_000_000L;
        System.out.println("The number of daily google searches are " + dailyGoogleSearches);
    }
}

/**
 * long types are 64-bit (8 bytes) in comparision to integer types which are 32-bit (4 bytes).
 * int types have a range of approx -2bil to +2bil
 * a good example is when youtube had to update their code to store larger number of views when PSY's
 * gangnam style came out...
 * 
 * always use the smallest amount of memory possible!!
 */