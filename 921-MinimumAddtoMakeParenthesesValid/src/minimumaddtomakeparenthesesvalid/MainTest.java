//921. ʹ������Ч���������
//����һ���� '(' �� ')' ������ɵ��ַ��� S��������Ҫ������ٵ����ţ� '(' ���� ')'��
//�������κ�λ�ã�����ʹ�õ��������ַ�����Ч��
//����ʽ�Ͻ���ֻ���������漸��֮һ�������ַ���������Ч�ģ�
//����һ�����ַ���������
//�����Ա�д�� AB ��A �� B ���ӣ�, ���� A �� B ������Ч�ַ���������
//�����Ա�д�� (A)������ A ����Ч�ַ�����
//����һ�������ַ���������Ϊʹ����ַ�����Ч��������ӵ�����������.
//ʾ�� 1��
//���룺"())"
//�����1
//ʾ�� 2��
//���룺"((("
//�����3
package minimumaddtomakeparenthesesvalid;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String testArray=")()";
		Solution Test=new Solution();
		System.out.println(Test.minAddToMakeValid(testArray));//���1
		System.out.println(Test.minAddToMakeValid("())"));//���1
		System.out.println(Test.minAddToMakeValid("()))(("));//���4
	}
}
