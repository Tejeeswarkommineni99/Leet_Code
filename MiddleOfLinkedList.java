// Node class representing each element in the linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MiddleOfLinkedList {
    // Function to find the middle node of the linked list
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move slow pointer by one step and fast pointer by two steps
        // When fast reaches the end, slow will be at the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Call the middleNode function and print the result
        ListNode middle = middleNode(head);
        System.out.print("Values from middle node to end: ");
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}
