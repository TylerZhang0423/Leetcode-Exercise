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

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1==null) {
        	return l2;
        }
        if (l2==null) {
        	return l1;
        }
        int count=0;
        ListNode temp=new ListNode((l1.val+l2.val+count)%10);
        ListNode res=temp;
        if (l1.val+l2.val+count>=10) {
        	count=1;
        }else {
        	count=0;
        }
        l1=l1.next;
    	l2=l2.next;
        while (l1!=null&&l2!=null) {       	
        	temp.next=new ListNode((l1.val+l2.val+count)%10);
        	if (l1.val+l2.val+count<10) {
        		count=0;
        	}else {
        		count=1;
        	}
        	temp=temp.next;
        	l1=l1.next;
        	l2=l2.next;
        }
        if (l1!=null) {
        	if (count==0) {
        		temp.next=l1;
        	}else {
        		while (l1!=null) {
        			temp.next=new ListNode((l1.val+count)%10);
                	if (l1.val+count<10) {
                		count=0;
                	}else {
                		count=1;
                	}
                	temp=temp.next;
                	l1=l1.next;
        		}
        	}
        }else if (l2!=null) {
        	if (count==0) {
        		temp.next=l2;
        	}else {
        		while (l2!=null) {
        			temp.next=new ListNode((l2.val+count)%10);
                	if (l2.val+count<10) {
                		count=0;
                	}else {
                		count=1;
                	}
                	temp=temp.next;
                	l2=l2.next;
        		}
        	}
        }
        if (count==1) {
        	temp.next=new ListNode(1);
        }
        return res;
    }
}
