// 21. Merge Two Sorted Lists(두 정렬 리스트의 병합)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {         
        // 1. 더미 노드와 tail 노드 생성
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;
        
        // 2. 두 리스트 모두 값이 남아 있을 때 까지 반복
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // 3. 남은 노드 연결
        if(list1 != null) tail.next = list1;
        if(list2 != null) tail.next = list2;
            
        // 4. dummy.next를 반환하여 병합된 연결 리스트의 시작 위치 반환
        return dummyNode.next;
    }
}

// ====== [디버깅용] ======
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {         
//         // 1. 더미 노드와 tail 노드 생성
//         ListNode dummyNode = new ListNode(0);
//         ListNode tail = dummyNode;
        
//         // 2. 두 리스트 모두 값이 남아 있을 때 까지 반복
//         while(list1 != null && list2 != null) {
//             if(list1.val < list2.val) {
//                 tail.next = list1;
//                 list1 = list1.next;
//             } else {
//                 tail.next = list2;
//                 list2 = list2.next;
//             }
//             tail = tail.next;
//         }

// 				// 3. 남은 노드 연결
//         if(list1 != null) tail.next = list1;
//         if(list2 != null) tail.next = list2;
            
//         // 4. dummy.next를 반환하여 병합된 연결 리스트의 시작 위치 반환
//         return dummyNode.next;
//     }
// }

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

// // The main method must be in a class named "Main".
// class Main {
//     public static void main(String[] args) {
//        // list1 = [1, 2, 4]
//         ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

//         // list2 = [1, 3, 4]
//         ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

//         Solution solution = new Solution();
//         ListNode merged = solution.mergeTwoLists(list1, list2);

//         while(merged != null) {
//             System.out.print(merged.val);
//             if(merged.next != null) System.out.print(" -> ");
//             merged = merged.next;
//         }
//     }
// }
