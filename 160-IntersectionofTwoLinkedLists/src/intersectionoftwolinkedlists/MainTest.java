//160. �ཻ����
//��дһ�������ҵ������������ཻ����ʼ�ڵ㡣
//ʾ�� 1��
//���룺intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
//�����Reference of the node with value = 8
//������ͣ��ཻ�ڵ��ֵΪ 8 ��ע�⣬��������б��ཻ����Ϊ 0�����Ӹ��Եı�ͷ��ʼ�������� A Ϊ [4,1,8,4,5]������ B Ϊ [5,0,1,8,4,5]���� A �У��ཻ�ڵ�ǰ�� 2 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 3 ���ڵ㡣
//ʾ�� 2��
//���룺intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
//�����Reference of the node with value = 2
//������ͣ��ཻ�ڵ��ֵΪ 2 ��ע�⣬��������б��ཻ����Ϊ 0�����Ӹ��Եı�ͷ��ʼ�������� A Ϊ [0,9,1,2,4]������ B Ϊ [3,2,4]���� A �У��ཻ�ڵ�ǰ�� 3 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 1 ���ڵ㡣
//ʾ�� 3��
//���룺intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
//�����null
//������ͣ��Ӹ��Եı�ͷ��ʼ�������� A Ϊ [2,6,4]������ B Ϊ [1,5]�����������������ཻ������ intersectVal ����Ϊ 0���� skipA �� skipB ����������ֵ��
//���ͣ������������ཻ����˷��� null��
//ע�⣺
//�����������û�н��㣬���� null.
//�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
//�ɼٶ���������ṹ��û��ѭ����
//���������� O(n) ʱ�临�Ӷȣ��ҽ��� O(1) �ڴ档
package intersectionoftwolinkedlists;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(4);
		ListNode current=head1;
		current.next=new ListNode(1);
		current=current.next;
		current.next=new ListNode(8);
		current=current.next;
		ListNode current1=current;
		current.next=new ListNode(4);
		current=current.next;
		current.next=new ListNode(5);
		current=current.next;
		ListNode head2=new ListNode(5);
		ListNode current2=head2;
		current2.next=new ListNode(0);
		current2=current2.next;
		current2.next=new ListNode(1);
		current2=current2.next;
		current2.next=new ListNode(0);
		current2=current2.next;
		current2.next=current1;
		Solution Test=new Solution();
		System.out.println(Test.getIntersectionNode(head1, head2).val);
	}
}
