//189. ��ת����
//����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
//ʾ�� 1:
//����: [1,2,3,4,5,6,7] �� k = 3
//���: [5,6,7,1,2,3,4]
//����:
//������ת 1 ��: [7,1,2,3,4,5,6]
//������ת 2 ��: [6,7,1,2,3,4,5]
//������ת 3 ��: [5,6,7,1,2,3,4]
//ʾ�� 2:
//����: [-1,-100,3,99] �� k = 2
//���: [3,99,-1,-100]
//����: 
//������ת 1 ��: [99,-1,-100,3]
//������ת 2 ��: [3,99,-1,-100]
//˵��:
//�������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
//Ҫ��ʹ�ÿռ临�Ӷ�Ϊ O(1) ��ԭ���㷨��
package rotatearray;

public class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int temp=0;
        if (k<nums.length/2) {
        	for (int i=k;i>0;i--) {
        		temp=nums[nums.length-1];
        		for (int j=nums.length-1;j>=1;j--) {
        			nums[j]=nums[j-1];
        		}
        		nums[0]=temp;
        	}
        }else {
        	for (int i=nums.length-k;i>0;i--) {
        		temp=nums[0];
        		for (int j=0;j<=nums.length-2;j++) {
        			nums[j]=nums[j+1];
        		}
        		nums[nums.length-1]=temp;
        	}
        }
    }
}
