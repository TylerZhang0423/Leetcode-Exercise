//345. ��ת�ַ����е�Ԫ����ĸ
//��дһ�����������ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��
//ʾ�� 1:
//����: "hello"
//���: "holle"
//ʾ�� 2:
//����: "leetcode"
//���: "leotcede"
//˵��:
//Ԫ����ĸ��������ĸ"y"��
package reversevowelsofastring;

public class Solution {
    public String reverseVowels(String s) {
    	char[] temp=s.toCharArray();
    	char t=' ';
        int i=0;
        int j=temp.length-1;
        while (i<j) {
        	while ((isVowel(temp[i])&&isVowel(temp[j]))==false&&i<j) {
        		if (!isVowel(temp[i])) {
        			i++;
        		}
        		if (!isVowel(temp[j])) {
        			j--;
        		}
        	}
        	if (isVowel(temp[i])&&isVowel(temp[j])) {
        		t=temp[i];
        		temp[i]=temp[j];
        		temp[j]=t;
        	}
        	i++;
        	j--;
        }
        String string =String.copyValueOf(temp);
        return string;
    }
    public boolean isVowel (char c) {
    	if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
    		return true;
    	}else {
    		return false;
    	}
    }
}
