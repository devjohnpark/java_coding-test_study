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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        // 1. 스택에 삽입
        for (ListNode cur = head; cur != null; cur = cur.next) {
            stack.push(cur.val);

        }

        // 2. 꺼내면서 역방향 링크노드 생성
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!stack.isEmpty()) {
            cur.next = new ListNode(stack.pop());
            cur = cur.next;
        }

        return dummy.next;
    }
}