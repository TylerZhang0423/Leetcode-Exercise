//771. ��ʯ��ʯͷ
//�����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� 
//S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
//J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
//ʾ�� 1:
//����: J = "aA", S = "aAAbbbb"
//���: 3
//ʾ�� 2:
//����: J = "z", S = "ZZ"
//���: 0
package jewelsandstones;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int flag=0;
    	for (int i=0;i<J.length();i++) {
        	for (int j=0;j<S.length();j++) {
        		if (J.charAt(i)==S.charAt(j)) {
        			flag++;
        		}
        	}
        }
    	return flag;
    }
}
