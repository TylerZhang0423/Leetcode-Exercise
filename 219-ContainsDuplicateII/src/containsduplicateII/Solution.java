//219. �����ظ�Ԫ�� II
//����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��
//ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k��
//ʾ�� 1:
//����: nums = [1,2,3,1], k = 3
//���: true
//ʾ�� 2:
//����: nums = [1,0,1,1], k = 1
//���: true
//ʾ�� 3:
//����: nums = [1,2,3,1,2,3], k = 2
//���: false
package containsduplicateII;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if (nums.length<=k) {
    		for (int i=1;i<nums.length;i++) {
    			if (nums[i]==nums[0]) {
    				return true;
    			}
    		}
    	}else {
    		for (int i=0;i<nums.length-1;i++) {
    			for (int j=i+1;j<=i+k&&j<nums.length;j++) {
    				if (nums[i]==nums[j]) {
    					return true;
    				}
    			}
    		}
    	}
    	return false;
    }
}
