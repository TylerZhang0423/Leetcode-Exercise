//237. ɾ�������еĽڵ�
//���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
//ʾ�� 1:
//����: head = [4,5,1,9], node = 5
//���: [4,1,9]
//����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 1 -> 9.
package deletenodeinalinkedlist;

public class ListNode {
	int val;
	public ListNode next;
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	ListNode(int x) { val = x; }	
}
