import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Is_your_horseshoe_on_the_other_hoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input line
        String inputLine = scanner.nextLine();

        // Split input line by whitespace into an array of strings
        String[] tokens = inputLine.split("\\s+");

        // Create a set to store unique integers
        Set<Integer> uniqueElements = new HashSet<>();

        // Add each integer to the set (automatically handles duplicates)
        for (String token : tokens) {
            uniqueElements.add(Integer.parseInt(token));
        }

        // Calculate the number of unique elements
        int uniqueCount = uniqueElements.size();

        // Print the result
        System.out.println(4 - uniqueCount);

        // Close the scanner
        scanner.close();
    }
}
