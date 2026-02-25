📌 Objective

The objective of this use case is to implement a Palindrome Checker using:

Queue (FIFO – First In First Out)

Stack (LIFO – Last In First Out)

This demonstrates how different data structures behave and how they can be used together to validate palindrome logic.

📚 Key Concepts Used
1️⃣ Queue – FIFO

A linear data structure where the first element added is the first removed.

Operations used:

add() → Enqueue

remove() → Dequeue

2️⃣ Stack – LIFO

A linear data structure where the last element added is the first removed.

Operations used:

push() → Insert

pop() → Remove

3️⃣ Logical Comparison

For a string to be a palindrome:

Front character (Queue - Dequeue)
must equal
Last character (Stack - Pop)

If all characters match → It is a palindrome.

🛠 How It Works (Flow)

User enters a string.

Remove spaces and convert to lowercase.

For each character:

Enqueue into Queue.

Push into Stack.

Compare:

queue.remove() (FIFO)

stack.pop() (LIFO)

If all match → Palindrome.