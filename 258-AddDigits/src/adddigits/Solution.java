//258. ��λ���
//����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
//ʾ��:
//����: 38
//���: 2 
//����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2��
package adddigits;

public class Solution {
    public int addDigits(int num) {
    	if (num<10) {
    		return num;
    	}
        while (num>=10) {
        	num=sum(num);
        }
        return num;
    }
    public int sum(int num) {
    	int result=0;
    	while (num>0) {
    		result=result+num%10;
    		num=num/10;
    	}
    	return result;
    }
}