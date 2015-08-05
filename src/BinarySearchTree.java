import java.util.ArrayList;

/**
 * Created by Abhijith Gururaj.
 * This is a custom BST implementation in java.
 * This uses BSTNode as the base ds for nodes.
 */
public class BinarySearchTree {
    private BTNode root;

    public BTNode getRoot() {
        return root;
    }

    public void insertNode(int data){
        root=insertNode(root,data);
    }

    private BTNode insertNode(BTNode root, int data) {

        if(root==null) {
            root=new BTNode(data);
            return root;
        }
        if(root.getData()>data)
            root.setLeft(insertNode(root.getLeft(),data));
        else if(root.getData() < data)
            root.setRight(insertNode(root.getRight(),data));
        else
            root.setData(data);
        return root;
    }

    public boolean contains(int data){
        return contains(root,data);
    }

    private boolean contains(BTNode root, int data) {
        if(root==null)
            return false;

        if (root.getData() > data)
            return contains(root.getLeft(), data);
        else
            return root.getData() == data || contains(root.getRight(), data);
    }

    public void delete(int data){
        root=delete(root,data);
    }

    /* Yet to work on this */
    private BTNode delete(BTNode root, int data) {
        if(!contains(data))return null;

        if(root.getData()==data)
            root=null;

        return null;
    }

    public BTNode convertArrayToBst(int[] arr){
        if(arr==null) return null;

        return convertArrayToBst(arr,0,arr.length-1);
    }

    private BTNode convertArrayToBst(int[] arr, int start, int end) {

        if(start>end) return null;

        int mid=(start+end)/2;
        BTNode root = new BTNode(arr[mid]);
        root.setLeft(convertArrayToBst(arr, start, mid - 1));
        root.setRight(convertArrayToBst(arr, mid + 1, end));
        return root;
    }

    public int height() {
        return height(root);
    }

    private int height(BTNode root) {
        if (root==null)
            return 0;
        else
        {
     /* compute the height of each subtree */
            int lHeight = height(root.getLeft());
            int rHeight = height(root.getRight());

     /* use the larger one */
            if (lHeight > rHeight)
                return(lHeight+1);
            else return(rHeight+1);
        }
    }

    public void bft(){
        for(int h=1;h<height(root);h++){
            bft(root,h);
        }
    }

    private void bft(BTNode root, int h) {
        if(root==null) {
            System.out.println("null");
        }else {
            if (h == 1) {
                System.out.print(root.getData() + " ");
            } else if (h > 1) {
                bft(root.getLeft(), h - 1);
                bft(root.getRight(), h - 1);
            }
        }
    }

    public ArrayList<Integer> keys(){
        ArrayList<Integer> list=new ArrayList<>();
        keys(root,list);
        return list;
    }

    private void keys(BTNode root,ArrayList<Integer> Keys) {
        if(root==null) return;

        keys(root.getLeft(),Keys);
        Keys.add(root.getData());
        keys(root.getRight(),Keys);
    }

    public void printLeftView(){
        int[] maxLevel={0};
        printLeftView(root,1,maxLevel);
    }

    private void printLeftView(BTNode root, int level, int[] maxLevel) {
        if(root==null) return;
        if(maxLevel[0]<level){
            System.out.print(root.getData()+" ");
            maxLevel[0]=level;
        }
        printLeftView(root.getLeft(),level+1,maxLevel);
        printLeftView(root.getRight(),level+1,maxLevel);
    }

    void printRightView(){
        int[] maxLevel={0};
        printRightView(root,1,maxLevel);
    }

    private void printRightView(BTNode root, int level, int[] maxLevel) {
        if(root==null) return;

        if(maxLevel[0]<level){
            System.out.print(root.getData()+" ");
            maxLevel[0]=level;
        }

        printRightView(root.getRight(),level+1,maxLevel);
        printRightView(root.getLeft(),level+1,maxLevel);
    }

    public int nodeLevel(int data){
        return nodeLevel(root, data, 1);
    }

    private int nodeLevel(BTNode root, int data, int level){
        if (root == null)
            return 0;

        if (root.getData() == data)
            return level;

        int downLevel = nodeLevel(root.getLeft(), data, level + 1);

        if (downLevel != 0)
            return downLevel;
        else
            return nodeLevel(root.getRight(), data, level + 1);
    }

    public boolean isIdentical(BinarySearchTree tree2) {
        BTNode root2 = tree2.getRoot();
        return isIdentical(root, root2);
    }

    private boolean isIdentical(BTNode root, BTNode root2) {
        if (root == null && root2 == null)
            return false;

        if (root != null && root2 != null) {
            boolean left = isIdentical(root.getLeft(), root2.getLeft());
            boolean right = isIdentical(root.getRight(), root2.getRight());

            return root.getData() == root2.getData() && left && right;
        }

        return false;
    }

    public int getLeafCount() {
        return getLeafCount(root);
    }

    private int getLeafCount(BTNode root) {
        if(root==null)
            return 0;

        if(root.getLeft()==null&&root.getRight()==null)
            return 1;
        else
        return getLeafCount(root.getLeft())+getLeafCount(root.getRight());
    }

    public boolean isBST() {
        return isBST(root);
    }

    private boolean isBST(BTNode root) {
        if (root == null || (root.getLeft() == null && root.getRight() == null))
            return true;

        return checkNodeIntegrity(root) && isBST(root.getLeft()) && isBST(root.getRight());
    }

    private boolean checkNodeIntegrity(BTNode root) {
        if (root == null) return false;

        if (root.getLeft() == null) {
            return root.getData() < root.getRight().getData();
        }
        if (root.getRight() == null) {
            return root.getData() > root.getLeft().getData();
        }

        if (root.getData() < root.getRight().getData() && root.getData() > root.getLeft().getData())
            return true;
        else
            return false;
    }

    public void mirror(){
        mirror(root);
    }

    private void mirror(BTNode root) {
        if(root==null) {
            return;
        }
        else {
            mirror(root.getLeft());
            mirror(root.getRight());
            if (root.getLeft() != null && root.getRight() != null) {
                BTNode temp = root.getLeft();
                root.setLeft(root.getRight());
                root.setRight(temp);
            } else if (root.getLeft() == null) {
                root.setLeft(root.getRight());
                root.setRight(null);
            } else {
                root.setRight(root.getLeft());
                root.setLeft(null);
            }
        }
    }



}
