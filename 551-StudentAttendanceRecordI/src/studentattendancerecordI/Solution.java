//551. ѧ�����ڼ�¼ I
//����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
//'A' : Absent��ȱ��
//'L' : Late���ٵ�
//'P' : Present������
//���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
//����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�
//ʾ�� 1:
//����: "PPALLP"
//���: True
//ʾ�� 2:
//����: "PPALLL"
//���: False
package studentattendancerecordI;

public class Solution {
    public boolean checkRecord(String s) {
        int flagA=0;
        int flagL=0;
        for (int i=0;i<s.length();i++) {
        	if (flagA>1||flagL>2) {
        		return false;
        	}
        	if (s.charAt(i)=='A') {
        		flagA++;
        	} else if (s.charAt(i)=='L') {
        		flagL++;
        	} 
        	if (s.charAt(i)!='L'&&flagL>0) {
        		flagL=0;
        	}
        }
    	if (flagA>1||flagL>2) {
    		return false;
    	}
        return true;
    }
}
