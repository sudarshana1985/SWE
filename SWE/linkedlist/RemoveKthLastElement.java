package SWE.linkedlist;

public class RemoveKthLastElement {
    public static void main (String arg[]){
        RemoveKthLastElement removeKthLastElement= new RemoveKthLastElement();
        ListNode a= new ListNode(1);ListNode b= new ListNode(2);ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;
        removeKthLastElement.removeKthToLast(a,3);
        removeKthLastElement.print(a);
    }

    public ListNode removeKthToLast(ListNode head, int k) {
        if(head == null )
            return null;
        int len=0;
        ListNode curr=head;
        while(curr != null){
            curr= curr.next;
            len++;
        }
        if(len==1)
            return null;
        else if(len==k)
            return head.next;
        curr=head; int prevDel=1;
        while(prevDel<len-k){
            curr= curr.next;
            prevDel++;
        }
        curr.next=curr.next.next;

        return  head;
    }

    public void print(ListNode head){
        while (head != null){

            System.out.println(head.val+"->");
            head= head.next;
        }
    }
}
