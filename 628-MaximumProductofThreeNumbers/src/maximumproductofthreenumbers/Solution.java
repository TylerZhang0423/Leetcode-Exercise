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
//��Ҫ˼·���������飬��ȡ�����У�������������С�����������˻�Ӧ�ó������������ĳ˻�����С�������˻������ֵ
//�Ա��������������������������
package maximumproductofthreenumbers;

public class Solution {
    public int maximumProduct(int[] nums) {
    	int[] maxNumber={-1001,-1001,-1001};
    	int[] minNumber={1001,1001};
    	for (int i=0;i<nums.length;i++) {
    		updateMax(maxNumber,nums[i]);
    		updateMin(minNumber,nums[i]);
    	}
    	int result1=maxNumber[0]*maxNumber[1]*maxNumber[2];
    	int result2=minNumber[0]*minNumber[1]*maxNumber[2];
    	return max(result1,result2);
    }
    //�洢��������ֵ
    public void updateMax(int[] array,int x) {
    	if (x>array[2]) {
    		array[0]=array[1];
    		array[1]=array[2];
    		array[2]=x;
    	}else if (x>=array[1]&&x<=array[2]) {
    		array[0]=array[1];
    		array[1]=x;
    	}else if (x>=array[0]&&x<=array[1]) {
    		array[0]=x;
    	}
    }
    //�洢��С������ֵ
    public void updateMin(int[] array,int x) {
    	if (x<array[0]) {
    		array[1]=array[0];
    		array[0]=x;
    	}else if (x>=array[0]&&x<=array[1]) {
    		array[1]=x;
    	}
    }
    public int max(int a,int b) {
    	if (a>=b) {
    		return a;
    	}else {
    		return b;
    	}
    }
}