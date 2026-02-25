UseCase5PalindromeCheckerApp

📌 Objective

This console-based Java application checks whether a given string is a palindrome using a Stack data structure.

The program demonstrates how a stack (LIFO – Last In First Out) can naturally reverse characters to validate palindrome logic.

🧠 Concepts Used

Stack (java.util.Stack)

Push Operation – Inserts characters into the stack

Pop Operation – Removes characters in reverse order

LIFO Principle

String Processing

Looping and Conditional Statements

⚙️ How It Works

User enters a string.

The program:

Converts input to lowercase.

Removes spaces.

Each character is pushed into a stack.

Characters are popped from the stack and compared with the original string.

If all characters match → It is a palindrome.

If any character does not match → Not a palindrome.