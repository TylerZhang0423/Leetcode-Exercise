//264. ���� II
//��дһ�������ҳ��� n ��������
//��������ֻ���������� 2, 3, 5 ����������
//ʾ��:
//����: n = 10
//���: 12
//����: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 ��ǰ 10 ��������
//˵��:  
//1 �ǳ�����
//n ������1690��
package uglynumberII;

public class Solution {
    public int nthUglyNumber(int n) {
        int flag=0;
    	for (int i=1;;i++) {
        	if (isUgly(i)) {
        		flag++;
        	}
        	if (flag==n) {
        		return i;
        	}
        }
    }
    public boolean isUgly(int num) {
    	if (num==1) {
    		return true;
    	}
    	if (num<=0) {
    		return false;
    	}
        while (num>1||num<-1) {
        	if (num%2==0) {
        		num=num/2;
        	}else if (num%3==0) {
        		num=num/3;
        	}else if (num%5==0) {
        		num=num/5;
        	}else {
        		return false;
        	}
        }
        return true;
    }
}
