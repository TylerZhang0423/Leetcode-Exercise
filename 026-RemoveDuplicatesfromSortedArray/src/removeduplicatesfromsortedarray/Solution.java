//26. ɾ�����������е��ظ���
//����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
//�������� nums = [1,1,2], 
//����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 
//�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
package removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {
    	if (nums.length==0) {
    		return 0;
		}
    	if (nums.length==1) {
    		return 1;
    	}
    	if (nums[0]==nums[nums.length-1]) {
    		return 1;
    	}
    	int count1=0;
    	int count2=1;
    	for (;count2<nums.length;count2++) {
    		if (nums[count1]!=nums[count2]) {
    			count1++;
    			nums[count1]=nums[count2];
    		}
    	}
    	return count1+1;
    }
}
