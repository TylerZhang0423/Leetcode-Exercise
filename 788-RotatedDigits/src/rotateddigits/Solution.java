//788. ��ת����
//���ǳ�һ���� X Ϊ����, �������ÿλ��������ر���ת 180 �Ⱥ�
//�����Կ��Եõ�һ����Ч�ģ��Һ� X ��ͬ������Ҫ��ÿλ���ֶ�Ҫ����ת��
//���һ������ÿλ���ֱ���ת�Ժ���Ȼ����һ�����֣� �����������Ч�ġ�
//0, 1, �� 8 ����ת����Ȼ�������Լ���
//2 �� 5 ���Ի�����ת�ɶԷ���6 �� 9 ͬ��
//������Щ����������������ת�Ժ󶼲�������Ч�����֡�
//����������һ�������� N, ����� 1 �� N ���ж��ٸ��� X �Ǻ�����
//ʾ��:
//����: 10
//���: 4
//����: 
//��[1, 10]�����ĸ������� 2, 5, 6, 9��
//ע�� 1 �� 10 ���Ǻ���, ��Ϊ��������ת֮�󲻱䡣
//ע��:N ��ȡֵ��Χ�� [1, 10000]��
package rotateddigits;

public class Solution {
    public int rotatedDigits(int N) {
    	int count=N;
        for (int i=1;i<=N;i++) {
        	if (!isGoodnum(i)) {
        		count--;
        	}
        }
        return count;
    }
    public boolean isGoodnum (int num) {
    	String s=String.valueOf(num);
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='7') {
    			return false;
    		}
    	}
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='2'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='9') {
    			return true;
    		}
    	} 
    	return false;
    }
}
