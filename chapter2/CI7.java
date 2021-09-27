package chapter2;
import lib.leetcode.ListNode;
public class CI7 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA,pB=headB;
        while(pA!=pB){
            pA=pA==null?headB:pA.next;
            pB=pB==null?headA:pB.next;
        }
        return pA;
    }
}
