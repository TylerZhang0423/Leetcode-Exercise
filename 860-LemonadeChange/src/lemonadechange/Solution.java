//860. ����ˮ����
//������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��
//�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����
//ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��
//������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��
//ע�⣬һ��ʼ����ͷû���κ���Ǯ��
//������ܸ�ÿλ�˿���ȷ���㣬���� true �����򷵻� false ��
//ʾ�� 1��
//���룺[5,5,5,10,20]
//�����true
//���ͣ�
//ǰ 3 λ�˿�������ǰ�˳����ȡ 3 �� 5 ��Ԫ�ĳ�Ʊ��
//�� 4 λ�˿����������ȡһ�� 10 ��Ԫ�ĳ�Ʊ�������� 5 ��Ԫ��
//�� 5 λ�˿���������һ�һ�� 10 ��Ԫ�ĳ�Ʊ��һ�� 5 ��Ԫ�ĳ�Ʊ��
//�������пͻ����õ�����ȷ�����㣬����������� true��
package lemonadechange;
import java.util.Stack ;
public class Solution {
    public boolean lemonadeChange(int[] bills) {
    	Stack<Integer> stack1=new Stack<>();
    	Stack<Integer> stack2=new Stack<>();
    	for (int i=0;i<bills.length;i++) {
    		if (bills[i]==5) {
    			stack1.push(bills[i]);
    		}else if (bills[i]==10) {
    			if (stack1.empty()) {
    				return false;
    			}else {
    				stack2.push(bills[i]);
    				stack1.pop();
    			}
    		}else {
    			if (stack1.empty()||(stack2.empty()&&stack1.size()<3)) {
    				return false;
    			}else {
    				if (!stack2.empty()) {
    					stack2.pop();
    					stack1.pop();
    				}else {
    					stack1.pop();
    					stack1.pop();
    					stack1.pop();
    				}
    			}
    		}
    	}
    	return true;
    }
}