/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-02-29 10:05
 * 面试题06. 从尾到头打印链表
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *
 * 限制：
 * 0 <= 链表长度 <= 10000
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        Solution solution = new Solution();
        int[] res = solution.reversePrint(head);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
