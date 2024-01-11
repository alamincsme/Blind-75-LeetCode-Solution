package LinkedList;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {

        //remove first duplicate value .
        while (head != null && head.val == val) {
            head = head.next ;
        }

        ListNode curr_node = head;
        ListNode node = null;
        int cnt = 0 ;


        for (;curr_node != null;) {
            node = curr_node;
            for (; node.next != null; ) {
                if (node.next.val == val) {
                    node.next = node.next.next;
                } else {
                    node = node.next;
                }
            }

            curr_node = curr_node.next ;
        }
        return head;

    }
}
