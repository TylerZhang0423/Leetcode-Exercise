//14. �����ǰ׺
//��дһ�������������ַ��������е������ǰ׺��
//��������ڹ���ǰ׺�����ؿ��ַ��� ""��
//ʾ�� 1:
//����: ["flower","flow","flight"]
//���: "fl"
//ʾ�� 2:
//����: ["dog","racecar","car"]
//���: ""
//����: ���벻���ڹ���ǰ׺��
//˵��:
//��������ֻ����Сд��ĸ a-z ��
package longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {
        	return "";
        }else if (strs.length==1) {
        	return strs[0];
        }else if (strs.length>1) {
        	for (int n=0;n<strs.length;n++) {
        		if (strs[n].equals("")) {
        			return "";
        		}
        	}
        	int minLength=strs[0].length();
        	int minIndex=0;
        	for (int i=0;i<strs.length;i++) {
        		if (strs[i].length()<=minLength) {
        			minLength=strs[i].length();
        			minIndex=i;
        		}
        	}
        	for (int j=0;j<minLength;j++) {
        		for (int k=0;k<strs.length;k++) {
        			if (strs[k].charAt(j)!=strs[minIndex].charAt(j)) {
        				char[] result=new char[j];
        				for (int m=0;m<j;m++) {
        					result[m]=strs[minIndex].charAt(m);
        				}
        				return String.valueOf(result);
        			}
        		}
        	}
        	char[] result=new char[minLength];
			for (int m=0;m<minLength;m++) {
				result[m]=strs[minIndex].charAt(m);
			}
			return String.valueOf(result);
        }
        return "";
    }
}
