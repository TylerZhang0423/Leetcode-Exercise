//21. 合并两个有序链表
//将两个有序链表合并为一个新的有序链表并返回。
//新链表是通过拼接给定的两个链表的所有节点组成的。 
//示例：
//输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//主要思路：利用额外空间，构造一个新的链表result，设置一个head指向result的头部
//比较l1和l2的头部元素大小，小的元素接到新链表的后面，然后l1和l2自增
package mergetwosortedlists;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode result=null;//存储结果的新链表空间
    	ListNode head=null;//指向链表头部
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
        //如果l1或者l2中的一个自增为空，则直接将剩下的接到result后面即可
        if (l1==null) {
        	result.next=l2;
        }else {
        	result.next=l1;
        }
        return head;
    }
}
