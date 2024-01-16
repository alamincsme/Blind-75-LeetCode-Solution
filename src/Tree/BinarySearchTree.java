package Tree;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int val) {
        this.val = val;
        this.left = this.right = this.parent = null;
    }
}

public class BinarySearchTree {

    public static Node createNode(int val) {
        return new Node(val);
    }

    public static void addLeftChild(Node node, Node child) {
        node.left = child;

        if (child != null) {
            child.parent = node;
        }
    }

    public static void addRightchild(Node node, Node child) {
        node.right = child;

        if (child != null) {
            child.parent = node;
        }
    }

    public static Node bstInsert(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (node.val < current.val) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        if (node.val < parent.val) {
            addLeftChild(parent, node);
        } else {
            addRightchild(parent, node);
        }
        return root;
    }

    public static Node createBST() {
        Node root, node;
        int[] arra = {5, 17, 3, 7, 12, 19, 1, 4,21};
        root = createNode(10);
        for (int x : arra) {
            node = createNode(x);
            root = bstInsert(root, node);
        }
        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.println(root.val + " ");
            inOrder(root.right);
        }
    }

    public static Node bst_search(Node root, int val) {
        Node curr_node = root;
        while (curr_node != null) {
            if (curr_node.val == val) {
                return curr_node;
            }

            if (val < curr_node.val) {
                curr_node = curr_node.left;
            } else {
                curr_node = curr_node.right;
            }
        }
        return curr_node;
    }

    public static Node bst_delete(Node root, Node node) {
        Node smallest_node;
        if (node.left == null) {
            root = bst_transplant(root, node, node.right);
        } else if (node.right == null) {
            root = bst_transplant(root, node, node.left);
        } else {
            smallest_node = bst_minimum(node.right);
            if (smallest_node.parent != node) {
                root = bst_transplant(root, smallest_node, smallest_node.right);
                addRightchild(smallest_node, node.right);
            }

            root = bst_transplant(root, node, smallest_node);
            addLeftChild(smallest_node, node.left);
        }

        return root;
    }

    private static Node bst_transplant(Node root, Node current_node, Node new_node) {
        if (current_node == root) {
            root = new_node;
        } else if (current_node == current_node.parent.left) {
            addLeftChild(current_node.parent, new_node);
        } else {
            addRightchild(current_node.parent, new_node);
        }

        return root;
    }

    private static Node bst_minimum(Node root) {
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        Node root = createBST();
        preOrder(root);

        // bst search
        Node node = bst_search(root, 19);
        if (node != null) {
            System.out.println("will delete is : " + node.val);
            root = bst_delete(root , node);
        }

        preOrder(root);
    }
}
