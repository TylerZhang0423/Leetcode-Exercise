//231. 2����
//����һ����������дһ���������ж����Ƿ��� 2 ���ݴη���
//ʾ�� 1:
//����: 1
//���: true
//����: 20 = 1
//ʾ�� 2:
//����: 16
//���: true
//����: 24 = 16
//ʾ�� 3:
//����: 218
//���: false
package poweroftwo;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) {
            return true;
        }
        while (n>1) {
        	if (n%2!=0) {
        		return false;
        	}else {
        		n=n/2;
        	}
        	if (n==1) {
        		return true;
        	}
        }
        return false; 
    }
}
