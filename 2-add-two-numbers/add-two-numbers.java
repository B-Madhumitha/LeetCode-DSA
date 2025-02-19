/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            int d1=0,d2=0;
            if(l1!=null){
                d1=l1.val;
            }
            if(l2!=null){
                d2=l2.val;
            }
            int d = d1+d2+carry;
            int val = d%10;
            carry = d/10;
            ListNode nn = new ListNode(val);
            tail.next = nn;
            tail = tail.next;
            if(l1!=null){
                l1 = l1.next;
            }
            if(l2!=null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}