package LinkedList;


//time complexity O(n^2)
public class InsertionSortLinkedList {
    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (sorted == null || sorted.data >= current.data) {

                current.next = sorted;
                sorted = current;

            } else {
                //sorted list.
                Node temp = sorted;
                while (temp.next != null && current.data > temp.next.data) {
                    temp = temp.next;
                }

                current.next = temp.next;
                temp.next = current;
            }

            current = next;
        }
        head = sorted;
    }


    public Node head;
    public class Node {
        int data ;
        Node next ;

        public Node (int val) {
            this.data = val;
            this.next = null;
        }
    }

    public void append(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node curr_node = head;
            for (; curr_node.next != null; ) {
                curr_node = curr_node.next;
            }

            curr_node.next = node;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("not item in the list.");
        } else {
            Node curr = head;
            for (; curr != null; curr = curr.next) {
                System.out.println(curr.data + " ");
            }
        }
    }

    public static void main(String[] args) {
        InsertionSortLinkedList IS = new InsertionSortLinkedList();
        int[] arr = new int[ ] { 2,1,5,4,7,8,3};
        for (int x : arr)  {
            IS.append(x);
        }
        IS.insertionSort();
        IS.printLL();
    }
}
