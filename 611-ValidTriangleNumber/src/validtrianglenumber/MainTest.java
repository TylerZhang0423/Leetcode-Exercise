//611. ��Ч�����εĸ���
//����һ�������Ǹ����������飬���������ͳ�����п�����������������ߵ���Ԫ�������
//ʾ�� 1:
//����: [2,2,3,4]
//���: 3
//����:
//��Ч�������: 
//2,3,4 (ʹ�õ�һ�� 2)
//2,3,4 (ʹ�õڶ��� 2)
//2,2,3
//ע��:
//���鳤�Ȳ�����1000��
//�����������ķ�ΧΪ [0, 1000]��
package validtrianglenumber;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={2,2,3,4};
		Solution Test=new Solution();
		System.out.println(Test.triangleNumber(testArray));
	}
}
