//2. �������
//�������� �ǿ� ������������ʾ�����Ǹ���������
//���У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
//��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
//�����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
//ʾ����
//���룺(2 -> 4 -> 3) + (5 -> 6 -> 4)
//�����7 -> 0 -> 8
//ԭ��342 + 465 = 807
package addtwonumbers;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1=new ListNode(2);
		ListNode current=head1;
		current.next=new ListNode(4);
		current=current.next;
		current.next=new ListNode(7);
		ListNode head2=new ListNode(5);
		current=head2;
		current.next=new ListNode(6);
		current=current.next;
		current.next=new ListNode(4);
		Solution Test=new Solution();
		ListNode result=Test.addTwoNumbers(head1, head2);
		while (result.next!=null) {
			System.out.print(result.val+"-->");
			result=result.next;
		}
		System.out.print(result.val);
	}
}
