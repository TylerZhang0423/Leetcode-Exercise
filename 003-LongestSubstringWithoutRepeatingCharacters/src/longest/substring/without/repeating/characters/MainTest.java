//3. ���ظ��ַ�����Ӵ�
//����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
//ʾ�� 1:
//����: "abcabcbb"
//���: 3 
//����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
//ʾ�� 2:
//����: "bbbbb"
//���: 1
//����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1��
//ʾ�� 3:
//����: "pwwkew"
//���: 3
//����: ��Ϊ���ظ��ַ�����Ӵ��� "wke"�������䳤��Ϊ 3��
//��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke" ��һ�������У������Ӵ���
package longest.substring.without.repeating.characters;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="pwwkew";
		Solution Test=new Solution();
		System.out.println(Test.lengthOfLongestSubstring(testString));
	}
}
