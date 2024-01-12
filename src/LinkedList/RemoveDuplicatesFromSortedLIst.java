package LinkedList;

//time complexity O(n^2)
public class RemoveDuplicatesFromSortedLIst {

    public Node removeDuplicates(Node head) {


        if (head == null || head.next == null) {
            return head;
        }
        int cnt = 0;
        Node curr_node = head;


        for (; curr_node != null; curr_node = curr_node.next)
            for (; curr_node.next != null && curr_node.val == curr_node.next.val; curr_node.next = curr_node.next.next) ;

        return head ;
    }



//        for  (;curr_node != null;) {
//            for  (;curr_node.next != null && curr_node.val == curr_node.next.val;) {
//                curr_node.next = curr_node.next.next;
//            }
//
//            curr_node = curr_node.next;
//        }




//create node.
    private Node head;

    public class Node {
        private int val;
        private Node next;

        public Node (int val) {
            this.val = val;
            this.next = null;
        }
    }
    //append function.
    public void  append(int val) {
        Node node = new Node(val) ;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void printLL() {
        removeDuplicates(head);
        if (head == null) {
            return;
        } else {
            Node curr_node =head;
            for (; curr_node != null; ) {
                System.out.println(curr_node.val + " ");
                curr_node = curr_node.next ;
            }
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedLIst rdsl = new RemoveDuplicatesFromSortedLIst();
        int[] arr = new int [] {4,4,4,1};
        for (int x : arr) {
            rdsl.append(x);
        }

        rdsl.printLL();
    }
}
