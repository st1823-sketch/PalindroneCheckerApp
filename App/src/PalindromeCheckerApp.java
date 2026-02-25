import java.util.Scanner;

/**
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack-based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 *
 * The goal is to teach extensible algorithm design.
 *
 * @sathwik developer
 * @version 12.0
 */
public class PalindromeCheckerApp{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println(" UC12: Strategy Pattern for Palindrome Checker ");
        System.out.println("===============================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.checkPalindrome(input);
        if (result) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }
        scanner.close();
    }
}
/**
 * INTERFACE - PalindromeStrategy
 *
 * Defines a contract for all palindrome checking algorithms.
 * Any new algorithm must implement this interface and provide its own validation logic.
 */
interface PalindromeStrategy {
    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string to check
     * @return true if palindrome, false otherwise
     */
    boolean checkPalindrome(String input);
}
/**
 * CLASS - StackStrategy
 *
 * Implements PalindromeStrategy using a stack-based algorithm.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : processed.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : processed.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}