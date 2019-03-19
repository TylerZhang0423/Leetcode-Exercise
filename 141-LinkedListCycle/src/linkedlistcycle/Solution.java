//141. ��������
//����һ�������ж��������Ƿ��л���
//Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� 
//��� pos �� -1�����ڸ�������û�л���
//ʾ�� 1��
//���룺head = [3,2,0,-4], pos = 1
//�����true
//���ͣ���������һ��������β�����ӵ��ڶ����ڵ㡣
//ʾ�� 2��
//���룺head = [1,2], pos = 0
//�����true
//���ͣ���������һ��������β�����ӵ���һ���ڵ㡣
//ʾ�� 3��
//���룺head = [1], pos = -1
//�����false
//���ͣ�������û�л���
//���ף�
//������ O(1)�������������ڴ�����������
//��Ҫ˼·������ָ�룬����ָ�����������л�
package linkedlistcycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null) {
            return false;
        }
        ListNode t1=head;
        ListNode t2=head.next;
        while (t2!=null&&t2.next!=null) {
        	if (t1==t2) {
        		return true;
        	}
        	t1=t1.next;
        	t2=t2.next.next;
        }
        return false;
    }
}
