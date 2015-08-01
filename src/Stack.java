/**
 * Created by Messi10 on 07-Jun-15.
 */
public class Stack {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node temp = top;
        top = new Node(data);
        top.setNext(temp);
    }

    public int size() {
        return size(top);
    }

    private int size(Node top) {
        if (top.getNext() == null)
            return 1;

        return size(top.getNext()) + 1;
    }

    public int pop() {
        int data = top.getData();
        top = top.getNext();
        return data;
    }
}
