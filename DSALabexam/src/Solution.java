public class Solution {


    // QUESTION NO 1
    // Write a function to reverse a singly linked list.
//- Example:
//- Input: 1 -> 2 -> 3 -> 4 -> 5
//- Output: 5 -> 4 -> 3 -> 2 -> 1



    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev and current one step forward
            current = nextNode;
        }

        return prev; // New head of the reversed list
    }

    public static void main(String[] args) {
        // Here i am creating athe list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // HEre i am reversing the lsit
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed linked list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}

