//21. �ϲ�������������
//��������������ϲ�Ϊһ���µ������������ء�
//��������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 
//ʾ����
//���룺1->2->4, 1->3->4
//�����1->1->2->3->4->4
//��Ҫ˼·�����ö���ռ䣬����һ���µ�����result������һ��headָ��result��ͷ��
//�Ƚ�l1��l2��ͷ��Ԫ�ش�С��С��Ԫ�ؽӵ�������ĺ��棬Ȼ��l1��l2����
package mergetwosortedlists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode result=null;//�洢�����������ռ�
    	ListNode head=null;//ָ������ͷ��
        if (l1==null&&l2==null) {
        	return null;
        }else if (l1==null&&l2!=null) {
        	return l2;
        }else if (l2==null&&l1!=null) {
        	return l1;
        }
        if (l2.val>=l1.val) {
    		ListNode temp1=new ListNode(l1.val);
   			result=temp1;
   			head=result;
   			l1=l1.next;
        }else {
    		ListNode temp2=new ListNode(l2.val);
   			result=temp2;
   			head=result;
   			l2=l2.next;
        }
        while (l2!=null&&l1!=null) {       	
        	if (l2.val>=l1.val) {
        		ListNode temp1=new ListNode(l1.val);
       			result.next=temp1;
       			result=result.next;
       			l1=l1.next;
       		}else{
        		ListNode temp2=new ListNode(l2.val);
       			result.next=temp2;
       			result=result.next;
       			l2=l2.next;
       		}
        }
        //���l1����l2�е�һ������Ϊ�գ���ֱ�ӽ�ʣ�µĽӵ�result���漴��
        if (l1==null) {
        	result.next=l2;
        }else {
        	result.next=l1;
        }
        return head;
    }
}
