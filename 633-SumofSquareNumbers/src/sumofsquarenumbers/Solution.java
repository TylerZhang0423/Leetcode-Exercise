//633. ƽ����֮��
//����һ���Ǹ����� c ����Ҫ�ж��Ƿ������������ a �� b��ʹ�� a2 + b2 = c��
//ʾ��1:
//����: 5
//���: True
//����: 1 * 1 + 2 * 2 = 5
//ʾ��2:
//����: 3
//���: False
package sumofsquarenumbers;

public class Solution {
    public boolean judgeSquareSum(int c) {
    	double temp=Math.ceil(Math.sqrt(c));//ceil ����ȡ��
    	int midnum=(int) temp;
    	int i=0;
        for (;i<=midnum;i++) {
        	for (int j=i;j<=midnum;j++) {
        		if (i*i+j*j==c||i*i*2==c) {
        			return true;
        		}
        	}
        }
    	return false;
    }
}
