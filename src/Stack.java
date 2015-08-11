
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
        if(isEmpty())
            throw new StackOverflowError("Stack is Empty.");
        int data = top.getData();
        top = top.getNext();
        return data;
    }

    public void printReverse(){
        printReverse(top);
    }

    private void printReverse(Node top) {
        if(top==null){
            return;
        }
        printReverse(top.getNext());
        System.out.println(top.getData());
    }

    public void printStack(){
        Node temp=top;
        while(top!=null){
            System.out.println(top.getData());
            top=top.getNext();
        }
        top=temp;
    }
}
