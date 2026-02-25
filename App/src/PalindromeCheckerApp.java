import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void append(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    Node getMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    boolean isPalindrome() {
        if (head == null || head.next == null) return true;
        Node middle = getMiddle();
        Node secondHalf = reverse(middle.next);
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean palindrome = true;

        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        middle.next = reverse(secondHalf);

        return palindrome;
    }
}
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println(" UC8: Linked List-Based Palindrome Checker");
        System.out.println("==========================================");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String processedInput = input.replaceAll("\\s+", "").toLowerCase();
        LinkedList list = new LinkedList();
        for (char ch : processedInput.toCharArray()) {
            list.append(ch);
        }
        if (list.isPalindrome()) {
            System.out.println("\nResult: The given string IS a palindrome.");
        } else {
            System.out.println("\nResult: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}