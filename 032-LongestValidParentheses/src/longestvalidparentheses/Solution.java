//32. ���Ч����
//����һ��ֻ���� '(' �� ')' ���ַ������ҳ���İ�����Ч���ŵ��Ӵ��ĳ��ȡ�
//ʾ�� 1:
//����: "(()"
//���: 2
//����: ���Ч�����Ӵ�Ϊ "()"
//ʾ�� 2:
//����: ")()())"
//���: 4
//����: ���Ч�����Ӵ�Ϊ "()()"
package longestvalidparentheses;

import java.util.Stack;
//˼·��һ��ѭ������ջ���ж��Ƿ���ԣ���ͬ�����ȵ��������洢�жϽ����
//�������Ч���ţ���Ӧ��λ���� 1��������0��
//���磺����������Ӧ0 1 1 
//�����Զ���һ��array�࣬��������Ԫ�أ�index�洢�±꣬value�洢�ַ�ֵ
//����һ��array���ջ��ջԪ�ؿ��Ա����±�ֵ
//һ��ѭ����������ջ��ʣ���Ԫ���������������Ӧλ����0��������Ϊû������ƥ������ţ���˲Ż�ʣ��ջ�ڣ�������Ӧλ��һ��������Ч��
//�����������������1���Ӵ�
public class Solution {
	public int longestValidParentheses(String s) {
		if (s.length()==0||s.length()==1) {
    		return 0;
    	}
		//����array���ջ
		Stack<array> stack=new Stack<array>();
		//�����ж�����
		int[] lengthNum=new int[s.length()];
		int maxLength=0;
    	int sum=0;
    	//����array�������
    	array[] temp=new array[s.length()];
    	//array�����鸳ֵ
    	for (int i=0;i<s.length();i++) {
    		temp[i]=new array();//ע�⣡�Զ������͵����飬ʹ��ʱ��Ҫ���newһ���ռ䣬��Ȼ�ᱨ��ָ�����
    		temp[i].index=i;
    		temp[i].value=s.charAt(i);
    	}
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='(') {//����������ţ����Խ�ջ����������Ч�ģ���Ӧλ����1
    			stack.push(temp[i]);
    			lengthNum[i]=1;
    		}else {
    			if (stack.empty()) {//���ջΪ�գ����������ţ�һ������Ч��
    				lengthNum[i]=0;
    			}else {
    				stack.pop();//���ջ�ǿգ��򵯳�һ��������ƥ�䣬���������Ҳ����Ч��
    				lengthNum[i]=1;
    			}
    		}
    	}
    	if (!stack.empty()) {//������ջ����ʣ��Ԫ�أ���Ѷ�ӦԪ�ص�λ����Ϊ0���ض���Ч
    		while (stack.size()>0) {
    			lengthNum[stack.peek().index]=0;//�±����ڴ˴�
    			stack.pop();
    		}
    	}
    	//ͳ���������1��������������Ч����
    	for (int k=0;k<lengthNum.length;k++) {
    		if (lengthNum[k]!=0) {
    			sum=sum+lengthNum[k];
    		}else {
    			sum=0;
    		}
    		if (sum>maxLength) {
    			maxLength=sum;
    		}
    	}
    	return maxLength;
	}
}
//�Զ����array�࣬�洢�ַ�ֵ���±�
class array{
	char value;
	int index;
}
