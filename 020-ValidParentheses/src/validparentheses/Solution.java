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
/******ջ�ĵ���Ӧ��******/
package validparentheses;
import java.util.Stack ;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
    			stack.push(s.charAt(i));
    		}else {
    			if (stack.empty()) {
    				return false;
    			}else {
    				if (s.charAt(i)==')'&&stack.peek()=='(') {
    					stack.pop();
    					continue;
    				}else if (s.charAt(i)=='}'&&stack.peek()=='{') {
    					stack.pop();
    					continue;
    				}else if (s.charAt(i)==']'&&stack.peek()=='[') {
    					stack.pop();
    					continue;
    				}else {
    					return false;
    				}
    			}
    		}
    	}
    	if (stack.empty()) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
