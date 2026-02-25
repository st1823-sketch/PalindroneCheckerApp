The UC7 Palindrome Checker App is a Java console application that checks whether a given string is a palindrome using a Deque (Double-Ended Queue) data structure.

This implementation demonstrates efficient front and rear comparison using ArrayDeque, making the palindrome check optimized and clean.

🚀 Features

Accepts user input from console

Ignores spaces

Case-insensitive comparison

Uses Deque<Character> for optimized checking

Efficient front-rear character comparison

🛠 Technologies Used

Java (JDK 8 or higher)

java.util.ArrayDeque

java.util.Deque

java.util.Scanner

📂 Project Structure
UseCase7PalindromeCheckerApp.java
README.md
▶️ How It Works

The user enters a string.

The program:

Removes all spaces

Converts the string to lowercase

Each character is inserted into a Deque.

Characters from the front and rear are removed and compared.

If all characters match → It's a palindrome.

If any mismatch occurs → It's not a palindrome.

🧠 Algorithm Logic
1. Read input string
2. Remove spaces & convert to lowercase
3. Insert characters into Deque
4. While Deque size > 1:
   Compare front and rear characters
   If mismatch → Not palindrome
5. Print result
   💻 How to Run
   1️⃣ Compile
   javac UseCase7PalindromeCheckerApp.java
   2️⃣ Run
   java UseCase7PalindromeCheckerApp
   📌 Example
   Input
   Enter a string to check: Madam
   Output
   Result: The given string IS a palindrome.
   📈 Time & Space Complexity
   Complexity Type	Value
   Time Complexity	O(n)
   Space Complexity	O(n)