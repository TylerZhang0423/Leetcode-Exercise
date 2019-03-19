//541. ��ת�ַ��� II
//����һ���ַ�����һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰk���ַ����з�ת��
//���ʣ������ k ���ַ�����ʣ�������ȫ����ת��
//�����С�� 2k �����ڻ���� k ���ַ�����תǰ k ���ַ�������ʣ����ַ�����ԭ����
//ʾ��:
//����: s = "abcdefg", k = 2
//���: "bacdfeg"
//Ҫ��:
//���ַ���ֻ����Сд��Ӣ����ĸ��
//�����ַ����ĳ��Ⱥ� k ��[1, 10000]��Χ�ڡ�
package reversestringII;

public class Solution {
    public String reverseStr(String s, int k) {
        int flag=0;
        String res="";
        for (int i=0;i+k<=s.length();i=i+k) {
        	if (flag%2==0) {
        		res=res+reverse(s.substring(i, i+k));
        	}else {
        		res=res+s.substring(i, i+k);
        	}
        	flag++;
        }
        if (flag%2==0) {
        	res=res+reverse(s.substring(s.length()-s.length()%k, s.length()));
        }else {
        	res=res+s.substring(s.length()-s.length()%k, s.length());
        }
        return res;
    }
    public String reverse(String r) {
    	char[] c=r.toCharArray();
    	char temp=' ';
        for (int i=0;i<c.length/2;i++) {
        	temp=c[i];
        	c[i]=c[c.length-1-i];
        	c[c.length-1-i]=temp;
        }
        return String.valueOf(c);
    }
}
