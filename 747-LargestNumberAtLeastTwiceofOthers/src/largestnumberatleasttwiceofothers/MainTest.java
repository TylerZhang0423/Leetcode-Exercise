//747. �������������������������
//��һ������������nums�У����Ǵ���һ�����Ԫ�� ��
//���������е����Ԫ���Ƿ�������������ÿ���������ֵ�������
//����ǣ��򷵻����Ԫ�ص����������򷵻�-1��
//ʾ�� 1:
//����: nums = [3, 6, 1, 0]
//���: 1
//����: 6����������, ���������е���������,
//6��������������Ԫ�ص�������6��������1, �������Ƿ���1.
package largestnumberatleasttwiceofothers;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArray= {0,0,3,2};
		Solution Test=new Solution();
		System.out.println(Test.dominantIndex(testArray));
	}
}
