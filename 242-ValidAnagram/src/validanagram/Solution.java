//���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ��һ����ĸ��λ�ʡ�
//ʾ�� 1:
//����: s = "anagram", t = "nagaram"
//���: true
package validanagram;
import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
    	char temp1='1';
    	char temp2='1';
    	if (s.length()!=t.length()) {
    		return false;
    	}
    	//String����ת�ַ�������
    	char[] char_s=s.toCharArray();
    	char[] char_t=t.toCharArray();
    	//ð�������ַ������飬Ч��û�б�׼��ߣ��޷�ͨ�����Լ�
    	for (int i=0;i<char_s.length-1;i++) {
    		for(int j=0;j<char_s.length-i-1;j++) {
    			if (char_s[j]<char_s[j+1]) {
    				temp1=char_s[j];
    				char_s[j]=char_s[j+1];
    				char_s[j+1]=temp1;
    			}
    		}
    	}
    	for (int i=0;i<char_t.length-1;i++) {
    		for(int j=0;j<char_t.length-i-1;j++) {
    			if (char_t[j]<char_t[j+1]) {
    				temp2=char_t[j];
    				char_t[j]=char_t[j+1];
    				char_t[j+1]=temp2;
    			}
    		}
    	}
    	////��׼���е����򷽷�
    	//Arrays.sort(char_s);
    	//Arrays.sort(char_t);
    	for (int k=0;k<char_s.length;k++) {
    		if (char_s[k]!=char_t[k]) {
    			return false;
    		}
    	}
    	return true;
    }
}
