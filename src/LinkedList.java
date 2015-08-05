import java.util.Random;

/**
 * Created by Abhijith Gururaj.
 * This is a custom Linked List api in java.
 */
public class LinkedList {

    int listcount;
    private Node node, head;

    public LinkedList(){
        head=new Node(-1);

    }

    public void addNode(int data){
        if(node==null){
            node= new Node(data);
            head.setNext(node);
            listcount++;
            return;
        }
        Node temp=node;
        while(temp.hasNext()){
            temp=temp.getNext();
        }
        temp.setNext(new Node(data));
        listcount++;
    }

    public void deleteLastNode(){
        Node temp=head;
        while(temp.getNext().hasNext()){
            temp=temp.getNext();
        }
        temp.setNext(null);
        listcount--;
    }

    public void deleteNode(int pos){
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());
        listcount--;
    }

    public int length(){
        Node temp=node;
        int length=0;
        while(temp!=null){
            temp=temp.getNext();
            length++;
        }

        return length;
    }

    public int size(){
        return listcount;
    }

    public String toString() {
        Node temp = head.getNext();
        String output = "";
        while (temp != null) {
            output += "[" + String.valueOf(temp.getData()) + "]";
            temp = temp.getNext();
        }
        return output;
    }

    public void swap(int data1, int data2){
        swap(head,data1,data2);
    }

    private void swap(Node head, int data1, int data2) {
        Node currX=head,currY=head,prevX=null,prevY=null;

        if(data1==data2) return;

        while(currX!=null&&currX.getData()!=data1){
            prevX=currX;
            currX=currX.getNext();
        }
        while(currY!=null&&currY.getData()!=data2){
            prevY=currY;
            currY=currY.getNext();
        }

        if(prevX!=null)
            prevX.setNext(currY);
        else
            node=currY;

        if(prevY!=null)
            prevY.setNext(currX);
        else
            node=currX;

        Node temp=currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);
    }

    void printReverse(){
        printReverse(head.getNext());
    }

    private void printReverse(Node root) {
        if(root==null)
            return;

        printReverse(root.getNext());
        System.out.println(root.getData() + " ");
    }

    public void printNthNode(int n){
        printNthNode(head, n);
    }

    private void printNthNode(Node root, int n) {
        int length=size();

        if(length<n) return;

        Node temp=root.getNext();
        for(int i=0;i<length-n;i++){
            temp=temp.getNext();
        }

        if(temp!=null)
        System.out.println(temp.getData());
    }

    public int midVal(){
        Node currPtr=head.getNext(),nextPtr=head.getNext();

        while(currPtr!=null&nextPtr!=null){
            currPtr=currPtr.getNext();
            nextPtr=currPtr.getNext();
        }

        return currPtr.getData();
    }

    void skipMdeleteN(int m,int n){
        skipMdeleteN(head,m,n);
    }

    private void skipMdeleteN(Node root, int m, int n) {
        Node temp=root.getNext();

        for(int i=0;i<m&&temp!=null;i++) {
            System.out.print(temp.getData());
            temp = temp.getNext();
        }

        if(temp==null) return;

        Node temp2=temp;

        for(int i=0;i<n;i++)
            temp2=temp2.getNext();

        System.out.println("Deleting");
        temp.setNext(temp2);
        listcount-=n;
    }

    public void rotateList(int k){
        Node temp=head.getNext();
        for(int i=0;i<k-1;i++)
            temp=temp.getNext();
        System.out.print("1");
        if(temp==null) return;

        Node kNode=temp;

        while(temp.getNext()!=null)
            temp=temp.getNext();
        System.out.println("2");
        temp.setNext(node);
        System.out.println(temp.getData()+" pointing "+ temp.getNext().getData());
        head.setNext(kNode.getNext());
        kNode.setNext(null);
    }

    public void reverse(){
        Node temp=head.getNext();
        Node prev=null;
        Node nextNode=null;
        while(temp.getNext()!=null){
            nextNode=temp.getNext();
            temp.setNext(prev);
            prev=temp;
            temp=nextNode;
        }
        temp.setNext(prev);
        head.setNext(nextNode);
    }

    public int random(){
        int length=length();
        Node temp=head;
        System.out.println("len "+length);
        Random r=new Random();
        int rand=1+r.nextInt(length-1);
        System.out.println(rand);
        for(int i=0;i<rand;i++){
            temp=temp.getNext();
        }
        return temp.getData();
    }
    public void reverseHalves(){
        Node start=head.getNext();
        Node temp=start;
        Node fastptr=start;
        int count=2;
        while(fastptr.getNext()!=null&&fastptr.getNext().getNext()!=null){
            fastptr=fastptr.getNext().getNext();
            temp=temp.getNext();
            count+=2;
        }

        Node mid=temp;
        if(fastptr.getNext()==null)
            count++;
        System.out.println("mid: "+mid.getData()+" : "+count);
        if(count%2!=0){
            Node prev=null,next=null;
            temp=start;
            while(temp!=mid){
                next=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=next;
            }
            start.setNext(mid);
            head.setNext(prev);
            temp=temp.getNext();
            Node temp2=temp;
            prev=null;
            while(temp!=null){
                next=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=next;
            }
            mid.setNext(prev);
            System.out.println(toString());
        }else{
            Node prev=null,next=null;
            System.out.println(start.getData());
            temp=start;
            mid=mid.getNext();
            while(temp!=mid){
                //System.out.print(temp.getData()+" : ");
                next=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=next;
            }
            head.setNext(prev);
            prev=null;
            while(temp!=null){
                next=temp.getNext();
                temp.setNext(prev);
                prev=temp;
                temp=next;
            }
            start.setNext(prev);
            System.out.println(toString());
        }
    }
}
