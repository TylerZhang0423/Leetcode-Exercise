//88. �ϲ�������������
//�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�
//ʹ�� num1 ��Ϊһ���������顣
//˵��:
//��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
//����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
//ʾ��:
//����:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//���: [1,2,2,3,5,6]
package mergesortedarray;

import java.util.Arrays;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	if (m>=n) {
    		for (int k=m;k<m+n;k++) {
    			nums1[k]=nums2[k-m];
    		}
    		Arrays.sort(nums1);
    	}else if (m==0){
    		for (int i=0;i<n;i++) {
    			nums1[i]=nums2[i];
    		}
    	}else {
    		for (int k=m;k<m+n;k++) {
    			nums1[k]=nums2[k-m];
    		}
    		Arrays.sort(nums1);
    	}
    }
}
