//396. ��ת����
//����һ������Ϊ n ���������� A ��
//���� Bk ������ A ˳ʱ����ת k ��λ�ú�����飬���Ƕ��� A �ġ���ת������ F Ϊ��
//F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]��
//����F(0), F(1), ..., F(n-1)�е����ֵ��
//ע��:
//������Ϊ n ��ֵС�� 10^5��
//ʾ��:
//A = [4, 3, 2, 6]
//F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
//F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
//F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
//F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
//���� F(0), F(1), F(2), F(3) �е����ֵ�� F(3) = 26 ��
package rotatefunction;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={4,3,2,6};
		Solution Test=new Solution();
		System.out.println(Test.maxRotateFunction(testArray));
	}
}
