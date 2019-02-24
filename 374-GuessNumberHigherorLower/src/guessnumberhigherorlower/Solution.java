//374. �����ִ�С
//����������һ����������Ϸ�� ��Ϸ�������£�
//�Ҵ� 1 �� n ѡ��һ�����֡� ����Ҫ����ѡ�����ĸ����֡�
//ÿ����´��ˣ��һ��������������Ǵ��˻���С�ˡ�
//�����һ��Ԥ�ȶ���õĽӿ� guess(int num)�����᷵�� 3 �����ܵĽ����-1��1 �� 0����
//-1 : �ҵ����ֱȽ�С
// 1 : �ҵ����ֱȽϴ�
// 0 : ��ϲ����¶��ˣ�
//ʾ�� :
//����: n = 10, pick = 6
//���: 6
package guessnumberhigherorlower;

public class Solution {
    public int guessNumber(int n) {
    	int maxBound=n;
    	int minBound=0;
    	int mid=0;
    	while (true) {
    		mid=(int)Math.ceil(minBound+(maxBound-minBound)/2);
    		//���м�ֵ������(max+min)/2����ʽ������������������м�ֵ�������Ĳ�һ��
    		//��min+(max-min)/2����ʽ��ֹ���
    		if (mid==maxBound||mid==minBound) {
        		if (guess(maxBound)==0) {
        			return maxBound;
        		}else if (guess(minBound)==0){
        			return minBound;
        		}else {
        			return -1;
        		}
        	}
        	if (guess(mid)==0) {
        		return mid;
        	}else if (guess(mid)==-1) {
        		maxBound=mid;
        	}else {
        		minBound=mid;
        	}
    	}
    }
    public int guess(int num) {
    	int pick=1702766719;
    	if (pick>num) {
    		return 1;
    	}else if (pick<num) {
    		return -1;
    	}else {
    		return 0;
    	}
    }
}
