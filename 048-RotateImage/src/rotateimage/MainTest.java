//48. 旋转图像
//给定一个 n × n 的二维矩阵表示一个图像。
//将图像顺时针旋转 90 度。
//说明：
//你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
//示例 1:
//给定 matrix = 
//[
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//],
//原地旋转输入矩阵，使其变为:
//[
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//]
package rotateimage;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//int[][] testSolution= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] testSolution= { {5,1,9,11},
								{2,4,8,10},
								{13,3,6,7},
								{15,14,12,16}};
		Solution Test=new Solution();
		Test.rotate(testSolution);
		for (int m=0;m<testSolution.length;m++) {
			for (int n=0;n<testSolution[0].length;n++) {
				System.out.print(testSolution[m][n]+" ");
			}
			System.out.println();
		}
	}
}
