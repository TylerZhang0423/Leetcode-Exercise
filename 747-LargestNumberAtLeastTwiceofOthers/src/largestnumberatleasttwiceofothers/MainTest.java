//747. 至少是其他数字两倍的最大数
//在一个给定的数组nums中，总是存在一个最大元素 。
//查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
//如果是，则返回最大元素的索引，否则返回-1。
//示例 1:
//输入: nums = [3, 6, 1, 0]
//输出: 1
//解释: 6是最大的整数, 对于数组中的其他整数,
//6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
package largestnumberatleasttwiceofothers;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] testArray= {0,0,3,2};
		Solution Test=new Solution();
		System.out.println(Test.dominantIndex(testArray));
	}
}
