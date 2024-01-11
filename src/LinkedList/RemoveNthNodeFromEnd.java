package LinkedList;


import java.util.Currency;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//good practice
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy, slow = dummy;
        while (n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;

    }
}


//        if (head == null) {
//            return  null;
//        }else if (head.next == null) {
//            return null;
//        } else {
//            int size = size(head);
//            if (size - n == 0) {
//                head.next = head;
//            } else if (size - n == size) {
//                ListNode curr_node = head;
//                for (int i = 0 ; i < size - 2 ; i++) {
//                    curr_node = curr_node.next ;
//                }
//                curr_node.next = null;
//            } else {
//                ListNode cn = head ;
//                for (int i = 0; i < size - n - 1 ; i++) {
//                    cn = cn.next ;
//                }
//                cn.next = cn.next.next;
//            }
//        }
//
//        return  head;
//
//
//    }
//
//    public int size(ListNode head) {
//        int count = 0 ;
//        ListNode curr_node = head;
//
//        while (curr_node != null) {
//            count ++ ;
//            curr_node = curr_node.next ;
//        }
//        return count ;
//    }








