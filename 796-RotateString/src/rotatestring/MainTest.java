//796. ��ת�ַ���
//���������ַ���, A �� B��
//A ����ת�������ǽ� A ����ߵ��ַ��ƶ������ұߡ� 
//����, �� A = 'abcde'�����ƶ�һ��֮��������'bcdea' ��
//��������ɴ���ת����֮��A �ܱ��B����ô����True��
//ʾ�� 1:
//����: A = 'abcde', B = 'cdeab'
//���: true
//ʾ�� 2:
//����: A = 'abcde', B = 'abced'
//���: false
//ע�⣺A �� B ���Ȳ����� 100��
package rotatestring;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testA="abcde";
		String testB="abced";
		Solution Test=new Solution();
		System.out.println(Test.rotateString(testA, testB));
	}
}
