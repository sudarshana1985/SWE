package SWE.linkedlist;

public class SwapNodesInPairs {
    public static void main (String arg[]){
        SwapNodesInPairs swapNodesInPairs= new SwapNodesInPairs();
        ListNode a= new ListNode(1);ListNode b= new ListNode(2);ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;

        swapNodesInPairs.print(swapNodesInPairs.swapInPairs(a));

    }
    public void print(ListNode head){
        while (head != null){

            System.out.println(head.val+"->");
            head= head.next;
        }
    }

    public ListNode swapInPairs(ListNode head) {
        if(head==null)
            return null;
        ListNode curr= head;
        head= curr.next;
        while(curr != null && curr.next != null){
                ListNode temp=curr.next;
                curr.next=curr.next.next;
                temp.next=curr;
                curr=curr.next;

        }
        return head;
    }


}
