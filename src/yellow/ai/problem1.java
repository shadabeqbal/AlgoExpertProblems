package yellow.ai;

import java.util.List;

class Node{
    int data;
    List<Node> child;
}
public class problem1 {
    public static int findMin(Node root,int currentSum,int finalSum){
        if(root == null) {
            finalSum = Math.min(currentSum,finalSum);
            return 0;
        }

        currentSum+=root.data;
        if(currentSum > finalSum)
            return 0;

        for(int i=0;i<root.child.size();i++)
            findMin(root.child.get(i),currentSum,finalSum);

        return finalSum;
    }
}

