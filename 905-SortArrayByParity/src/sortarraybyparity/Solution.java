package sortarraybyparity;
//905-����ż��������
//����һ���Ǹ���������A������һ����A������ż��Ԫ����ɵ����飬�����A����������Ԫ�ء�
public class Solution {
    public int[] sortArrayByParity(int[] A) {
    	int length=A.length;
    	List<Integer> C=new ArrayList<>();
    	int []B=new int[length];
    	for (int count1=0;count1<B.length;count1++) {
    		for (int count=count1;count<A.length;count++){
    			if (A[count]%2==1)
    				continue;
    			if (A[count]%2==0) {
    				B[count1]=A[count];
    				count1=count1+1;
    				break;
    			}
    		}
    	}
        return B;
    }
}
