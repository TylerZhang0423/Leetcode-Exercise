//633. 平方数之和
//给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
//示例1:
//输入: 5
//输出: True
//解释: 1 * 1 + 2 * 2 = 5
//示例2:
//输入: 3
//输出: False
package sumofsquarenumbers;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int testC=13;
		Solution Test=new Solution();
		System.out.println(Test.judgeSquareSum(testC));
	}
}
