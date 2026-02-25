import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("=== Stack-Based Palindrome Checker ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < processedInput.length(); i++) {
            stack.push(processedInput.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < processedInput.length(); i++) {
            if (processedInput.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }
        scanner.close();
    }
}