//611. ��Ч�����εĸ���
//����һ�������Ǹ����������飬���������ͳ�����п�����������������ߵ���Ԫ�������
//ʾ�� 1:
//����: [2,2,3,4]
//���: 3
//����:
//��Ч�������: 
//2,3,4 (ʹ�õ�һ�� 2)
//2,3,4 (ʹ�õڶ��� 2)
//2,2,3
//ע��:
//���鳤�Ȳ�����1000��
//�����������ķ�ΧΪ [0, 1000]��
package validtrianglenumber;

import java.util.Arrays;

public class Solution {
    public int triangleNumber(int[] nums) {
    	int result=0;
    	Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
        	for (int j=i+1;j<nums.length-1;j++) {
        		for (int k=j+1;k<nums.length;k++) {
        			if (isTriangle(nums[i],nums[j],nums[k])) {
        				result++;
        			}else {
        				break;
        			}
        		}
        	}
        }
        return result;
    }
    public boolean isTriangle(int a,int b, int c) {   		
    	return a+b>c&&a+c>b&&b+c>a?true:false;
    }
}
