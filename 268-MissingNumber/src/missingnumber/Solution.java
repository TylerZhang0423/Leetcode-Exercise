//268. ȱʧ����
//����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����
//ʾ�� 1:
//����: [3,0,1]
//���: 2
package missingnumber;

public class Solution {
    public int missingNumber(int[] nums) {
        int temp=0;
        //����ð�������������飬����Ч�ʵͣ��˴�Ӧ�ÿ��ԸĽ�
        for (int i=0;i<nums.length-1;i++) {
        	for (int j=0;j<nums.length-i-1;j++) {
        		if (nums[j]>nums[j+1]) {
        			temp=nums[j];
        			nums[j]=nums[j+1];
        			nums[j+1]=temp;
        		}
        	}
        }
        int k=0;
        for (;k<nums.length;k++) {
        	if (nums[k]!=k) {
        		return k;
        	}
        }
        return k;
    }
}
