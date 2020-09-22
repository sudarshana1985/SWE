package SWE.linkedlist;

public class EvenOddPartition {
    public static void main (String arg[]){
        EvenOddPartition evenOddPartition= new EvenOddPartition();

        System.out.println();
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode evenhead=null;
        ListNode oddCurr=head;
        ListNode evenCurr=null;
        if(oddCurr.next != null){
            evenCurr=oddCurr.next;
            evenhead=evenCurr;
        }

        while ( evenCurr!=null && oddCurr!=null){
            oddCurr.next=evenCurr.next;
            oddCurr=oddCurr.next;
            evenCurr.next=oddCurr.next;
            evenCurr=evenCurr.next;
        }
        oddCurr.next=evenhead;


        return head;
    }
}
