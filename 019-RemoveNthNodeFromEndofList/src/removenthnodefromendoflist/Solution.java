//19. ɾ������ĵ�����N���ڵ�
//����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣
//ʾ����
//����һ������: 1->2->3->4->5, �� n = 2.
//��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.
//˵����
//������ n ��֤����Ч�ġ�
//���ף�
//���ܳ���ʹ��һ��ɨ��ʵ����
package removenthnodefromendoflist;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1=head;
        ListNode l2=head;
        int count=n;
        while (count>0) {
        	l2=l2.next;
        	count--;
        }
        if (l2==null) {
            return l1.next;
        }
        while (l2.next!=null) {
        	l1=l1.next;
        	l2=l2.next;
        }
        l1.next=l1.next.next;
        return head;
    }
}
