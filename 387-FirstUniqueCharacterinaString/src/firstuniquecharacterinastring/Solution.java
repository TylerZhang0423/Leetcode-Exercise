//387. �ַ����еĵ�һ��Ψһ�ַ�
//����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
//����:
//s = "leetcode"
//���� 0.
//s = "loveleetcode",
//���� 2.
//ע����������Լٶ����ַ���ֻ����Сд��ĸ��
package firstuniquecharacterinastring;

public class Solution {
    public int firstUniqChar(String s) {
    	if (s.length()==1) {
    		return 0;
    	}
        for (int i=0;i<s.length();i++) {
        	int j=0;
        	for (;j<s.length();j++) {
        		if (s.charAt(i)==s.charAt(j)&&i!=j) {
        			break;
        		}
        	}
        	if (j==s.length()) {
        		return i;
        	}
        }

        return -1;
    }
}
