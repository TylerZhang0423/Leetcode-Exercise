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
//思路说明：先将矩阵沿x轴对称翻转，然后转置
public class Solution {
    public void rotate(int[][] matrix) {
    	int temp=0;
        for (int i=0;i<matrix.length/2;i++) {
        	for (int j=0;j<matrix.length;j++) {
        		temp=matrix[i][j];
        		matrix[i][j]=matrix[matrix.length-1-i][j];
        		matrix[matrix.length-i-1][j]=temp;
        	}
        }
        for (int i=0;i<matrix.length;i++) {
        	for (int j=i;j<matrix.length;j++) {
        		temp=matrix[i][j];
        		matrix[i][j]=matrix[j][i];
        		matrix[j][i]=temp;
        	}
        }
    }
}
