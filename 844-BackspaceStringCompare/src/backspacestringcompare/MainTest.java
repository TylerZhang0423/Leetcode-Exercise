//844. �ȽϺ��˸���ַ���
//���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
//ʾ�� 1��
//���룺S = "ab#c", T = "ad#c"
//�����true
//���ͣ�S �� T ������ ��ac����
//ʾ�� 2��
//���룺S = "ab##", T = "c#d#"
//�����true
//���ͣ�S �� T ������ ������
package backspacestringcompare;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String testS="ab#c";
		String testT="ad#c";
		Solution Test=new Solution();
		System.out.println(Test.backspaceCompare(testS, testT));
	}
}
