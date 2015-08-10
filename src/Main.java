import java.util.ArrayList;

/**
 * Created by Messi10 on 28-Jun-15.
 */
public class Main {
    public static void main(String[] args){
        LinkedList list=new LinkedList();

//        for (String arg : args) {
//            list.addNode(Integer.parseInt(arg));
//        }
//
//        list.segregateEvenOdd();
//        //list.deleteAlternates();
        //list.reverseHalves();

//        System.out.println("Size is :"+list.size());
//        System.out.println(list.toString());
//        list.printAlternateNodes();
//        list.printNthNode(3);
//        System.out.println("Middle node: "+list.midVal());
//        list.skipMdeleteN(2,3);
//        System.out.println(list.toString());
//        System.out.println(list.toString());
        //list.reverse();
        //System.out.println("Reverse: "+list.toString());
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(6);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(2);
        tree.insertNode(4);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(9);
        tree.insertNode(1);
        System.out.println(tree.keys().toString());
        //tree.bft();
        //tree.printMinVal();
        //tree.changeValToSumOfChildren();
        System.out.println(tree.isBST());
        //tree.bft();
        //tree.printMinVal();
        //System.out.println("isBST: "+tree.isBST());
       // System.out.println();
        //tree.reversebft();
//        tree.printLeftView();
//        tree.printRightView();
    }
}
