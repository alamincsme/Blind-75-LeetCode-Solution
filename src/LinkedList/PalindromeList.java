package LinkedList;

//without consuming extra memory.
public class PalindromeList {
    public boolean isPalindrome(ListNode head) {
        int count = 0 ;
        ListNode curr_node = head;
        while (curr_node != null) {
            count = count + 1 ;
            curr_node = curr_node.next ;
        }

        ListNode prev = null,temp = null;
        curr_node = head;
        for (int i = 0 ; i < count /2 ; i++) {
            temp = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = temp;
        }

        if (count % 2 == 1) {
            curr_node = curr_node.next ;
        }

        while (curr_node != null) {
            if (curr_node.val != prev.val) {
                return false;
            }

            curr_node = curr_node.next;
            prev = prev.next;
        }

        return true ;
    }

}

//solution 2
//public boolean isPalindrome(ListNode head) {
//    if(head == null || head.next == null) {
//        return true ;
//    }
//
//    Stack<ListNode> stack = new Stack<>() ;
//    ListNode curr_node = head ;
//    while(curr_node != null) {
//        stack.push(curr_node);
//        curr_node = curr_node.next ;
//    }
//
//    curr_node = head ;
//    while (curr_node != null) {
//        if (curr_node.val != stack.pop().val) {
//            return false ;
//        }
//        curr_node = curr_node.next ;
//    }
//    return true ;
//}