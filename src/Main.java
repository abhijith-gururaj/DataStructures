import java.util.ArrayList;

/**
 * Created by Messi10 on 28-Jun-15.
 */
public class Main {
    public static void main(String[] args){
//        LinkedList list=new LinkedList();
//
//        for (String arg : args) {
//            list.addNode(Integer.parseInt(arg));
//        }
//
//        System.out.println("Size is :"+list.size());
//        System.out.println(list.toString());
//        list.reverse();
//        System.out.println("Reverse: "+list.toString());
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(5);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(2);
        tree.insertNode(4);
        tree.insertNode(2);
        tree.insertNode(8);
        tree.insertNode(6);
        System.out.println(tree.keys().toString());
        System.out.println(tree.height());
        tree.printLeftView();
        tree.printRightView();
    }
}
