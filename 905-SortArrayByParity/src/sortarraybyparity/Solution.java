package sortarraybyparity;
//905-����ż��������
//����һ���Ǹ���������A������һ����A������ż��Ԫ����ɵ����飬�����A����������Ԫ�ء�
public class Solution {
    public int[] sortArrayByParity(int[] A) {
    	int i=0;
    	while(i<A.length) {
    		for (int count=0;count<A.length-1;count++){
    			if (A[count]%2==1&&A[count+1]%2==0) {
    				int temp=0;
    				temp=A[count+1];
    				A[count+1]=A[count];
    				A[count]=temp;
    			}
    		}
    		i++;
    	}
        return A;
    }
}
