// 234. Palindrome Linked List(팰린드롬 연결 리스트)

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode current = head;
        int count = 0;
        Boolean result = true;

        // 1. 길이 계산
        while (current != null) {
            current = current.next;
            count++;
        }

        // 2. 배열 생성
        int[] list = new int[count];


        // 3. 연결 리스트에 입력된 데이터 배열에 추가
        current = head;
        int index = 0;
        while (current != null) {
            list[index++] = current.val;
            current = current.next;

        }

        // 4. 양 끝 비교
        for(int i = 0; i < count; i++) {
            if(list[i] != list[count - 1 - i]) {
                return result = false;
            } 
        }

        return result;
    }
}

// ====== [디버깅용] ======
// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode current = head;
//         int count = 0;
//         Boolean result = true;

//         // 1. 길이 계산
//         while (current != null) {
//             current = current.next;
//             count++;
//         }

//         // 2. 배열 생성
//         int[] list = new int[count];


//         // 3. 연결 리스트에 입력된 데이터 배열에 추가
//         current = head;
//         int index = 0;
//         while (current != null) {
//             list[index++] = current.val;
//             current = current.next;

//         }

//         // 4. 양 끝 비교
//         for(int i = 0; i < count; i++) {
//             if(list[i] != list[count - 1 - i]) {
//                 return result = false;
//             } 
//         }

//         return result;
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
//         // 1 -> 2 -> 2 -> 1
//         ListNode node4 = new ListNode(1); // tail
//         ListNode node3 = new ListNode(2, node4);
//         ListNode node2 = new ListNode(2, node3);
//         ListNode head = new ListNode(1, node2);

//         Solution solution = new Solution();
        
//         boolean result = solution.isPalindrome(head);

//         System.out.println(result);       
//     }
// }
