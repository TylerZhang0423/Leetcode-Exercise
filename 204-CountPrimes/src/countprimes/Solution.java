//204. ��������
//ͳ������С�ڷǸ����� n ��������������
//ʾ��:
//����: 10
//���: 4
//����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
package countprimes;

public class Solution {
    public int countPrimes(int n) {
    	int count=0;
        for (int j=1;j<n;j++) {
        	if (isPrime(j)) {
        		count++;
        	}
        }
        return count;
    }
    public boolean isPrime(int m) {
    	if (m<2||m==4) {
    		return false;
    	}else if (m==2||m==3) {
    		return true;
    	}else {
    		for (int i=2;i*i<=m;i++) {
    			if (m%i==0) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
