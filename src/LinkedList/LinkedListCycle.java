package LinkedList;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null) return false;
         ListNode slow = head;
         ListNode first = head.next ;

         while (slow != first) {
             if (first == null || first.next ==null) {
                 return false ;
             }

             slow = slow.next;
             first = first.next.next ;
         }
         return true ;
    }
}
