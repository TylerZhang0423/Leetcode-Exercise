package searchinsertposition;
//����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
//����Լ������������ظ�Ԫ�ء�
//ʾ�� 1:
//����: [1,3,5,6], 5
//���: 2
public class Solution {
    public int searchInsert(int[] nums, int target) {
    	int count1=0;
    	for (;count1<nums.length;count1++) {
        	if (nums[count1]>=target) {
        		break;
        	}
        }
		return count1;
    }
}
