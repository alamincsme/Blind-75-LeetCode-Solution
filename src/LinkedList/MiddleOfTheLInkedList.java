package LinkedList;

public class MiddleOfTheLInkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        } else if (head.next == null)  {
            return head ;
        }
        ListNode prev = null, slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        // prev.next=slow.next;
        head = prev.next;
        return head;

    }
}
