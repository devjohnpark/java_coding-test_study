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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        // 1. 스택에 삽입
        for (ListNode cur = head; cur != null; cur = cur.next) {
            stack.push(cur.val);

        }

        // 2. 스택에서 꺼내며 회문인지 비교
        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (stack.pop() != cur.val) return false;
        }

        return true;

    }
}