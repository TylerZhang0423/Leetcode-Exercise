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

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
