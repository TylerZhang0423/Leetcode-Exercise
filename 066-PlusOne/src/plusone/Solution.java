//66. ��һ
//����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
//���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
//����Լ���������� 0 ֮�⣬��������������㿪ͷ��
//ʾ�� 1:
//����: [1,2,3]
//���: [1,2,4]
//����: ���������ʾ���� 123��
//ʾ�� 2:
//����: [4,3,2,1]
//���: [4,3,2,2]
//����: ���������ʾ���� 4321��
package plusone;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int flag=1;
    	if (digits[digits.length-1]!=9) {
    		digits[digits.length-1]=digits[digits.length-1]+1;
    		return digits;
    	}else {
    		for (int k=digits.length-1;k>=0;k--) {
    			if (digits[k]==9&&flag==1) {
    				digits[k]=0;
    			}else if (digits[k]<9&&flag==1) {
    				digits[k]++;
    				flag--;
    			}
    		}
    	}
    	if (digits[0]==0) {
    		int[] tempDigits=new int[digits.length+1];
    		tempDigits[0]=1;
    		return tempDigits;
    	}
    	return digits;
    }
}
