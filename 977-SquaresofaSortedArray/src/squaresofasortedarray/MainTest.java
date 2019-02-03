//977. 有序数组的平方
//给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。 
//示例 1：
//输入：[-4,-1,0,3,10]
//输出：[0,1,9,16,100]
package squaresofasortedarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] testArray= {-4,-1,0,3,10};
		Solution Test=new Solution();
		int[] result=Test.sortedSquares(testArray);
		for (int k=0;k<result.length;k++) {
			System.out.print(result[k]+" ");
		}
	}

}
