//75. ��ɫ����
//����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬
//ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
//�����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
//ע��:
//����ʹ�ô�����е����������������⡣
//ʾ��:
//����: [2,0,2,1,1,0]
//���: [0,0,1,1,2,2]
package sortcolors;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testSolution={2,0,2,1,1,0};
		int[] testSolution={1,2,0};
		Solution Test=new Solution();
		Test.sortColors(testSolution);
		for (int k=0;k<testSolution.length;k++) {
			System.out.print(testSolution[k]+" ");
		}
	}
}
