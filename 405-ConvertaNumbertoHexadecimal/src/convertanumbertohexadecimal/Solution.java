//405. ����ת��Ϊʮ��������
//����һ����������дһ���㷨�������ת��Ϊʮ�������������ڸ�����������ͨ��ʹ�� �������� ������
//ע��:
//ʮ��������������ĸ(a-f)��������Сд��
//ʮ�������ַ����в��ܰ��������ǰ���㡣���Ҫת������Ϊ0����ô�Ե����ַ�'0'����ʾ��
//�������������ʮ�������ַ����еĵ�һ���ַ���������0�ַ��� 
//��������ȷ����32λ�з���������Χ�ڡ�
//����ʹ���κ��ɿ��ṩ�Ľ�����ֱ��ת�����ʽ��Ϊʮ�����Ƶķ�����
//ʾ�� 1��
//����:
//26
//���:
//"1a"
//ʾ�� 2��
//����:
//-1
//���:
//"ffffffff"
package convertanumbertohexadecimal;
import java.util.Stack ;
public class Solution {
    public String toHex(int num) {
    	if (num==0) {
    		return "0";
    	}
        Stack<Integer> stack=new Stack<>();
        Stack<Long> stack1=new Stack<>();//���������͵�ջ
        String result="";
        if (num>0) {
        	while (num>0) {
        		stack.push(num%16);
        		num=num/16;
        	}
        	while (!stack.empty()) {
        		if (stack.peek()<10) {
        			result=result.concat(String.valueOf(stack.peek()));
        		}else {
        			result=result.concat(String.valueOf((char)(stack.peek()+87)));
        		}
        		stack.pop();
        	}
        }else if (num<0) {//������16�����ò��봦��Ҳ��ffffffff+num+1
            long num1=4294967295l+num+1;//�˴���Ҫ�����ʹ���
        	while (num1>0) {
        		stack1.push(num1%16);
        		num1=num1/16;
        	}
        	while (!stack1.empty()) {
        		if (stack1.peek()<10) {
        			result=result.concat(String.valueOf(stack1.peek()));
        		}else {
        			result=result.concat(String.valueOf((char)(stack1.peek()+87)));
        		}
        		stack1.pop();
        	}
        }       
        return result;
    }
}
