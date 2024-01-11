package LinkedList;

public class DeleteTheMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode prev = null, slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;

        return head;
    }
}
