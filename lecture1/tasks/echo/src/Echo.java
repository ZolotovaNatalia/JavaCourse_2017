import java.util.Arrays;
import java.util.List;

/**
 * Program that prints the input arguments
 */
public class Echo {
    private static final String EMPTY_STRING = "";
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        String concatenateArguments = EMPTY_STRING;
        for (int i = 0; i < args.length; i++) {
            concatenateArguments = concatenateArguments + args[i] + DELIMITER;
        }
        // removing tailing space before printing
        System.out.println(concatenateArguments.trim());
    }
}
