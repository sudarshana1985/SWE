package SWE.linkedlist;

public class TestingCycles {
    public static void main (String arg[]){
        TestingCycles cycles= new TestingCycles();
        ListNode a= new ListNode(1);ListNode b= new ListNode(2);ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;

        System.out.println(cycles.hasCycle(a));

    }

    public boolean hasCycle(ListNode head) {
        if(head==null || head.next== null)
            return false;
        ListNode slowP= head; ListNode fastP= head.next;
        while(slowP != fastP ) {
            if(slowP.next == null || fastP== null ||fastP.next== null)
                return false;
            slowP= slowP.next;
            fastP=fastP.next.next;

        }
        return  true;
    }
}
