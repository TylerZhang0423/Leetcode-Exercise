//628. �����������˻�
//����һ���������飬���������ҳ�����������ɵ����˻������������˻���
//ʾ�� 1:
//����: [1,2,3]
//���: 6
//ʾ�� 2:
//����: [1,2,3,4]
//���: 24
//ע��:
//�������������鳤�ȷ�Χ��[3,104]�����������е�Ԫ�ط�Χ��[-1000, 1000]��
//����������������������ĳ˻����ᳬ��32λ�з��������ķ�Χ��
package maximumproductofthreenumbers;

public class Solution {
    public int maximumProduct(int[] nums) {
        int minNumber=0;
        int midNumber=0;
        int maxNumber=0;
        if (nums[0]<=nums[1]&&nums[1]<=nums[2]) {
        	minNumber=nums[0];
        	midNumber=nums[1];
        	maxNumber=nums[2];
        }else if (nums[0]<=nums[2]&&nums[2]<=nums[1]) {
        	minNumber=nums[0];
        	midNumber=nums[2];
        	maxNumber=nums[1];
        }else if (nums[1]<=nums[0]&&nums[0]<=nums[2]) {
        	minNumber=nums[1];
        	midNumber=nums[0];
        	maxNumber=nums[2];
        }else if (nums[1]<=nums[2]&&nums[2]<=nums[0]) {
        	minNumber=nums[1];
        	midNumber=nums[2];
        	maxNumber=nums[0];
        }else if (nums[2]<=nums[0]&&nums[0]<=nums[1]) {
        	minNumber=nums[2];
        	midNumber=nums[0];
        	maxNumber=nums[1];
        }else {
        	minNumber=nums[2];
        	midNumber=nums[1];
        	maxNumber=nums[0];
        }
        int result=nums[0]*nums[1]*nums[2];
        for (int i=3;i<nums.length;i++) {
        	if (nums[i]>minNumber) {
        		result=result*nums[i]/minNumber;
        		if (nums[i]>=maxNumber) {
        			maxNumber=nums[i];
        		}else if (nums[i]>=midNumber&&nums[i]<maxNumber) {
        			midNumber=nums[i];
        		}else {
        			minNumber=nums[i];
        		}
        	}
        }
        return result;
    }
}
