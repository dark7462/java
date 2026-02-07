public class AVLTree {
    public static void main(String args[]){
        tree t = new tree();
        for(int i = 1 ; i <= 1000 ; i++){
            t.insert(i);
        }
        t.display();
    }
}

class Node{
    public Node left;
    public Node right;
    public int value;
    public int height;
    Node(int value){
        left = null;
        right = null;
        this.value = value;
        height = 1;
    }
}
class tree{
    private Node root;

    private int height(Node node){
        if(node == null) return 0;
        return node.height;
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value, Node node){
        if(node == null){
            return new Node(value);
        }else if(value < node.value){
            node.left = insert(value, node.left);
        }else if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = 1 + Math.max(height(node.left),height(node.right));

        return rotate(node);
    }
    private Node rotate(Node node){
        // left side
        if(getBalance(node) > 1){
            // left left
            if(getBalance(node.left) > 0){
                return rightRotate(node);
            }
            // left right
            if(getBalance(node.left) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getBalance(node) < -1){
            // right right
            if(getBalance(node.right) < 0){
                return leftRotate(node);
            }
            // right left
            if(getBalance(node.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    
    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = 1 + Math.max(height(p.left),height(p.right));
        c.height = 1 + Math.max(height(c.left),height(c.right));
        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        c.right = t;
        p.left = c;
        p.height = 1 + Math.max(height(p.left),height(p.right));
        c.height = 1 + Math.max(height(c.left),height(c.right));
        return p;
    }


    // cal balance
    private int getBalance(Node node){
        if(node == null) return 0;
        return height(node.left) - height(node.right);
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node == null) return;
        display(node.left);
        System.out.print(node.value + " ");
        display(node.right);
    }
}
