//32. ���Ч����
//����һ��ֻ���� '(' �� ')' ���ַ������ҳ���İ�����Ч���ŵ��Ӵ��ĳ��ȡ�
//ʾ�� 1:
//����: "(()"
//���: 2
//����: ���Ч�����Ӵ�Ϊ "()"
//ʾ�� 2:
//����: ")()())"
//���: 4
//����: ���Ч�����Ӵ�Ϊ "()()"
package longestvalidparentheses;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String testSolution="(()";
		//String testSolution="()()((()";
		Solution Test=new Solution();
		System.out.println(Test.longestValidParentheses(testSolution));
	}
}
