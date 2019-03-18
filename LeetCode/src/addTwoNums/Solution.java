package addTwoNums;

//https://leetcode-cn.com/problems/add-two-numbers/
public class Solution {

    public ListNode1 addTwoNumbers(ListNode1 l1,ListNode1 l2){
        ListNode1 headNode = new ListNode1(0); //创建头指针
        ListNode1 currentNode = headNode; //当前节点
        ListNode1 n1=l1,n2=l2;
        int n=0,m=0;
        while (n1 != null || n2 != null){
            int x = (n1 == null) ? 0 : n1.val;
            int y = (n2 == null) ? 0 : n2.val;
            int sum = x + y + n;
            n = sum/10;
            m = sum%10;
            currentNode.next = new ListNode1(m);
            currentNode = currentNode.next;
            n1 = (n1 == null)? n1 : n1.next;
            n2 = (n2 == null)? n2 : n2.next;
        }
        if(n>0){
            currentNode.next = new ListNode1(n);
        }
        return headNode.next;
    }

    public long getNumFromListNode(ListNode1 listNode){
        if(listNode == null){
            return 0;
        }
        long num = listNode.val;
        int i = 1;
        while (listNode.next != null){
            listNode = listNode.next;
            num += listNode.val * Math.pow(10,i++);
        }
        return num;
    }






    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = getNumFromNode(l1);
        long num2 = getNumFromNode(l2);
        System.out.println(num1);
        System.out.println(num2);
        long sum = num1 + num2;
        System.out.println(sum);
//        return createListNode(sum);
        return null;
    }

    public static ListNode createListNode(int number){
        ListNode listNode = new ListNode();
        int n = number/10;
        int m = number%10;
        while ( n > 0 ){
            listNode.addNode(m);
            m = n%10;
            n = n/10;
        }
        listNode.addNode(m);
        return listNode;
    }

    public static long getNumFromNode(ListNode listNode){
        long num = 0;
        for(int i=0;i<listNode.getSize();i++){
            Integer data = listNode.getNode(i).getData();
            num += data * Math.pow(10,i);
        }
        return num;
    }

    public static void main(String[] array){
        ListNode listNode1 = new ListNode();
        listNode1.addNode(9);
        ListNode listNode2 = new ListNode();
        listNode2.addNode(1);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        listNode2.addNode(9);
        ListNode sumNode = addTwoNumbers(listNode1,listNode2);
        sumNode.printNode(sumNode.getHead());
    }

}
