package addTwoNums;

public class ListNode {
    //链表节点
    public class Node{
        private Node next = null; //指向下个节点的指针
        private Integer data; //链表节点的值
        public Node(Integer data){//构造函数
            this.data = data;
        }

        public Integer getData(){
            return this.data;
        }
    }

    private Node head = null; //头指针
    private int size;//链表长度

    public Node getHead(){
        return this.head;
    }

    public int getSize(){
        return this.size;
    }


    public Node getNode(int index){
        Node node = this.head;
        for(int i=1;i<=index;i++){
            node = node.next;
        }
        return node;
    }

    public void addNode(Integer data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
        }else{
            Node current = this.head; //当前节点
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }

    //链表打印，从node节点开始打印
    public void printNode(Node node){
        if(node == null) {
            return;
        }
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
