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
    public ListNode oddEvenList(ListNode head) {
        if( head==null || head.next==null)
        return head;

        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            values.add(curr.val);
            curr = curr.next;
        }

            List<Integer> grouped = new ArrayList<>();
        for(int i = 0 ; i<values.size(); i+=2)
        grouped.add(values.get(i));
            
          for(int i = 1 ; i<values.size(); i+=2)
        grouped.add(values.get(i));


        ListNode dummy = new ListNode(-1);
        curr = dummy;
        for(int val : grouped){
            curr.next = new ListNode(val);
            curr=curr.next;
        }

        return dummy.next;
    }
}