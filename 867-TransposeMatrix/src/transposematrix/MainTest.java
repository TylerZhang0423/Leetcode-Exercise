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

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
