//83. 删除排序链表中的重复元素
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
//示例 1:
//输入: 1->1->2
//输出: 1->2
//示例 2:
//输入: 1->1->2->3->3
//输出: 1->2->3
package removeduplicatesfromsortedlist;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode testSolution=new ListNode(1);
		ListNode testHead=testSolution;
		testSolution.next=new ListNode(1);
		testSolution=testSolution.next;
		testSolution.next=new ListNode(2);
		Solution Test=new Solution();
		ListNode testResult=Test.deleteDuplicates(testHead);
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
