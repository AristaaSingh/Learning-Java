// section 4 program 1

public class Chorus {
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times
        singChorus();
        singChorus();
        singChorus();
        singChorus();
        singChorus();

    }

    // level of access, static, return type- void in this case, function name (parameters)
    public static void singChorus() {
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }

}

/**
 * - main is also a function, it's a specific one which the JVM looks for to run first in a program
 */