//27. �Ƴ�Ԫ��
//����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
//Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
package removeelement;

public class Solution {
	public int removeElement(int[] nums, int val) {
        int count2=0;
        for (int count1=0;count1<nums.length;count1++){
            if (nums[count1]!=val){
                nums[count2]=nums[count1];
                count2++;
            }
        }
        return count2;
    }
}
