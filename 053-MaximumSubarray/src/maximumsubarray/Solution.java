//53. ��������
//����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ���
//���������͡�
//ʾ��:
//����: [-2,1,-3,4,-1,2,1,-5,4],
//���: 6
//����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
package maximumsubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
    	if (nums.length==1) {
    		return nums[0];
    	}
    	int flag=0;
    	for (int i=0;i<nums.length;i++) {
    		if (nums[i]<0) {
    			flag++;
    		}
    	}
    	int maxTemp=nums[0];
    	if (flag==nums.length) {
    		for (int k=1;k<nums.length;k++) {
    			if (nums[k]>=maxTemp) {
    				maxTemp=nums[k];
    			}
    		}
    		return maxTemp;
    	}//������һ���ж�ȫ������Ĳ��֣�ѡȡ�����е����ֵ���ɣ�����ķ����޷�����ȫ�����顣
        int maxSum=0;
        int temp=0;
        for (int j=0;j<nums.length;j++) {
        	temp=temp+nums[j];
        	if (temp>maxSum) {
        		maxSum=temp;
        	}
        	if (temp<0){
        		temp=0;
        	}
        }
        return maxSum;
    }
}
