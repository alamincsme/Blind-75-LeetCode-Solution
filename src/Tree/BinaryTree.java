package Tree;

class Node {
    int data;
    Node parent;
    Node left;
    Node right;

    Node(int item) {
        this.data = item;
        this.parent = null;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    static Node createNode(int item) {
        return new Node(item);
    }

    static void addLeftChild(Node node, Node child) {
        node.left = child;

        if (child != null) {
            child.parent = node;
        }
    }

    static void addRightChild(Node node, Node child) {
        node.right = child;

        if (child != null) {
            child.parent = node;
        }
    }

    static Node bstInsert(Node root, Node node) {
        Node parent, current;

        if (root == null) {
            root = node;
            return root;
        }

        parent = null;
        current = root;

        while (current != null) {
            parent = current;

            if (node.data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (node.data < parent.data) {
            addLeftChild(parent, node);
        } else {
            addRightChild(parent, node);
        }

        return root;
    }


    static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    static Node createBST() {
        Node root, node;
        int[] ara = {5, 17, 3, 7, 12, 19, 1, 4};

        root = createNode(10);

        for (int item : ara) {
            node = createNode(item);
            root = bstInsert(root, node);
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = createBST();
        preorderTraversal(root);
    }
}

