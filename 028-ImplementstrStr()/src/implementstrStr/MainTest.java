//28. ʵ��strStr()
//ʵ�� strStr() ������
//����һ�� haystack �ַ�����һ�� needle �ַ�����
//�� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)��
//��������ڣ��򷵻�  -1��
//ʾ�� 1:
//����: haystack = "hello", needle = "ll"
//���: 2
//ʾ�� 2:
//����: haystack = "aaaaa", needle = "bba"
//���: -1
//˵��:
//�� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
//���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
package implementstrStr;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testSolution="mississippi";
		String testNeedle="issip";
		Solution Test=new Solution();
		System.out.println(Test.strStr(testSolution, testNeedle));//���4
	}
}
