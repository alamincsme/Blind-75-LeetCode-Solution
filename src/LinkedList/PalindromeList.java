package LinkedList;


import java.util.Stack;

public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true ;
        }

        Stack<ListNode> stack = new Stack<>() ;
        ListNode curr_node = head ;
        while(curr_node != null) {
            stack.push(curr_node);
            curr_node = curr_node.next ;
        }

        curr_node = head ;
        while (curr_node != null) {
            if (curr_node.val != stack.pop().val) {
                return false ;
            }
            curr_node = curr_node.next ;
        }
        return true ;
    }
}
