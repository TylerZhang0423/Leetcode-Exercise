//922. ����ż�������� II
//����һ���Ǹ��������� A�� A ��һ��������������һ��������ż����
//��������������Ա㵱 A[i] Ϊ����ʱ��i Ҳ���������� A[i] Ϊż��ʱ�� i Ҳ��ż����
//����Է����κ���������������������Ϊ�𰸡�
//ʾ����
//���룺[4,2,5,7]
//�����[4,5,2,7]
//���ͣ�[4,7,2,5]��[2,5,4,7]��[2,7,4,5] Ҳ�ᱻ���ܡ�
//��ʾ��
//2 <= A.length <= 20000
//A.length % 2 == 0
//0 <= A[i] <= 1000
package sortarraybyparityII;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
    	int[] res = new int[A.length];
    	int index1=1;
    	int index2=0;
    	for (int i=0;i<A.length;i++) {
    		if (A[i]%2==0) {
    			res[index2]=A[i];
    			index2=index2+2;
    		}else {
    			res[index1]=A[i];
    			index1=index1+2;
    		}
    	}
        return res;
    }
}
