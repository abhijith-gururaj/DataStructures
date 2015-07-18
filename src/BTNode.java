/**
 * Created by Abhijith Gururaj.
 * This is a Node implementation in java.
 * This will be used by Binary trees and BSTs.
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

    public void setData(int data) {
        this.data = data;
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
}
