//896. ��������
//��������ǵ��������򵥵��ݼ��ģ���ô���ǵ����ġ�
//����������� i <= j��A[i] <= A[j]����ô���� A �ǵ��������ġ� 
//����������� i <= j��A[i]> = A[j]����ô���� A �ǵ����ݼ��ġ�
//������������ A �ǵ�������ʱ���� true�����򷵻� false��
package monotonicarray;

public class Solution {
    public boolean isMonotonic(int[] A) {
    	if (A.length==1)
    		return true;
    	int j=0;
    	while(A[j]==A[j+1]&&j<A.length-2) {
    	   j++;
    	}	
        if (A[j]>A[j+1]) {
        	for (int i=j+1;i<A.length-1;i++) {
        		if (A[i]<A[i+1]) {
        			return false;
        		}
        	}
        }else {
        	for (int i=j+1;i<A.length-1;i++) {
        		if (A[i]>A[i+1]) {
        			return false;
        		}
        	} 
        }
        return true;
    }
}
