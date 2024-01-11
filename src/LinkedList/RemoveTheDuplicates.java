package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveTheDuplicates {
    public Node head;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void append(int val) {
        Node node = new Node(val);
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

    public void printList() {
        Node curr_node = head;
        while (curr_node != null) {
            System.out.print(curr_node.val + " ");
            curr_node = curr_node.next;
        }
        System.out.println();
    }

    public void deleteDuplicates() {
        if (head == null || head.next == null) {
            return;
        }

        Map<Integer, Integer> counter = new HashMap<>();
        Node curr_node = head;
        Node prev = null;

        while (curr_node != null) {
            if (counter.containsKey(curr_node.val)) {
                // Skip the duplicate node
                curr_node = curr_node.next;
            } else {
                // Process a non-duplicate node
                counter.put(curr_node.val, 1);

                if (prev == null) {
                    // Update head for the first non-duplicate node
                    head = curr_node;
                } else {
                    prev.next = curr_node;
                }

                prev = curr_node;
                curr_node = curr_node.next;
            }
        }

        // Set next of the last non-duplicate node to null
        if (prev != null) {
            prev.next = null;
        }
    }

    public static void main(String[] args) {
        RemoveTheDuplicates list = new RemoveTheDuplicates();

        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(4);
        list.append(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Removing duplicates
        list.deleteDuplicates();

        System.out.println("Linked List after removing duplicates:");
        list.printList();
    }
}
