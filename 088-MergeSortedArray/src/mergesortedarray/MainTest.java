//88. 合并两个有序数组
//给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，
//使得 num1 成为一个有序数组。
//说明:
//初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//示例:
//输入:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//输出: [1,2,2,3,5,6]
package mergesortedarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] testArray1= {4,0,0,0,0,0};
		int num1=1;
		int[] testArray2= {1,2,3,5,6};
		int num2=5;
		Solution Test=new Solution();
		Test.merge(testArray1, num1, testArray2, num2);
		for (int i=0;i<num1+num2;i++) {
			System.out.print(testArray1[i]+" ");
		}
	}
}
