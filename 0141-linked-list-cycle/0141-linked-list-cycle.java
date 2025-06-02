public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;             // Move by 1
            fast = fast.next.next;        // Move by 2

            if (slow == fast)             // Cycle detected
                return true;
        }

        return false; // No cycle
    }
}
