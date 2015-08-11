public class Main {
    public static void main(String[] args){
//        LinkedList list=new LinkedList();

        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.printReverse();
        s.printStack();

        Graph g=new Graph(11);
        g.addEdge(2,1);
        g.addEdge(3,1);
        g.addEdge(4,3);
        g.addEdge(5,2);
        g.addEdge(6,1);
        g.addEdge(7,2);
        g.addEdge(8,6);
        g.addEdge(9,8);
        g.addEdge(10,8);

        g.printGraph();
        System.out.println(g.evenTree());
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
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.insertNode(6);
//        tree.insertNode(3);
//        tree.insertNode(7);
//        tree.insertNode(2);
//        tree.insertNode(4);
//        tree.insertNode(5);
//        tree.insertNode(8);
//        tree.insertNode(9);
//        tree.insertNode(1);
//        System.out.println(tree.keys().toString());
        //tree.bft();
        //tree.printMinVal();
        //tree.changeValToSumOfChildren();
        //System.out.println(tree.isBST());
        //tree.bft();
        //tree.printMinVal();
        //System.out.println("isBST: "+tree.isBST());
       // System.out.println();
        //tree.reversebft();
//        tree.printLeftView();
//        tree.printRightView();
    }
}
