package LinkedList;

public class AddTwoNumberTwo {
    public ListNode addTwoNumbers(ListNode ll1, ListNode ll2) {
        ListNode ans = new ListNode();
        ListNode res = ans;
        int c = 0;
        ListNode l1 = reverse(ll1);
        ListNode l2 = reverse(ll2);
        while(l1!=null || l2!=null){
            int s = 0;
            if(l1 != null){
                s += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                s += l2.val;
                l2 = l2.next;
            }
            s += c;
            ans.next = new ListNode(s % 10);
            ans = ans.next;
            c = s / 10;

        }
        if(c > 0){
            ans.next = new ListNode(c);
        }
        return reverse(res.next);

    }
    public static ListNode reverse(ListNode node){
        ListNode prev = null , temp ;
        while(node != null){
            temp = node.next;
            node.next = prev;
            prev = node;
            node  = temp;
        }
        return prev;
    }
}
