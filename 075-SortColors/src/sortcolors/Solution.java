//75. ��ɫ����
//����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬
//ԭ�ض����ǽ�������ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�
//�����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��
//ע��:
//����ʹ�ô�����е����������������⡣
//ʾ��:
//����: [2,0,2,1,1,0]
//���: [0,0,1,1,2,2]
package sortcolors;
//��Ҫ˼·��һ�α�����0�ƶ�����ǰ�棬2�ƶ�������档
//������0����������2Ҫһ���ƶ�
//���2�ƶ��󣬻���������0����i--����0���ƶ���ǰ�档
public class Solution {
    public void sortColors(int[] nums) {
        for (int i=0;i<nums.length;i++) {
        	if (nums[i]==0&&i>0) {
        		int count1=0;
        		for (int k=i;k<nums.length;k++) {
        			if (nums[k]==0){
        				count1++;
        			}else {
        				break;
        			}
        		}
        		for (int j=i-1;j>=0;j--) {
        			nums[j+count1]=nums[j];
        		}
        		for (int m=0;m<count1;m++) {
        			nums[m]=0;
        		}       		
        	}else if (nums[i]==2&&i<nums.length-1) {
        		int count2=0;
        		for (int k=i;k<nums.length;k++) {
        			if (nums[k]==2){
        				count2++;
        			}else {
        				break;
        			}
        		}
        		for (int j=i+count2;j<=nums.length-1;j++) {
        			nums[j-count2]=nums[j];
        		}
        		for (int m=nums.length-1;m>nums.length-1-count2;m--) {
        			nums[m]=2;
        		}
        		if (nums[i]==0) {
        			i--;
        		}
        	}
        }
    }
}
