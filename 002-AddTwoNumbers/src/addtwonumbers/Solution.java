//2. 两数相加
//给出两个 非空 的链表用来表示两个非负的整数。
//其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//示例：
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
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
