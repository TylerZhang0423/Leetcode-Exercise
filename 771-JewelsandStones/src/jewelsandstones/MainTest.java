//771. ��ʯ��ʯͷ
//�����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� 
//S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
//J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
//ʾ�� 1:
//����: J = "aA", S = "aAAbbbb"
//���: 3
//ʾ�� 2:
//����: J = "z", S = "ZZ"
//���: 0
package jewelsandstones;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String testJ="aA";
		String testS="aAAbbbb";
		Solution Test=new Solution();
		System.out.println(Test.numJewelsInStones(testJ, testS));
	}
}
