/**
 * Created by Abhijith Gururaj.
 * This a base data structure for implementation of various ds like Linked Lists, Stacks etc.
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next){
            this.next=next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
