import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read n and x
        int n = input.nextInt();
        int x = input.nextInt();

        // Variables to store heights and previous height
        int previousHeight = input.nextInt(); // Ground level is 0 initially
        boolean canMakeIt = true; // Assume Gemy can make it
        int currentHeight;
        // Read heights and check differences in a loop
        for (int i = 0; i < n-1; ++i) {

            currentHeight = input.nextInt();
            int heightDifference = previousHeight - currentHeight;
            // Check if the height difference exceeds x
            if (heightDifference > x) {
                canMakeIt = false; // Found a height difference too large
                break;
            }
            // Update previous height for the next iteration
            previousHeight = currentHeight;
        }
        if(previousHeight>x)
            canMakeIt = false;
        if (canMakeIt) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

