/**
 * Created by Messi10 on 28-Jun-15.
 */
public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList();

        for (String arg : args) {
            list.addNode(Integer.parseInt(arg));
        }

        System.out.println("Size is :"+list.size());
        System.out.println(list.toString());
        list.reverse();
        //System.out.println("Deleting");
        //list.deleteLastNode();
        //list.printNthNode(1);
        //list.skipMdeleteN(2,3);
        //list.rotateList(3);
        System.out.println("Reverse: "+list.toString());
    }
}
