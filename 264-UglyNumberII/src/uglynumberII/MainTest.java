//264. 丑数 II
//编写一个程序，找出第 n 个丑数。
//丑数就是只包含质因数 2, 3, 5 的正整数。
//示例:
//输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
//说明:  
//1 是丑数。
//n 不超过1690。
package uglynumberII;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int testSolution=10;
		Solution Test=new Solution();
		System.out.println(Test.nthUglyNumber(testSolution));
	}
}
