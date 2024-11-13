public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode  slow = head;
        ListNode temp=head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return slow;

        
        
    }
}