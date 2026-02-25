import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" UC6: Queue + Stack Palindrome Check ");
        System.out.println("======================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Data Structures
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : processedInput.toCharArray()) {
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) and pop (stack)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}