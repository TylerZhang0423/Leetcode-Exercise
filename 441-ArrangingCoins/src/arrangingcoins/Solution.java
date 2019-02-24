//441. ����Ӳ��
//���ܹ��� n öӲ�ң�����Ҫ�����ǰڳ�һ��������״���� k �оͱ��������� k öӲ�ҡ�
//����һ������ n���ҳ����γ����������е���������
//n ��һ���Ǹ�������������32λ�з������͵ķ�Χ�ڡ�
//ʾ�� 1:
//n = 5
//Ӳ�ҿ����г����¼���:
//��
//�� ��
//�� ��
//��Ϊ�����в����������Է���2.
//ʾ�� 2:
//n = 8
//Ӳ�ҿ����г����¼���:
//��
//�� ��
//�� �� ��
//�� ��
//��Ϊ�����в����������Է���3.
package arrangingcoins;

public class Solution {
    public int arrangeCoins(int n) {
        int maxBound=n;
        int minBound=1;
        int mid=0;
        while (true) {
        	mid = (int)Math.ceil(minBound+(maxBound-minBound)/2);
        	if (mid==maxBound||mid==minBound) {
        		if (n-sum(maxBound)<maxBound+1) {
        			return maxBound;
        		}else if (n-sum(minBound)<minBound+1){
        			return minBound;
        		}else {
        			return -1;
        		}
        	}
        	if (n-sum(mid)<mid+1) {
        		return mid;
        	}else if (n-sum(mid)>mid+1) {
        		minBound=mid;
        	}else if (sum(mid)>=n){
        		maxBound=mid;
        	}
        }
    }
    
    public int sum(int num) {
    	int sumResult=0;
    	for (int j=1;j<=num;j++) {
    		sumResult=sumResult+j;
    	}
    	return sumResult;
    }
}
