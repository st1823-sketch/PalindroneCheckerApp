import java.util.Scanner;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" UC10: Case-Insensitive & Space-Ignored Palindrome Checker");
        System.out.println("==========================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = isPalindrome(normalizedInput);
        if (isPalindrome) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}