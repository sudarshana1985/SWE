package SWE.linkedlist;

import java.util.Stack;

public class AddTwoNumbers {
    public  static void main(String [] arg){

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1== null && l2==null) return null;
        if(l1==null)
            return reverse(l2);
        else if(l2==null)
            return reverse(l1);
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    private ListNode reverse(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        while(head!= null){
            stack.push(head);
            head= head.next;
        }
        ListNode node= stack.pop();
        ListNode headBack= node;
        while(!stack.isEmpty()){
            node.next=stack.pop();
        }
        return headBack;
    }
}
