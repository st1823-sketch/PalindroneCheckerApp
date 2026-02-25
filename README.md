# UC12: Strategy Pattern for Palindrome Checker

## 📌 Project Overview
The **UC12 Palindrome Checker App** demonstrates how to implement multiple palindrome validation algorithms using the **Strategy Design Pattern**. This pattern allows different palindrome checking algorithms to be selected and swapped dynamically at runtime without changing the client code.

---

## 🚀 Features
- Accepts user input from console
- Ignores spaces and case in string preprocessing
- Implements a **Stack-based palindrome checking algorithm**
- Uses a **common PalindromeStrategy interface** for extensibility
- Demonstrates **algorithm interchangeability** using Strategy pattern

---

## 🛠 Technologies Used
- Java (JDK 8 or higher)
- `java.util.Scanner`
- `java.util.Stack`

---

## 📂 Project Structure

---

## ▶️ How It Works
1. User inputs a string.
2. The input is normalized (spaces removed, lowercase).
3. The application instantiates a concrete palindrome checking strategy (`StackStrategy`).
4. The selected strategy's `checkPalindrome()` method is invoked.
5. The program outputs whether the string is a palindrome.

---

## 🧠 Algorithm Logic (StackStrategy)