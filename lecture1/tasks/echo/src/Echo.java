import java.util.Arrays;
import java.util.List;

/**
 * Program that prints the input arguments
 */
public class Echo {
    private static final String EMPTY_STRING = "";
    private static final String DELIMITER = " ";

    public static void main(String[] args) {
        List<String> arguments = Arrays.asList(args);
        String concatenateArguments = EMPTY_STRING;
        for (String argument : arguments) {
            concatenateArguments = concatenateArguments + argument + DELIMITER;
        }
        // removing tailing space before printing
        System.out.println(concatenateArguments.trim());
    }
}
