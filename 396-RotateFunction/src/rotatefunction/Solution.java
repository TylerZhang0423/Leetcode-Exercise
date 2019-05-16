//396. ��ת����
//����һ������Ϊ n ���������� A ��
//���� Bk ������ A ˳ʱ����ת k ��λ�ú�����飬���Ƕ��� A �ġ���ת������ F Ϊ��
//F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]��
//����F(0), F(1), ..., F(n-1)�е����ֵ��
//ע��:
//������Ϊ n ��ֵС�� 10^5��
//ʾ��:
//A = [4, 3, 2, 6]
//F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
//F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
//F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
//F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
//���� F(0), F(1), F(2), F(3) �е����ֵ�� F(3) = 26 ��
package rotatefunction;

import java.util.Arrays;

public class Solution {
    public int maxRotateFunction(int[] A) {
    	if (A.length==0) {
    		return 0;
    	}
        int[] newArray=new int[A.length];
        for (int i=0; i<A.length; i++) {
        	int sum=0;
        	for (int j=0;j<A.length;j++) {
        		if (i+j>A.length-1) {
        			sum=sum+j*A[i+j-A.length];
        		}else {
        			sum=sum+j*A[i+j];
        		}
        	}
        	newArray[i]=sum;
        }
        Arrays.sort(newArray);
        return newArray[A.length-1];
    }
}
