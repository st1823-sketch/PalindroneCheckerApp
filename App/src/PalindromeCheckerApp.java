import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println(" UC9: Recursive Palindrome Checker");
        System.out.println("==========================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = isPalindromeRecursive(processedInput, 0, processedInput.length() - 1);
        if (isPalindrome) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}