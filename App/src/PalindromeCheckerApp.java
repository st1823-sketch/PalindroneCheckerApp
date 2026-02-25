import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println(" UC7: Deque-Based Optimized Palindrome ");
        System.out.println("==========================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : processedInput.toCharArray()) {
            deque.addLast(ch);   // Insert at rear
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}