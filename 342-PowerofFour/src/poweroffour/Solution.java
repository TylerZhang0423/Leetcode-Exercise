//342. 4����
//����һ������ (32 λ�з�������)�����дһ���������ж����Ƿ��� 4 ���ݴη���
//ʾ�� 1:
//����: 16
//���: true
//ʾ�� 2:
//����: 5
//���: false
//���ף�
//���ܲ�ʹ��ѭ�����ߵݹ�����ɱ�����
package poweroffour;

public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num==1) {
            return true;
        }
        while (num>1) {
        	if (num%4!=0) {
        		return false;
        	}else {
        		num=num/4;
        	}
        	if (num==1) {
        		return true;
        	}
        }
        return false; 
    }
}
