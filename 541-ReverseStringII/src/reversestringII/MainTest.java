//541. ��ת�ַ��� II
//����һ���ַ�����һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰk���ַ����з�ת��
//���ʣ������ k ���ַ�����ʣ�������ȫ����ת��
//�����С�� 2k �����ڻ���� k ���ַ�����תǰ k ���ַ�������ʣ����ַ�����ԭ����
//ʾ��:
//����: s = "abcdefg", k = 2
//���: "bacdfeg"
//Ҫ��:
//���ַ���ֻ����Сд��Ӣ����ĸ��
//�����ַ����ĳ��Ⱥ� k ��[1, 10000]��Χ�ڡ�
package reversestringII;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="abcd";
		int K=2;
		Solution Test=new Solution();
		System.out.println(Test.reverseStr(testString, K));
	}
}
