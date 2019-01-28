//268. 缺失数字
//给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
//示例 1:
//输入: [3,0,1]
//输出: 2
package missingnumber;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] TestArr= {3,0,1};
		Solution Test=new Solution();
		System.out.println(Test.missingNumber(TestArr));
	}
}
