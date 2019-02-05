//203. 移除链表元素
//删除链表中等于给定值 val 的所有节点。
//示例:
//输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
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
	//在原链表的前面加一个节点，从第0个元素开始
	//比较当前current节点的下一个节点是否等于目标值val
	//防止只有链表只有一个节点，就是目标值；或者所有值都是目标值。
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
