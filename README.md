🎯 Use Case 3: Palindrome Check Using String Reverse
✔ Goal

Check whether a string is a palindrome by:

Reversing the string using a loop

Comparing the original and reversed string

Displaying the result

🔁 Program Flow

Accept input from the user.

Reverse the string using a for loop.

Compare the original string with the reversed string using equals().

Display whether the string is a palindrome or not.

🧠 Key Concepts Used
1️⃣ Loop (for loop)

Used to iterate through the string characters in reverse order to build the reversed string.

2️⃣ String Immutability

In Java, String objects are immutable.
Every modification (like concatenation) creates a new String object.

3️⃣ String Concatenation (+)

Used to build the reversed string character by character.

⚠ Note: This approach is simple but not memory efficient for large strings because it creates multiple String objects.