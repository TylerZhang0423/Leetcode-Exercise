//921. ʹ������Ч���������
//����һ���� '(' �� ')' ������ɵ��ַ��� S��������Ҫ������ٵ����ţ� '(' ���� ')'��
//�������κ�λ�ã�����ʹ�õ��������ַ�����Ч��
//����ʽ�Ͻ���ֻ���������漸��֮һ�������ַ���������Ч�ģ�
//����һ�����ַ���������
//�����Ա�д�� AB ��A �� B ���ӣ�, ���� A �� B ������Ч�ַ���������
//�����Ա�д�� (A)������ A ����Ч�ַ�����
//����һ�������ַ���������Ϊʹ����ַ�����Ч��������ӵ�����������.
//ʾ�� 1��
//���룺"())"
//�����1
//ʾ�� 2��
//���룺"((("
//�����3
package minimumaddtomakeparenthesesvalid;
import java.util.Stack ;
public class Solution {
    public int minAddToMakeValid(String S) {
    	Stack<Character> stack = new Stack<Character>();
    	int flag=0;
    	for (int i=0;i<S.length();i++) {
    		if (S.charAt(i)=='('||S.charAt(i)=='['||S.charAt(i)=='{') {
    			stack.push(S.charAt(i));
    		}else {
    			if (stack.empty()==true) {
    				if (i==S.length()-1) {
    					flag++;
    					return flag;
    				}else {
    					flag++;
    				}
    			}else {
    				if (S.charAt(i)==')'&&stack.peek()=='(') {
    					stack.pop();
    					continue;
    				}else if (S.charAt(i)=='}'&&stack.peek()=='{') {
    					stack.pop();
    					continue;
    				}else if (S.charAt(i)==']'&&stack.peek()=='[') {
    					stack.pop();
    					continue;
    				}else {
    					return -1;
    				}
    			}
    		}
    	}
    	if (stack.empty()==false) {
    		return stack.size()+flag;
    	}
    	if (stack.empty()==true) {
    		if (flag!=0) {
    			return flag;
    		}else {
    			return 0;
    		}
    	}
    	return -1;
    }
}