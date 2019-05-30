//31. 下一个排列
//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
//如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
//必须原地修改，只允许使用额外常数空间。
//以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1
package nextpermutation;
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testArray={2,2,7,5,4,3,2,2,1};
		int[] testArray={3,2,1};
		Solution Test=new Solution();
		Test.nextPermutation(testArray);
		for (int i=0;i<testArray.length;i++) {
			System.out.print(testArray[i]+" ");
		}
	}
}
