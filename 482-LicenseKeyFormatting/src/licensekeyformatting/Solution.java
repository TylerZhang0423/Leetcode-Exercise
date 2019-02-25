//482. ��Կ��ʽ��
//����һ����Կ�ַ���S��ֻ������ĸ�������Լ� '-'�����ۺţ���N �� '-' ���ַ����ֳ��� N+1 �顣
//����һ������ K�����¸�ʽ���ַ��������˵�һ���������⣬
//ÿ������Ҫ���� K ���ַ�����һ����������Ҫ���� 1 ���ַ���
//��������֮���� '-'�����ۺţ����������ҽ����е�Сд��ĸת��Ϊ��д��ĸ��
//�����ǿ��ַ��� S ������ K���������������Ĺ�����и�ʽ����
//ʾ�� 1��
//���룺S = "5F3Z-2e-9-w", K = 4
//�����"5F3Z-2E9W"
//���ͣ��ַ��� S ���ֳ����������֣�ÿ���� 4 ���ַ���
//ע�⣬������������ۺ���Ҫɾ����
//ʾ�� 2��
//���룺S = "2-5g-3-J", K = 2
//�����"2-5G-3J"
//���ͣ��ַ��� S ���ֳ��� 3 �����֣�����ǰ��Ĺ�����������һ���ֵ��ַ��������ڸ��������������ಿ�ֽ�Ϊ 2 ���ַ���
//��ʾ:
//S �ĳ��Ȳ����� 12,000��K Ϊ������
//S ֻ������ĸ���֣�a-z��A-Z��0-9���Լ����ۺ�'-'
//S �ǿ�
package licensekeyformatting;
import java.util.Stack ;
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
    	String result="";
    	int flag=0;
    	Stack<Character> stack=new Stack<>();
    	for (int i=0;i<S.length();i++) {
    		if (S.charAt(i)!='-') {
    			stack.push(S.charAt(i));
    		}
    	}
    	while (!stack.isEmpty()) {
    		if (flag<K) {
    			if (stack.peek()>=97) {
    				result=String.valueOf((char)(stack.peek()-32))+result;
    			}else {
    				result=String.valueOf(stack.peek())+result;
    			}
				stack.pop();
				flag++;
    		}else {
    			result="-"+result;
    			flag=0;
    		}
    	}
    	return result;
    }
}
