//977. ���������ƽ��
//����һ�����ǵݼ�˳��������������� A������ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������ 
//ʾ�� 1��
//���룺[-4,-1,0,3,10]
//�����[0,1,9,16,100]
package squaresofasortedarray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i=0;i<A.length;i++) {
        	A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
