import java.util.Stack;

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
public class Solution {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int len = stack.size();
        int[] result = new int[len];
        for (int i=0; i<len; i++) {
            result[i] = stack.peek();
            stack.pop();
        }
        return result;
    }
}
