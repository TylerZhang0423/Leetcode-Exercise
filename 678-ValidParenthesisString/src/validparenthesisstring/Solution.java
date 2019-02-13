//678. ��Ч�������ַ���
//����һ��ֻ���������ַ����ַ������� ���� �� *��дһ����������������ַ����Ƿ�Ϊ��Ч�ַ�����
//��Ч�ַ����������¹���
//�κ������� ( ��������Ӧ�������� )��
//�κ������� ) ��������Ӧ�������� ( ��
//������ ( �����ڶ�Ӧ��������֮ǰ )��
//* ���Ա���Ϊ���������� ) ���򵥸������� ( ����һ�����ַ�����
//һ�����ַ���Ҳ����Ϊ��Ч�ַ�����
//ʾ�� 1:
//����: "()"
//���: True
//ʾ�� 2:
//����: "(*)"
//���: True
//ʾ�� 3:
//����: "(*))"
//���: True
//ע��:
//�ַ�����С���� [1��100] ��Χ�ڡ�
package validparenthesisstring;
import java.util.Stack ;
public class Solution {
    public boolean checkValidString(String s) {
    	Stack<Character> stack1 = new Stack<Character>();
    	Stack<Character> stack2 = new Stack<Character>();
    	Stack<Character> stack3 = new Stack<Character>();
    	Stack<Character> stack4 = new Stack<Character>();
    	//�ȴ�������ѭ��һ��
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='(') {
    			stack1.push(s.charAt(i));
    		}else if (s.charAt(i)=='*') {
    			stack2.push(s.charAt(i));
    		}
    		else {
    			if (stack1.empty()&&stack2.empty()) {
    				return false;
    			}else {
    				if (stack1.empty()==false&&stack2.empty()==false) {
    					if (s.charAt(i)==')'&&stack1.peek()=='(') {
    						stack1.pop();
    						continue;
    					}else {
    						stack2.pop();
    						continue;
    					}
    				}else if (stack1.empty()==false&&stack2.empty()==true) {
    					if (s.charAt(i)==')'&&stack1.peek()=='(') {
    						stack1.pop();
    						continue;
    					}else {
    						return false;
    					}
    				}else if (stack1.empty()==true&&stack2.empty()==false) {
    					stack2.pop();
    					continue;
    				}
    			}
    		}
    	}
    	//��������ѭ��
    	for (int i=s.length()-1;i>=0;i--) {
    		if (s.charAt(i)==')') {
    			stack3.push(s.charAt(i));
    		}else if (s.charAt(i)=='*') {
    			stack4.push(s.charAt(i));
    		}
    		else {
    			if (stack3.empty()&&stack4.empty()) {
    				return false;
    			}else {
    				if (stack3.empty()==false&&stack4.empty()==false) {
    					if (s.charAt(i)=='('&&stack3.peek()==')') {
    						stack3.pop();
    						continue;
    					}else {
    						stack4.pop();
    						continue;
    					}
    				}else if (stack3.empty()==false&&stack4.empty()==true) {
    					if (s.charAt(i)=='('&&stack3.peek()==')') {
    						stack3.pop();
    						continue;
    					}else {
    						return false;
    					}
    				}else if (stack3.empty()==true&&stack4.empty()==false) {
    					stack4.pop();
    					continue;
    				}
    			}
    		}
    	}
    	
    	if (stack1.size()<=stack2.size()||stack1.empty()==true) {
    		return true;
    	}else {
    		return false;
    	}
    }
}


//if (s.charAt(i)==')'&&stack1.peek()=='(') {
//stack1.pop();
//continue;
//}else if (s.charAt(i)=='}'&&stack1.peek()=='{') {
//stack1.pop();
//continue;
//}else if (s.charAt(i)==']'&&stack1.peek()=='[') {
//stack1.pop();
//continue;
//}else {
//return false;