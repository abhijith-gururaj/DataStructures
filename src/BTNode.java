/**
 * Created by Messi10 on 10-Jun-15.
 */
public class BTNode {
    private BTNode left,right;
    private int data;

    public BTNode(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public BTNode getLeft() {return left;}

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
}
