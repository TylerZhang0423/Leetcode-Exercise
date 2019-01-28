package searchinsertposition;
//035. 搜索插入位置
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//你可以假设数组中无重复元素。
//示例 1:
//输入: [1,3,5,6], 5
//输出: 2
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=new Solution();
		int[] TestArray= {1,3,5,6};
		System.out.print(Test.searchInsert(TestArray, 5));
	}

}
