public class Graph {
    int V;
    class AdjListNode{
        public AdjListNode(int data){
            head=new GraphNode(data);
        }
        GraphNode head;
    }

    AdjListNode[] adjListNodes;

    private class GraphNode {
        public GraphNode(int data){
            this.data=data;
            this.next=null;
        }
        int data;
        GraphNode next;
    }

    public Graph(int V){
        this.V=V;
        adjListNodes=new AdjListNode[V];
        for(int i=0;i<V;i++)
            adjListNodes[i]=new AdjListNode(i);
    }

    public void addEdge(int src,int dest){
        GraphNode destNode=new GraphNode(dest);
        GraphNode srcNode=new GraphNode(src);

        destNode.next=adjListNodes[src].head.next;
        adjListNodes[src].head.next=destNode;
        //System.out.println("Setting edge: "+adjListNodes[src].head.data+"->"+adjListNodes[src].head.next.data);

        srcNode.next=adjListNodes[dest].head.next;
        adjListNodes[dest].head.next=srcNode;
        //System.out.println("Setting edge: "+adjListNodes[dest].head.data+"->"+adjListNodes[dest].head.next.data);
    }

    public void printGraph(){
        for(int i=0;i<V;i++){
            GraphNode temp=adjListNodes[i].head;
            while(temp!=null){
                System.out.print("->"+temp.data);
                temp=temp.next;
            }
            System.out.print("\n");
        }
    }

    public int evenTree(){
        int delCount = 0;
        for(int i=1;i<V;i++) {
            GraphNode root = adjListNodes[i].head;
            GraphNode child = root.next;
            GraphNode prev = root;

            while (child != null) {
                GraphNode temp = adjListNodes[child.data].head;
                int subTreeCount = 0;
                System.out.print("Subtree: ");
                while (temp != null) {
                    System.out.print(temp.data+" ");
                    if (temp.data == root.data) {
                        temp = temp.next;
                        continue;
                    }
                    subTreeCount++;
                    temp = temp.next;
                }
                System.out.println();
                if (subTreeCount % 2 != 0) {
                    delCount++;
                    prev.next = child.next;
                }
                child = child.next;
                prev = prev.next;
            }
        }
        return delCount;
    }
}
