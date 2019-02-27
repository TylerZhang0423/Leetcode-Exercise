//204. 计数质数
//统计所有小于非负整数 n 的质数的数量。
//示例:
//输入: 10
//输出: 4
//解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
package countprimes;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int testSolution=10;//2,3,5,7,11,13
		Solution Test=new Solution();
		System.out.print("小于 10 的质数一共有 "+Test.countPrimes(testSolution)+" 个");
	}
}