package chapter2;
import lib.leetcode.ListNode;
public class CI6 {
    public boolean isPalindrome(ListNode head) {

        if(head==null||head.next==null)
            return true;
        ListNode fast=head,slow=head;
// 寻找中点
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast!=null)
                fast=fast.next;
        }
        // 分割链表，转置后半部分
        ListNode newHead=reverse(slow);
        // 比较是否相同
        while(newHead!=null){
            if(head.val!=newHead.val)
                return false;
            head=head.next;
            newHead=newHead.next;
        }
        return true;
    }

    ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;

        ListNode tail=head.next;
        ListNode newhead=reverse(tail);
        tail.next=head;
        head.next=null;
        return newhead;

    }

    public static void main(String[] args) {

        
        new CI6().isPalindrome(ListNode.createTestData("[1,2,2,1]"));
    }
}
