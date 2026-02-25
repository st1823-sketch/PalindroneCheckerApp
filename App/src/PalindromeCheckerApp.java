import java.util.Scanner;

/**
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @sathwik developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalindromeService service = new PalindromeService();

        System.out.println("==========================================");
        System.out.println(" UC11: Object-Oriented Palindrome Checker ");
        System.out.println("==========================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = processed.length() - 1;
        while (start < end) {
            if (processed.charAt(start) != processed.charAt(end)) {
                return false;  // Not a palindrome
            }
            start++;
            end--;
        }
        return true;
    }
}