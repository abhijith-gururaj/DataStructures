/**
 * Created by Messi10 on 03-Aug-15.
 */
public class StackArray {
    private int[] stack;
    int top;

    public StackArray(int length){
        stack=new int[length];
        top=-1;
    }

    public void push(int data){
        if(top==stack.length) {
            throw new StackOverflowError();
        }
        stack[++top]=data;
    }

    public int pop(){
        if(top==-1)
            throw new IndexOutOfBoundsException();
        return stack[top--];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int top(){
        if(top>stack.length||top==-1)
            throw new IndexOutOfBoundsException();
        return stack[top];
    }
}
