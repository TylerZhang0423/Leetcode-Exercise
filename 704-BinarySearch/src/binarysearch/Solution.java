//704. ���ֲ���
//����һ�� n ��Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target  ��
//дһ���������� nums �е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
//ʾ�� 1:
//����: nums = [-1,0,3,5,9,12], target = 9
//���: 4
//����: 9 ������ nums �в����±�Ϊ 4
//ʾ�� 2:
//����: nums = [-1,0,3,5,9,12], target = 2
//���: -1
//����: 2 ������ nums ����˷��� -1
//��ʾ��
//����Լ��� nums �е�����Ԫ���ǲ��ظ��ġ�
//n ���� [1, 10000]֮�䡣
//nums ��ÿ��Ԫ�ض����� [-9999, 9999]֮�䡣
package binarysearch;
public class Solution {
    public int search(int[] nums, int target) {
    	if (nums.length<=2) {
    		for (int i=0;i<nums.length;i++) {
    			if (nums[i]==target) {
    				return i;
    			}
    		}
    		return -1;
    	}
    	int maxBound=nums.length-1;
    	int minBound=0;
        while (true) {
        	int mid=(int)Math.ceil((maxBound+minBound)/2);
        	if (mid==maxBound||mid==minBound) {
        		return -1;
        	}
        	if (nums[mid]==target) {
        		return mid;
        	}else if (nums[mid]>target) {
        		maxBound=mid;
        	}else {
        		minBound=mid;
        	}
        }
    }
}
