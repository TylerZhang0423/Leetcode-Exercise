//844. �ȽϺ��˸���ַ���
//���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
//ʾ�� 1��
//���룺S = "ab#c", T = "ad#c"
//�����true
//���ͣ�S �� T ������ ��ac����
//ʾ�� 2��
//���룺S = "ab##", T = "c#d#"
//�����true
//���ͣ�S �� T ������ ������

//˼·��������#��ջ������#������һ�������Ա�����ջ�Ƿ����
package backspacestringcompare;
import java.util.Stack ;
public class Solution {
    public boolean backspaceCompare(String S, String T) {
    	Stack<Character> stack1= new Stack<Character>();
    	Stack<Character> stack2= new Stack<Character>();
    	for (int i=0;i<S.length();i++) {
    		if (S.charAt(i)!='#') {
    			stack1.push(S.charAt(i));
    		}else {
    			if (stack1.empty()) {
    				continue;
    			}else {
    				stack1.pop();
    			}
    		}
    	}
    	for (int j=0;j<T.length();j++) {
    		if (T.charAt(j)!='#') {
    			stack2.push(T.charAt(j));
    		}else {
    			if (stack2.empty()) {
    				continue;
    			}else {
    				stack2.pop();
    			}
    		}
    	}
    	if (stack1.equals(stack2)) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
