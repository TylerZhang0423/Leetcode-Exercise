//485. �������1�ĸ���
//����һ�����������飬 ���������������1�ĸ�����
//ʾ�� 1:
//����: [1,1,0,1,1,1]
//���: 3
//����: ��ͷ����λ��������λ��������1�������������1�ĸ����� 3.
package maxconsecutiveones;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] TestArr= {1,1,0,1,1,1};
		Solution Test=new Solution();
		System.out.println(Test.findMaxConsecutiveOnes(TestArr));
	}
}
