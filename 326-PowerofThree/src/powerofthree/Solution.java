//326. 3����
//����һ��������дһ���������ж����Ƿ��� 3 ���ݴη���
//ʾ�� 1:
//����: 27
//���: true
//ʾ�� 2:
//����: 0
//���: false
//ʾ�� 3:
//����: 9
//���: true
//ʾ�� 4:
//����: 45
//���: false
//���ף�
//���ܲ�ʹ��ѭ�����ߵݹ�����ɱ�����
package powerofthree;

public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==1) {
            return true;
        }
        while (n>1) {
        	if (n%3!=0) {
        		return false;
        	}else {
        		n=n/3;
        	}
        	if (n==1) {
        		return true;
        	}
        }
        return false;
    }
}
