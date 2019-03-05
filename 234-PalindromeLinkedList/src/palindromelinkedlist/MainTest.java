//234. 回文链表
//请判断一个链表是否为回文链表。
//示例 1:
//输入: 1->2
//输出: false
//示例 2:
//输入: 1->2->2->1
//输出: true
package palindromelinkedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;		
		for (int i=2;i<=5;i++) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		for (int i=5;i>=1;i--) {
			testSolution.next=new ListNode(i);
			testSolution=testSolution.next;
		}
		Solution Test=new Solution();
		System.out.println(Test.isPalindrome(testHead));
	}
}
