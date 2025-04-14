// Section 2 Program 3

public class JoiningStrings {
    public static void main(String[] args) {
        int year = 2010;
        String winner = "Spain";
        String announcement = "The winner of the " + year + " world cup was " + winner;
        System.out.println(announcement);
    }
}

/**
 * NOTES
 * 
 * - while memory for int is always 4 bytes, string stype's memory varies.
 * - for eg, "" is 24 bytes, "absolute" is 48 bytes.
 */