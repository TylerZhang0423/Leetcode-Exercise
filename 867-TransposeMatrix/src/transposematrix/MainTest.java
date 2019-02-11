//867转置矩阵
//给定一个矩阵 A， 返回 A 的转置矩阵。
//矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
//示例 1：
//输入：[[1,2,3],[4,5,6],[7,8,9]]
//输出：[[1,4,7],[2,5,8],[3,6,9]]
//示例 2：
//输入：[[1,2,3],[4,5,6]]
//输出：[[1,4],[2,5],[3,6]]
//提示：
//1 <= A.length <= 1000
//1 <= A[0].length <= 1000
package transposematrix;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int[][] testSolution= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] testSolution= {{1,4},{2,5},{3,6}};
		Solution Test=new Solution();
		int[][] testResult=Test.transpose(testSolution);
		for (int m=0;m<testResult.length;m++) {
			for (int n=0;n<testResult[0].length;n++) {
				System.out.print(testResult[m][n]+" ");
			}
			System.out.println();
		}
	}
}
