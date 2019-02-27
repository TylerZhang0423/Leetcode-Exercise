//75. 颜色分类
//给定一个包含红色、白色和蓝色，一共 n 个元素的数组，
//原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
//此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
//注意:
//不能使用代码库中的排序函数来解决这道题。
//示例:
//输入: [2,0,2,1,1,0]
//输出: [0,0,1,1,2,2]
package sortcolors;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testSolution={2,0,2,1,1,0};
		int[] testSolution={1,2,0};
		Solution Test=new Solution();
		Test.sortColors(testSolution);
		for (int k=0;k<testSolution.length;k++) {
			System.out.print(testSolution[k]+" ");
		}
	}
}
