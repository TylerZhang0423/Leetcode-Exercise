//747. �������������������������
//��һ������������nums�У����Ǵ���һ�����Ԫ�� ��
//���������е����Ԫ���Ƿ�������������ÿ���������ֵ�������
//����ǣ��򷵻����Ԫ�ص����������򷵻�-1��
//ʾ�� 1:
//����: nums = [3, 6, 1, 0]
//���: 1
//����: 6����������, ���������е���������,
//6��������������Ԫ�ص�������6��������1, �������Ƿ���1.
package largestnumberatleasttwiceofothers;

public class Solution {
    public int dominantIndex(int[] nums) {
        int max1=0;int index1=0;
        int max2=0;int index2=0;
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]>=max1) {
        		max2=max1;
        		index2=index1;
        		max1=nums[i];
        		index1=i;
        	}else {
        		if (nums[i]>=max2) {
        			max2=nums[i];
        			index2=i;
        		}
        	}
        }
        if (max1>=2*max2) {
        	return index1;
        }else {
        	return -1;
        }
    }
}
