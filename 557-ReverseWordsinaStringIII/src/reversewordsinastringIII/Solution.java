//557. ��ת�ַ����еĵ��� III
//����һ���ַ���������Ҫ��ת�ַ�����ÿ�����ʵ��ַ�˳��ͬʱ�Ա����ո�͵��ʵĳ�ʼ˳��
//ʾ�� 1:
//����: "Let's take LeetCode contest"
//���: "s'teL ekat edoCteeL tsetnoc" 
//ע�⣺���ַ����У�ÿ�������ɵ����ո�ָ��������ַ����в������κζ���Ŀո�
package reversewordsinastringIII;

public class Solution {
    public String reverseWords(String s) {
        String[] k=s.split(" ");
        String res="";
        for (int i=0;i<k.length;i++) {
        	res=res+reverseString(k[i])+" ";
        }
        return res.trim();
    }
    public String reverseString(String s1) {
    	char[] c=s1.toCharArray();
    	char temp=' ';
        for (int i=0;i<s1.length()/2;i++) {
        	temp=c[i];
        	c[i]=c[s1.length()-1-i];
        	c[s1.length()-1-i]=temp;
        }
        return String.valueOf(c);
    }
}
