//665. �ǵݼ�����
//����һ������Ϊ n ���������飬����������ж������ı� 1 ��Ԫ�ص�����£��������ܷ���һ���ǵݼ����С�
//��������������һ���ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1]��
//ʾ�� 1:
//����: [4,2,3]
//���: True
//����: �����ͨ���ѵ�һ��4���1��ʹ������Ϊһ���ǵݼ����С�
//ʾ�� 2:
//����: [4,2,1]
//���: False
//����: �㲻����ֻ�ı�һ��Ԫ�ص�����½����Ϊ�ǵݼ����С�
//˵��:  n �ķ�ΧΪ [1, 10,000]��
package nondecreasingarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray= {2,3,3,2,4};
		Solution Test=new Solution();
		System.out.println(Test.checkPossibility(testArray));
	}
}
