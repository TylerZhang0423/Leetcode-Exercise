//20. ��Ч������
//����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
//��Ч�ַ��������㣺
//�����ű�������ͬ���͵������űպϡ�
//�����ű�������ȷ��˳��պϡ�
//ע����ַ����ɱ���Ϊ����Ч�ַ�����
//ʾ�� 1:
//����: "()"
//���: true
//ʾ�� 2:
//����: "()[]{}"
//���: true
package validparentheses;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String testArray="[";
		Solution Test=new Solution();
		System.out.println(Test.isValid(testArray));
	}
}
