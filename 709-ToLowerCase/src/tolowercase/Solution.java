//709. ת����Сд��ĸ
//ʵ�ֺ��� ToLowerCase()���ú�������һ���ַ������� str��
//�������ַ����еĴ�д��ĸת����Сд��ĸ��֮�󷵻��µ��ַ�����
//ʾ�� 1��
//����: "Hello"
//���: "hello"
//ʾ�� 2��
//����: "here"
//���: "here"
package tolowercase;

public class Solution {
	public String toLowerCase(String str) {
		char[] result=new char[str.length()];
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)<=90&&str.charAt(i)>=65) {
				result[i]=(char)((int)str.charAt(i)+32);
			}else {
				result[i]=str.charAt(i);
			}
		}
		return String.valueOf(result);
    }
}
