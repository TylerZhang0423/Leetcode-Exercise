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

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(3);
		ListNode current=head;
		current.next=new ListNode(2);
		current=current.next;
		ListNode current1=current;
		current.next=new ListNode(0);
		current=current.next;
		current.next=new ListNode(-4);
		current.next=current1;
		Solution Test=new Solution();
		System.out.println(Test.hasCycle(head));
	}
}
