//203. �Ƴ�����Ԫ��
//ɾ�������е��ڸ���ֵ val �����нڵ㡣
//ʾ��:
//����: 1->2->6->3->4->5->6, val = 6
//���: 1->2->3->4->5
package removelinkedlistelements;

public class Solution {
	private ListNode first;
	public void insert(int value) {
		ListNode lnk =new ListNode(value);
		if (first==null) {
			first=lnk;
		}else {
			lnk.next=first;
			first=lnk;
		}
	}
	//��ԭ�����ǰ���һ���ڵ㣬�ӵ�0��Ԫ�ؿ�ʼ
	//�Ƚϵ�ǰcurrent�ڵ����һ���ڵ��Ƿ����Ŀ��ֵval
	//��ֹֻ������ֻ��һ���ڵ㣬����Ŀ��ֵ����������ֵ����Ŀ��ֵ��
    public ListNode removeElements(ListNode head, int val) {
        ListNode tempHead=new ListNode(-1);
        tempHead.next=head;
        ListNode current=tempHead;
    	while (current.next!=null){
    		if (current.next.val==val) {
    			current.next.val=current.next.val;
    			current.next=current.next.next;
    		}else{
    		    current=current.next;
            }
    	}
    	return tempHead.next;
    }
}
