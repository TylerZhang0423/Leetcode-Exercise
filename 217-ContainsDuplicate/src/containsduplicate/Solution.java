package containsduplicate;
//����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
//����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��
public class Solution {
    public boolean containsDuplicate(int[] nums) {
    	if (nums.length==0)
    		return false;
    	if (nums.length==1)
    		return false;
        long s=1;
        for(int count2=0;count2<nums.length;count2++) {
        	for(int count1=0;count1<nums.length-1;count1++) {
        		if (nums[count1]>nums[count1+1]) {
        			int temp;
        			temp=nums[count1+1];
        			nums[count1+1]=nums[count1];
        			nums[count1]=temp;
        		}
        	}
        }
        for (int i=0;i<nums.length-1;i++){
        	if (s>1)
        		s=1;
            s=(nums[i]^nums[i+1])*s;
        }
        if (s==0)
        	return true;
        else
        	return false;
    }
}
