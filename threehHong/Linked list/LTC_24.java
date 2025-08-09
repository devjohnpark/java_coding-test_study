// 24. Swap Nodes in Pairs(페어 노드 스왑)

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        // 1. 더미 노드, 이전 노드, 현재 노드 정의
        dummyNode.next = head;

        ListNode prevNode = dummyNode;
        ListNode current = head;

        // 2. 연결리스트를 순회한다.
        // 순회시 현재 노드와 다음 노드가 존재해야 쌍을 이루어 swap 할 수 있다
        while(current != null && current.next != null) {
            ListNode nextNode = current.next;
            
            // 3. 반복문을 순회하며 노드를 바꾸고 포인터를 변경한다
            // 노드 스왑
            current.next = nextNode.next;
            nextNode.next = current;
            prevNode.next = nextNode;

            // 포인터 이동
            prevNode = current;
            current = current.next;
        }

        // 4. dummyNode.next를 반환하여 스왑된 연결 리스트의 시작 노드를 반환한다.
        return dummyNode.next;
    }
}