//9. ������
//�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
//ʾ�� 1:
//����: 121
//���: true
//ʾ�� 2:
//����: -121
//���: false
//����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
//ʾ�� 3:
//����: 10
//���: false
//����: ���������, Ϊ 01 �����������һ����������
package palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
        	return false;
        }else {
        	String temp=String.valueOf(x);
        	int i=0;
        	int j=temp.length()-1;
        	while (i<j) {
        		if (temp.charAt(i)!=temp.charAt(j)) {
        			return false;
        		}
        		i++;
        		j--;
        	}
        }
        return true;
    }
}
