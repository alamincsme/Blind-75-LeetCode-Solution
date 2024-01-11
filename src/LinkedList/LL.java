package LinkedList;

public class LL {
    private Node head;

    public class Node {
        private int data;
        private Node next;


        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void prepend(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void append(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            Node curr_node = head;
            while (curr_node.next != null) {
                curr_node = curr_node.next;
            }
            curr_node.next = node;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("no item in the list.");
        } else {
            Node curr_node = head;
            while (curr_node != null) {
                System.out.println(curr_node.data + " ");
                curr_node = curr_node.next;
            }
        }
    }

    public int size() {
        int count = 0 ;
        if (head == null) {
            return count;
        } else {
            Node curr_node = head;
            while (curr_node != null) {
                count = count + 1 ;
                curr_node = curr_node.next;
            }
        }
        return  count ;
    }

    public void insertAtPostion(int pos, int item) {
        Node node = new Node(item);
        if (pos == 0) {
            prepend(item);
        } else if (pos == size()) {
            append(item);
        }else if (pos > 0 && pos < size()) {
            Node curr_node = head;
            for (int i = 0 ; i < pos - 1 ;++i) {
                curr_node = curr_node.next;
            }
            node.next = curr_node.next;
            curr_node.next = node;
        } else {
            System.out.println("invalid position.");
        }
    }

    public boolean isEmpty() {
        return size() == 0 ;
    }

    public void removeFirst () {
        if (head == null) {
            System.out.println("no item to remove.");
        } else {
            head = head.next ;
        }
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("no item to remove.");
        } else {
            Node curr_node = head;
            for (int i = 0 ; i < size() - 2; ++i) {
                curr_node =curr_node.next;
            }

            curr_node.next = null;
        }
    }

    public void removeAtPosition(int pos) {
        if (pos == 0) {
            removeFirst();
        }else if (pos == size()) {
            removeLast();
        } else if (pos > 0 && pos < size()) {
            Node curr_node = head;
            for (int i = 0 ; i < pos - 1 ; i++) {
                curr_node = curr_node.next;
            }

            curr_node.next = curr_node.next.next;
        }
    }


    public static void main(String[] args) {
        LL ll = new LL();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.prepend(0);
        ll.insertAtPostion(1,5);
        ll.removeFirst(); //0 5 10 20 30 40
        ll.removeLast();
        ll.removeAtPosition(1);
        ll.printLL();
    }
}
