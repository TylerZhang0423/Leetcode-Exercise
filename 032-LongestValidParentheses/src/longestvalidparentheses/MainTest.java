//32. 最长有效括号
//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
//示例 1:
//输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
//示例 2:
//输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
package longestvalidparentheses;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String testSolution="(()";
		//String testSolution="()()((()";
		Solution Test=new Solution();
		System.out.println(Test.longestValidParentheses(testSolution));
	}
}
