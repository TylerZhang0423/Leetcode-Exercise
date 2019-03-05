//206. 反转链表
//反转一个单链表。
//示例:
//输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL
package reverselinkedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;		
		for (int i=2;i<=5;i++) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		Solution Test=new Solution();
		ListNode testResult=Test.reverseList(testHead);
		while (testResult!=null) {
			if (testResult.next==null) {
				System.out.print(testResult.val);
			}else {
				System.out.print(testResult.val+"-->");
			}
			testResult=testResult.next;
		}
	}
}
