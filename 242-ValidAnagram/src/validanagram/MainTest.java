//���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�
//ʾ�� 1:
//����: s = "anagram", t = "nagaram"
//���: true
package validanagram;

public class MainTest {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String Test_s="anagram";
		String Test_t="nagaral";
		Solution TestValid=new Solution();
		System.out.println(TestValid.isAnagram(Test_s, Test_t));
	}
}