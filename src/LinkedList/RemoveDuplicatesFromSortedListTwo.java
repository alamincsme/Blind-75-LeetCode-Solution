package LinkedList;


import java.util.List;

public class RemoveDuplicatesFromSortedListTwo {
    public ListNode deleteDuplicates() {
        if (head == null) {
            return head;
        }


        ListNode prev = null;
        ListNode currentOld = null;
        ListNode current = head;
        head = null ;

        while (current != null) {
            currentOld = current;

            while (current.next != null && current.val == current.next.val) {
                current = current.next;

            }

            if (currentOld == current) {
                if (head == null) {
                    head = currentOld;
                }
                else {
                    prev.next = currentOld;
                }

                current = current.next;
                prev = currentOld;
                prev.next = null;
            } else {
                current = current.next;
            }

        }

        return head;
    }

//    ListNode head ;
//    public class  ListNode {
//        int val;
//        ListNode next ;
//        public ListNode (int val) {
//            this.val = val;
//            this.next = null;
//        }
//    }
//
//    public void append(int val) {
//        ListNode node = new ListNode(val);
//        if (head == null) {
//            head = node;
//        } else {
//            node.next = head;
//            head = node;
//        }
//    }
//
//    public static void main(String[] args) {
//        RemoveDuplicatesFromSortedListTwo removeDuplicatesFromSortedListTwo = new RemoveDuplicatesFromSortedListTwo();
//        int [] arr = new int[] {5,4,4,3,3,2,1};
//        for (int x : arr) {
//            removeDuplicatesFromSortedListTwo.append(x);
//        }
//        removeDuplicatesFromSortedListTwo.deleteDuplicates();
//        removeDuplicatesFromSortedListTwo.printLL();
//    }
//
//    private void printLL() {
//        if (head == null) {
//            System.out.println("no item.");
//        } else {
//            ListNode curr = head;
//            while (curr != null) {
//                System.out.println(curr.val + " " );
//                curr = curr.next;
//            }
//        }
//    }
}
