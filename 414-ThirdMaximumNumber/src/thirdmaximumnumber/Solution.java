//414. ���������
//����һ���ǿ����飬���ش������е����������
//��������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��
//ʾ�� 1:
//����: [3, 2, 1]
//���: 1
//����: ����������� 1.
//ʾ�� 2:
//����: [1, 2]
//���: 2
//����: ���������������, ���Է��������� 2 .
//ʾ�� 3:
//����: [2, 2, 3, 1]
//���: 1
//����: ע�⣬Ҫ�󷵻ص������������ָ��������Ψһ���ֵ�����
//��������ֵΪ2���������Ƕ��ŵڶ���
//��Ҫ˼·����һ����СΪ3������洢ǰ���������ѭ��һ�飬ÿ�������������Ա�
//����Ҫ���������ʼ����ֵ�����������а�����-2147483648
package thirdmaximumnumber;

public class Solution {
    public int thirdMax(int[] nums) {
    	int[] result={-2147483648,-2147483648,-2147483648};
        int flag1=0;
        int flag2=0;
        for (int i=0;i<nums.length;i++) {
             if (nums[i]==-2147483648&&flag2<1) {
                 flag1++;
                 flag2++;
             }
        	if (nums[i]>result[2]) {
        		result[0]=result[1];
        		result[1]=result[2];
        		result[2]=nums[i];
                flag1++;
        	}else if (nums[i]>result[1]&&nums[i]<result[2]) {
        		result[0]=result[1];
        		result[1]=nums[i];
                flag1++;
        	}else if (nums[i]>result[0]&&nums[i]<result[1]){
        		result[0]=nums[i];
                flag1++;
        	}else if (nums[i]==result[0]||nums[i]==result[1]||nums[i]==result[2]) {
                continue;
            }
        }
        if (flag1<=2) {
        	return result[2];
        }else {
        	return result[0];
        }
    }
}
