//21. �ϲ�������������
//��������������ϲ�Ϊһ���µ������������ء�
//��������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 
//ʾ����
//���룺1->2->4, 1->3->4
//�����1->1->2->3->4->4
package mergetwosortedlists;

public class ListNode {
	int val;
	ListNode next;
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	ListNode(int x) { val = x; }
}
