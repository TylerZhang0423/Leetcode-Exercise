//283. �ƶ���
//����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
//ʾ��:
//����: [0,1,0,3,12]
//���: [1,3,12,0,0]
//˵��:
//������ԭ�����ϲ��������ܿ�����������顣
//�������ٲ���������
//��Ҫ˼·����������������0һ���ƶ���ĩβ��ʣ�µ�����˳��ǰ��
package movezeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int i=0;i<nums.length;i++) {
        	int count=0;
        	if (nums[i]==0) {
        		for (int j=i;j<nums.length;j++) {
        			if (nums[j]==0) {
        				count++;
        			}else {
        				break;
        			}
        		}
        		for (int k=i;k<nums.length-count;k++) {
        			nums[k]=nums[k+count];
        		}
        		for (int m=nums.length-1;m>nums.length-count-1;m--) {
        			nums[m]=0;
        		}
        	}
        }
    }
}
