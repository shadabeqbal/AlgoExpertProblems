package bst;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BSTConstruction {
    static Node root = null;
    static int[] arr = {10,5,15,2,5,1,13,22,14};
    static int closest = Integer.MAX_VALUE;
    public static void BuildBST(int[] arr){

        for (int value : arr) root = insert(root, value);
    }

    public static void helper(){
        BuildBST(arr);
        //printBST(root);
        int closest = findClosestValue(root,12);
        System.out.println(closest);
        boolean validateBST = validateBST(root);
        System.out.println(validateBST);
    }

    private static int findClosestValue(Node root, int num){
        if(root == null){
            return closest;
        }
        if(Math.abs(num-closest) > Math.abs(num-root.data))
            closest = root.data;

        if(root.data > num){
            findClosestValue(root.left,num);
        }else if(root.data < num){
            findClosestValue(root.right,num);
        }else {
            return closest;
        }

        return closest;
    }

    private static boolean validateBST(Node root){
        if(root == null)
            return true;

        if(root.left != null && root.right != null && (root.left.data > root.right.data))
            return false;

        return validateBST(root.left) && validateBST(root.right);
    }

    private static void printBST(Node root){
        if(root == null)
            return;

        printBST(root.left);
        System.out.print(root.data+" ");
        printBST(root.right);
    }

    private static Node insert(Node root,int value){
        if(root == null) {
            root = new Node(value);
            return root;
        } else{
            Node current = root;
            if(value < current.data){
                root.left = insert(root.left,value);
            }else{
                root.right = insert(root.right,value);
            }
        }

        return root;
    }
}
