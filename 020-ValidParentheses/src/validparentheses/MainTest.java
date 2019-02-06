//20. 有效的括号
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。
//示例 1:
//输入: "()"
//输出: true
//示例 2:
//输入: "()[]{}"
//输出: true
package validparentheses;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String testArray="[";
		Solution Test=new Solution();
		System.out.println(Test.isValid(testArray));
	}
}
