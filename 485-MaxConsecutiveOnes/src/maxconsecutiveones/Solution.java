//485. �������1�ĸ���
//����һ�����������飬 ���������������1�ĸ�����
//ʾ�� 1:
//����: [1,1,0,1,1,1]
//���: 3
//����: ��ͷ����λ��������λ��������1�������������1�ĸ����� 3.
package maxconsecutiveones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int max=0;
        for (int i=0;i<nums.length;i++) {
        	int flag=0;
        	if (nums[i]==1) {
        		int j=i;
        		while (j<=nums.length-1&&nums[j]==1) {
        			j++;flag++;
        		}
        	}
        	if (max<=flag) {
        		max=flag;
        	}
        }
        return max;
    }
}
