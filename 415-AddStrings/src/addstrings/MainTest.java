//415. 字符串相加
//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//注意：
//num1 和num2 的长度都小于 5100.
//num1 和num2 都只包含数字 0-9.
//num1 和num2 都不包含任何前导零。
//你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
package addstrings;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="3";
		String num2="84";
		Solution Test=new Solution();
		System.out.println(Test.addStrings(num1, num2));
	}
}
