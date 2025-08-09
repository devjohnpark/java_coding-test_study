// Reverse Linked List(역순 연결 리스트)

class Solution {
    public ListNode reverseList(ListNode head) {
        // 1. 연결 리스트를 배열에 저장한다
        ListNode current = head;
        int count = 0;
        while (current != null) {
            // System.out.print(current.val);
            count++;
            current = current.next;
        }

        // 2. 역순으로 저장한다
        int[] reverseArr = new int[count];
        current = head;
        while (current != null) {
            reverseArr[count - 1] = current.val;
            count--;
            current = current.next;
        }

        // 3. 연결 리스트에 연순 배열을 저장한다
        current = head;
        while (current != null) {
            current.val = reverseArr[count];
            count++;
            current = current.next;
        }

        return head;
    }
}

// ====== [디버깅용] ======
// import java.util.*;

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         // 1. 연결 리스트를 배열에 저장한다
//         ListNode current = head;
//         int count = 0;
//         while (current != null) {
//             // System.out.print(current.val);
//             count++;
//             current = current.next;
//         }

//         // 2. 역순으로 저장한다
//         int[] reverseArr = new int[count];
//         current = head;
//         while (current != null) {
//             reverseArr[count - 1] = current.val;
//             count--;
//             current = current.next;
//         }

//         // 3. 연결 리스트에 연순 배열을 저장한다
//         current = head;
//         while (current != null) {
//             current.val = reverseArr[count];
//             count++;
//             current = current.next;
//         }

//         // 역순으로 정리한 연결 리스트 확인
//         current = head;
//         while (current != null) {
//             System.out.print(current.val);
//             if (current.next != null) {
//                 System.out.print(" -> ");
//             }
//             current = current.next;
//         }
//         System.out.println(Arrays.toString(reverseArr));
        
//         return head;
//     }
// }

// // Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {}
//     ListNode(int val) { 
//         this.val = val; 
//     }
//     ListNode(int val, ListNode next) { 
//         this.val = val; 
//         this.next = next; 
//     }
// }

// // The main method must be in a class named "Main".
// class Main {
//     public static void main(String[] args) {
//         // 연결 리스트 생성: 1 -> 2 -> 3 -> 4 -> 5
//         ListNode node5 = new ListNode(5);
//         ListNode node4 = new ListNode(4, node5);
//         ListNode node3 = new ListNode(3, node4);
//         ListNode node2 = new ListNode(2, node3);
//         ListNode head = new ListNode(1, node2);

//         // 정답 출력
//         Solution solution = new Solution();
//         solution.reverseList(head);
//     }
// }