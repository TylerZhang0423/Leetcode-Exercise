//28. ʵ��strStr()
//ʵ�� strStr() ������
//����һ�� haystack �ַ�����һ�� needle �ַ�����
//�� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)��
//��������ڣ��򷵻�  -1��
//ʾ�� 1:
//����: haystack = "hello", needle = "ll"
//���: 2
//ʾ�� 2:
//����: haystack = "aaaaa", needle = "bba"
//���: -1
//˵��:
//�� needle �ǿ��ַ���ʱ������Ӧ������ʲôֵ�أ�����һ���������кܺõ����⡣
//���ڱ�����ԣ��� needle �ǿ��ַ���ʱ����Ӧ������ 0 ������C���Ե� strstr() �Լ� Java�� indexOf() ���������
package implementstrStr;

public class Solution {
    public int strStr(String haystack, String needle) {
    	if (needle.length()==0) {
    		return 0;
    	}
    	if (haystack.length()==0||needle.length()>haystack.length()) {
    		return -1;
    	}
        for (int i=0;i<haystack.length();i++) {
        	for (int j=0;j<needle.length();j++) {
        		if (i+j>haystack.length()||haystack.charAt(i+j)!=needle.charAt(j)) {
        			break;
        		}else {
        			if (j==needle.length()-1) {
        				return i;
        			}else {
        				continue;
        			}
        		}
        	}
        }
        return -1;
    }
}
