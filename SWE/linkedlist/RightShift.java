package SWE.linkedlist;

public class RightShift {
    public static void main (String arg[]){
        RightShift rightShift= new RightShift();
        ListNode a= new ListNode(1);ListNode b= new ListNode(2);ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;

        rightShift.print( rightShift.rotateRight(a,1));
    }
    public void print(ListNode head){
        while (head != null){

            System.out.println(head.val+"->");
            head= head.next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return  null;
        if(k==0 )
            return head;
        int len=0;
        ListNode curr= head;
        while(curr != null){
            len++;
            curr= curr.next;
        }
        if(k==len)
            return  head;
        int counter=0;ListNode kthNode= null; curr= head;
        while(counter < len-k-1){
            counter++;
            curr= curr.next;
        }
        kthNode=curr.next;

        curr.next=null; curr=kthNode;
        while(curr !=null&& curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        head= kthNode;
        return head;
    }
}
