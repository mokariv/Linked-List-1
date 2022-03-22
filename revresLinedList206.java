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

// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        
    ListNode previous = null;
    ListNode current;
    ListNode Next;
        
        current = head;
        while(current != null){
            Next = current.next;
            current.next = previous;
            previous = current;
            current = Next;
        }
        return previous;
    }
}
