//58. ���һ�����ʵĳ���
//����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��������������һ�����ʵĳ��ȡ�
//������������һ�����ʣ��뷵�� 0 ��
//˵����һ��������ָ����ĸ��ɣ����������κοո���ַ�����
//ʾ��:
//����: "Hello World"
//���: 5
package lengthoflastword;

public class Solution {
    public int lengthOfLastWord(String s) {
    	if (s.length()==0) {
    		return 0;
    	}
    	int sum=0;
    	int j=s.length()-1;
    	//ȥ��ĩβ����Ŀո�
    	while (j>=0&&s.charAt(j)==' ') {
    		j--;
    	}
        for (;j>=0;j--) {
        	if (s.charAt(j)==' ') {
        		return sum;
        	}else {
        		sum++;
        	}
        }
        return sum;
    }
}
