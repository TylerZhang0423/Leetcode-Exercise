//520. ����д��ĸ
//����һ�����ʣ�����Ҫ�жϵ��ʵĴ�дʹ���Ƿ���ȷ��
//���Ƕ��壬���������ʱ�����ʵĴ�д�÷�����ȷ�ģ�
//ȫ����ĸ���Ǵ�д������"USA"��
//������������ĸ�����Ǵ�д������"leetcode"��
//������ʲ�ֻ����һ����ĸ��ֻ������ĸ��д�� ���� "Google"��
//�������Ƕ����������û����ȷʹ�ô�д��ĸ��
//ʾ�� 1:
//����: "USA"
//���: True
package detectcapital;

public class Solution {
    public boolean detectCapitalUse(String word) {
        for (int i=1;i<word.length();i++) {
        	if (word.charAt(0)>=97) {
        		if (word.charAt(i)<=90) {
        			return false;
        		}
        	}else {
        		if (word.charAt(1)>=97) {
        			if (word.charAt(i)<=90) {
        				return false;
        			}
        		}else {
        			if (word.charAt(i)>=97) {
        				return false;
        			}
        		}
        	}
        }
        return true;
    }
}
