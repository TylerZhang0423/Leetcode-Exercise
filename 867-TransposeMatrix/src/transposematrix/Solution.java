//867ת�þ���
//����һ������ A�� ���� A ��ת�þ���
//�����ת����ָ����������Խ��߷�ת���������������������������
//ʾ�� 1��
//���룺[[1,2,3],[4,5,6],[7,8,9]]
//�����[[1,4,7],[2,5,8],[3,6,9]]
//ʾ�� 2��
//���룺[[1,2,3],[4,5,6]]
//�����[[1,4],[2,5],[3,6]]
//��ʾ��
//1 <= A.length <= 1000
//1 <= A[0].length <= 1000
package transposematrix;

public class Solution {
    public int[][] transpose(int[][] A) {
        int[][]result = new int [A[0].length][A.length];
        for (int i=0;i<result.length;i++) {
        	for (int j=0;j<result[0].length;j++) {
        		result[i][j]=A[j][i];
        	}
        }
        return result;
    }
}
