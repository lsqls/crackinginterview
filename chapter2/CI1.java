package chapter2;
import java.util.HashSet;

import lib.leetcode.ListNode;
public class CI1 {
    public ListNode removeDuplicateNodes(ListNode head) {

        if(head==null)
            return null;
        HashSet<Integer> iSet=new HashSet<>();
        ListNode cur=head,next=cur.next;    
        iSet.add(cur.val);
        while(cur!=null&&next!=null){
            while(next!=null&&iSet.contains(next.val)){
                next=next.next;
            }
            
            cur.next=next;
            cur=next;
            if(cur!=null){
                next=cur.next;
                iSet.add(cur.val);
            }
        }
        return head;
    }
    
}
