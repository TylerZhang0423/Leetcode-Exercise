//219. 存在重复元素 II
//给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
//使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
//示例 1:
//输入: nums = [1,2,3,1], k = 3
//输出: true
//示例 2:
//输入: nums = [1,0,1,1], k = 1
//输出: true
//示例 3:
//输入: nums = [1,2,3,1,2,3], k = 2
//输出: false
package containsduplicateII;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] testNums={1,2,3,4,5,6,7,8,9,9};
        int KEY=3;
        Solution Test=new Solution();
        System.out.println(Test.containsNearbyDuplicate(testNums, KEY));
	}
}
