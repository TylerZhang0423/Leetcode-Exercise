//14. �����ǰ׺
//��дһ�������������ַ��������е������ǰ׺��
//��������ڹ���ǰ׺�����ؿ��ַ��� ""��
//ʾ�� 1:
//����: ["flower","flow","flight"]
//���: "fl"
//ʾ�� 2:
//����: ["dog","racecar","car"]
//���: ""
//����: ���벻���ڹ���ǰ׺��
//˵��:
//��������ֻ����Сд��ĸ a-z ��
package longestcommonprefix;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		String[] testSolution= {"flower","flow","flight"};
		String[] testSolution= {"a","a","aabc","aa","acc"};
		Solution Test=new Solution();
		System.out.println(Test.longestCommonPrefix(testSolution));
	}
}
