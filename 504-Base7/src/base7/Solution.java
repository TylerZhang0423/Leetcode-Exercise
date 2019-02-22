//504. �߽�����
//����һ������������ת��Ϊ7���ƣ������ַ�����ʽ�����
//ʾ�� 1:
//����: 100
//���: "202"
//ʾ�� 2:
//����: -7
//���: "-10"
//ע��: ���뷶Χ�� [-1e7, 1e7] ��
package base7;
import java.util.Stack ;
public class Solution {
    public String convertToBase7(int num) {
    	if (num==0) {
    		return "0";
    	}
        Stack<Integer> stack=new Stack<>();
        String result="";
        if (num>0) {
        	while (num>0) {
        		stack.push(num%7);
        		num=num/7;
        	}
        	while (!stack.empty()) {
        		result=result.concat(String.valueOf(stack.peek()));
        		stack.pop();
        	}
        }else if (num<0) {
        	result=result.concat("-");
        	while (num<0) {
        		stack.push(num%7);
        		num=num/7;
        	}
        	while (!stack.empty()) {
        		result=result.concat(String.valueOf(stack.peek()));
        		stack.pop();
        	}
        }
        
        return result;
    }
}
