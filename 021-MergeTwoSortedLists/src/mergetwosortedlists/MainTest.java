//21. 合并两个有序链表
//将两个有序链表合并为一个新的有序链表并返回。
//新链表是通过拼接给定的两个链表的所有节点组成的。 
//示例：
//输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
package mergetwosortedlists;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testL1=new ListNode(4);
		ListNode temp=new ListNode(2);
		temp.setNext(testL1);
		testL1=temp;
		temp=new ListNode(1);
		temp.setNext(testL1);
		testL1=temp;
		ListNode testL2=new ListNode(4);
		temp=new ListNode(3);
		temp.setNext(testL2);
		testL2=temp;
		temp=new ListNode(1);
		temp.setNext(testL2);
		testL2=temp;
		Solution Test=new Solution();
		ListNode testResult=Test.mergeTwoLists(testL1, testL2);
		while (testResult!=null) {
			if (testResult.getNext()==null) {
				System.out.print(testResult.val);
			}else {
				System.out.print(testResult.val+"-->");
			}
			testResult=testResult.getNext();
		}
	}
}
