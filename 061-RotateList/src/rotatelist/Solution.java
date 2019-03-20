//61. ��ת����
//����һ��������ת����������ÿ���ڵ������ƶ� k ��λ�ã����� k �ǷǸ�����
//ʾ�� 1:
//����: 1->2->3->4->5->NULL, k = 2
//���: 4->5->1->2->3->NULL
//����:
//������ת 1 ��: 5->1->2->3->4->NULL
//������ת 2 ��: 4->5->1->2->3->NULL
//ʾ�� 2:
//����: 0->1->2->NULL, k = 4
//���: 2->0->1->NULL
//����:
//������ת 1 ��: 2->0->1->NULL
//������ת 2 ��: 1->2->0->NULL
//������ת 3 ��: 0->1->2->NULL
//������ת 4 ��: 2->0->1->NULL
package rotatelist;

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) {
            return head;
        }
        int size=0;
        ListNode l1=head;
        ListNode l2=head;
        while (l1.next!=null) {
        	size++;
        	l1=l1.next;
        }
        size++;
        k=k%size;
        l1.next=head;
        l2=l2.next;
        for (int i=0;i<=size-k-2;i++) {
        	head=head.next;
        	l2=l2.next;
        }
        head.next=null;
        return l2;
    }
}
