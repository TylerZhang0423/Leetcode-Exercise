//48. ��תͼ��
//����һ�� n �� n �Ķ�ά�����ʾһ��ͼ��
//��ͼ��˳ʱ����ת 90 �ȡ�
//˵����
//�������ԭ����תͼ������ζ������Ҫֱ���޸�����Ķ�ά�����벻Ҫʹ����һ����������תͼ��
//ʾ�� 1:
//���� matrix = 
//[
//  [1,2,3],
//  [4,5,6],
//  [7,8,9]
//],
//ԭ����ת�������ʹ���Ϊ:
//[
//  [7,4,1],
//  [8,5,2],
//  [9,6,3]
//]
package rotateimage;
//˼·˵�����Ƚ�������x��ԳƷ�ת��Ȼ��ת��
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
