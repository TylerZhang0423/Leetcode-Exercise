//485. 最大连续1的个数
//给定一个二进制数组， 计算其中最大连续1的个数。
//示例 1:
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
package maxconsecutiveones;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] TestArr= {1,1,0,1,1,1};
		Solution Test=new Solution();
		System.out.println(Test.findMaxConsecutiveOnes(TestArr));
	}
}
