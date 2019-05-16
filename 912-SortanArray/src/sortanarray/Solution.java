//912. ��������
//����һ���������� nums�����������������С�
//ʾ�� 1��
//���룺[5,2,3,1]
//�����[1,2,3,5]
//ʾ�� 2��
//���룺[5,1,1,2,0,0]
//�����[0,0,1,1,2,5]
//��ʾ��
//1 <= A.length <= 10000
//-50000 <= A[i] <= 50000
package sortanarray;

public class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0,nums.length-1);
        return nums;
    }

	private void quickSort(int[] nums, int start, int end) {
		if (start<end) {
			int standard=nums[start];
			int low=start;
			int high=end;
			while (low<high) {
				while (low<high&&standard<=nums[high]) {
					high--;
				}
				nums[low] = nums[high];
				while (low<high&&standard>=nums[low]) {
					low++;
				}
				nums[high] = nums[low];
			}
			nums[low]=standard;
			quickSort(nums,start,low);
			quickSort(nums,low+1,end);
		}	
	}
}
