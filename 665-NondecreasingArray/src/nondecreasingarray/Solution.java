//665. �ǵݼ�����
//����һ������Ϊ n ���������飬����������ж������ı� 1 ��Ԫ�ص�����£��������ܷ���һ���ǵݼ����С�
//��������������һ���ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1]��
//ʾ�� 1:
//����: [4,2,3]
//���: True
//����: �����ͨ���ѵ�һ��4���1��ʹ������Ϊһ���ǵݼ����С�
//ʾ�� 2:
//����: [4,2,1]
//���: False
//����: �㲻����ֻ�ı�һ��Ԫ�ص�����½����Ϊ�ǵݼ����С�
//˵��:  n �ķ�ΧΪ [1, 10,000]��
package nondecreasingarray;

public class Solution {
    public boolean checkPossibility(int[] nums) {
    	int flag=0;
        for (int i=0;i<nums.length-1;i++) {
        	if (nums[i]>nums[i+1]) {
        		flag++;
        		if (i>0) {
        			if (nums[i]==nums[i-1]) {
        				nums[i+1]=nums[i];
        			}else if (nums[i]>nums[i-1]) {
        				if (nums[i+1]>=nums[i-1]) {
        					nums[i]=nums[i-1];
        				}else {
        					nums[i+1]=nums[i];
        				}
        			}
        			i=i-2;
        		}else if(i==0) {
        			nums[i]=nums[i+1];
        		}
        	}
        }
        if (flag>1) {
        	return false;
        }else {
        	return true;
        }
    }
}
