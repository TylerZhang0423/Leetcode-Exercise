//1. ����֮��
//����һ���������� nums ��һ��Ŀ��ֵ target��
//�����ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
//����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
//ʾ��:
//���� nums = [2, 7, 11, 15], target = 9
//��Ϊ nums[0] + nums[1] = 2 + 7 = 9
//���Է��� [0, 1]
package twosum;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] index=new int[2];
        for (int i=0;i<numbers.length;i++) {
        	for (int j=i+1;j<numbers.length;j++) {
        		if (numbers[i]+numbers[j]==target) {
        			index[0]=i;
        			index[1]=j;
        			return index;
        		}
        	}
        }
        return index;
    }
}

