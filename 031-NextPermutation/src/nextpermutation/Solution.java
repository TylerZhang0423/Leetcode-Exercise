//31. ��һ������
//ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
//�����������һ����������У��������������г���С�����У����������У���
//����ԭ���޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣
//������һЩ���ӣ�����λ������У�����Ӧ���λ���Ҳ��С�
//1,2,3 �� 1,3,2
//3,2,1 �� 1,2,3
//1,1,5 �� 1,5,1
package nextpermutation;

import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
    	int temp=0;
    	int i=nums.length-1;
        for (;i>0;i--) {
        	if (nums[i]<=nums[i-1]) {      		
        		continue;
        	}else {
        		int key=findSubmin(nums, i, nums[i-1]);
        		int k=findIndex(nums, i-1, key);   
        		temp=nums[k];
	        	nums[k]=nums[i-1];
	        	nums[i-1]=temp;
	        	int[] newArray=Arrays.copyOfRange(nums, i, nums.length);
	        	Arrays.sort(newArray);     		
	        	for (int j=i;j<nums.length;j++) {
	        		nums[j]=newArray[j-i];
	        	}
	        	break;
        	}
        }
        if (i==0) {
        	Arrays.sort(nums);
        }
    }
    public int findSubmin(int[] arr, int i, int key) {
    	for (int j=i;j<arr.length;j++) {
    		if (arr[j]<=key) {
    			return arr[j-1];
    		}
    	}
    	return arr[arr.length-1];
	}
    public int findIndex(int[] arr, int i, int key) {
		for (int j=i; j<arr.length; j++) {
			if (arr[j]==key&&j!=i) {
				return j;
			}
		}
		return 0;
	}
}
