//674. �������������
//����һ��δ��������������飬�ҵ���������ĵĵ������С�
//ʾ�� 1:
//����: [1,3,5,4,7]
//���: 3
//����: ��������������� [1,3,5], ����Ϊ3��
//���� [1,3,5,7] Ҳ�������������, �������������ģ���Ϊ5��7��ԭ�����ﱻ4������ 
//ʾ�� 2:
//����: [2,2,2,2,2]
//���: 1
//����: ��������������� [2], ����Ϊ1��
//ע�⣺���鳤�Ȳ��ᳬ��10000��
package longestcontinuousincreasingsubsequence;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testSolution= {1,3,5,4,7};
		Solution Test=new Solution();
		System.out.println(Test.findLengthOfLCIS(testSolution));
	}
}
