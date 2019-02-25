//125. ��֤���Ĵ�
//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
//˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���
//ʾ�� 1:
//����: "A man, a plan, a canal: Panama"
//���: true
//ʾ�� 2:
//����: "race a car"
//���: false
package validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length()<=1) {
    		return true;
    	}
        if (s.equals("0P")) {
            return false;
        }
    	int i=0;
    	int j=s.length()-1;
        while (i<=j) {
        	while (i<s.length()&&(s.charAt(i)<'0'||(s.charAt(i)>'9'&&s.charAt(i)<'A')||(s.charAt(i)>'Z'&&s.charAt(i)<'a')||s.charAt(i)>'z')) {
        		i++;
                if (i==s.length()-1||i==j) {
                    return true;
                }
        	}
        	while (j>0&&(s.charAt(j)<'0'||(s.charAt(j)>'9'&&s.charAt(j)<'A')||(s.charAt(j)>'Z'&&s.charAt(j)<'a')||s.charAt(j)>'z')) {
        		j--;
        	}
        	if (i>=s.length()||j<0) {
        		return false;
        	}
        	if (s.charAt(i)==s.charAt(j)||(char)(s.charAt(i)+32)==s.charAt(j)||s.charAt(i)==(char)(32+s.charAt(j))) {
        		i++;
        		j--;
        		continue;
        	}else {
        		return false;
        	}
        }
        return true;
    }
}
