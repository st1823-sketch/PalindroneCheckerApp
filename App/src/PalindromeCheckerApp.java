package App.src;/*
MAIN CLASS - PalindromeCheckerApp
use case2 :  Print a Hardcoded Palindrome Result


@author Sathwik
@version 2.0
 */



public class  PalindromeCheckerApp {
    public static void main(String[] args) {
                String original = "madam";
                String reversed = "";
                for (int i = original.length() - 1; i >= 0; i--) {
                    reversed += original.charAt(i);
                }
                System.out.println("Original String: " + original);
                System.out.println("Reversed String: " + reversed);
                if (original.equalsIgnoreCase(reversed)) {
                    System.out.println("Result: The string is a palindrome.");
                } else {
                    System.out.println("Result: The string is NOT a palindrome.");
                }
            }
        }


