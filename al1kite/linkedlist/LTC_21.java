import java.util.*;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (ListNode cur = list1; cur != null; cur = cur.next) {
            list.add(cur.val);
        }

        for (ListNode cur = list2; cur != null; cur = cur.next) {
            list.add(cur.val);
        }

        Collections.sort(list);

        ListNode dummy = new ListNode(0);
        ListNode cur   = dummy;
        for (int v : list) {
            cur.next = new ListNode(v);
            cur      = cur.next;
        }

        return dummy.next;
    }
}