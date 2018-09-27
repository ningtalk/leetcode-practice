package practice.part01;

/**
 * @author np
 * @date 2018/9/27
 * 两数相加
 *   给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，
 *   它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 *
 *   你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 */
public class Solution02 {

    // 链表
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int v) {val = v;}
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = new ListNode(0);
        ListNode p = l1, q = l2, currentNode = firstNode;
        int carry = 0;
        while (p != null || q != null) {
            int pV = p != null ? p.val : 0;
            int qV = q != null ? q.val : 0;
            int tmpV = carry + pV + qV;
            currentNode.next = new ListNode(tmpV % 10);
            carry = tmpV / 10;

            currentNode = currentNode.next;
            if(p != null) {
                p = p.next;
            }
            if(q != null) {
                q = q.next;
            }
        }

        if(carry == 1) {
            currentNode.next = new ListNode(1);
        }

        return firstNode.next;
    }

    public static void main(String[] args) {
        /**
         * 测试用例
         * l1: 1
         * l2: 9 -> 9 -> 9 -> 9
         *
         * 正确输出
        */

        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode reNode = addTwoNumbers(l1, l2);
        ListNode cNode = reNode;
        while (cNode != null) {
            System.out.print(cNode.val + " -> ");
            cNode = cNode.next;
        }
    }

}
