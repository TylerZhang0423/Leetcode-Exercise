//345. 反转字符串中的元音字母
//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
//示例 1:
//输入: "hello"
//输出: "holle"
//示例 2:
//输入: "leetcode"
//输出: "leotcede"
//说明:
//元音字母不包含字母"y"。
package reversevowelsofastring;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="leetcode";
		//String testString="";
		Solution Test=new Solution();
		String result=Test.reverseVowels(testString);
		System.out.println(result);
	}
}
