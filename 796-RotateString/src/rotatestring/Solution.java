//796. ��ת�ַ���
//���������ַ���, A �� B��
//A ����ת�������ǽ� A ����ߵ��ַ��ƶ������ұߡ� 
//����, �� A = 'abcde'�����ƶ�һ��֮��������'bcdea' ��
//��������ɴ���ת����֮��A �ܱ��B����ô����True��
//ʾ�� 1:
//����: A = 'abcde', B = 'cdeab'
//���: true
//ʾ�� 2:
//����: A = 'abcde', B = 'abced'
//���: false
//ע�⣺A �� B ���Ȳ����� 100��
//��Ҫ˼·����A����һ�飬�ӵ�A��ĩβ����֮ǰд��strstr��������A+A���Ƿ����Ӵ�B
package rotatestring;

public class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length()!=B.length()) {
        	return false;
        }else {
        	String temp=A+A;
        	if (myStrStr(temp,B)==-1) {
        		return false;
        	}else {
        		return true;
        	}
        }
    }
    public int myStrStr(String haystack, String needle) {
    	if (needle.length()==0) {
    		return 0;
    	}
    	if (haystack.length()==0||needle.length()>haystack.length()) {
    		return -1;
    	}
        for (int i=0;i<haystack.length();i++) {
        	for (int j=0;j<needle.length();j++) {
        		if (i+j>=haystack.length()||haystack.charAt(i+j)!=needle.charAt(j)) {
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
