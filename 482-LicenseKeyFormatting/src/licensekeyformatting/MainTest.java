//482. ��Կ��ʽ��
//����һ����Կ�ַ���S��ֻ������ĸ�������Լ� '-'�����ۺţ���N �� '-' ���ַ����ֳ��� N+1 �顣
//����һ������ K�����¸�ʽ���ַ��������˵�һ���������⣬
//ÿ������Ҫ���� K ���ַ�����һ����������Ҫ���� 1 ���ַ���
//��������֮���� '-'�����ۺţ����������ҽ����е�Сд��ĸת��Ϊ��д��ĸ��
//�����ǿ��ַ��� S ������ K���������������Ĺ�����и�ʽ����
//ʾ�� 1��
//���룺S = "5F3Z-2e-9-w", K = 4
//�����"5F3Z-2E9W"
//���ͣ��ַ��� S ���ֳ����������֣�ÿ���� 4 ���ַ���
//ע�⣬������������ۺ���Ҫɾ����
//ʾ�� 2��
//���룺S = "2-5g-3-J", K = 2
//�����"2-5G-3J"
//���ͣ��ַ��� S ���ֳ��� 3 �����֣�����ǰ��Ĺ�����������һ���ֵ��ַ��������ڸ��������������ಿ�ֽ�Ϊ 2 ���ַ���
//��ʾ:
//S �ĳ��Ȳ����� 12,000��K Ϊ������
//S ֻ������ĸ���֣�a-z��A-Z��0-9���Լ����ۺ�'-'
//S �ǿ�
package licensekeyformatting;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testSolution="5F3Z-2e-9-w";
		int testK=4;
		Solution Test=new Solution();
		System.out.println(Test.licenseKeyFormatting(testSolution, testK));
	}
}