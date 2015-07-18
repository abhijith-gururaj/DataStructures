/**
 * Created by Messi10 on 07-Jun-15.
 */
public class Node {
    private int data;
    private Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }

    public void setData(int data){
        this.data=data;
    }

    public void setNext(Node next){
            this.next=next;
    }

    public boolean hasNext(){
        return next != null;
    }

    public Node getNext(){
        return next;
    }

    public int getData() {
        return data;
    }

}
