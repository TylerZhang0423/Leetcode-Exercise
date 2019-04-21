//383. �����
//����һ������� (ransom) �ַ�����һ����־(magazine)�ַ�����
//�жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�
//������Թ��ɣ����� true �����򷵻� false��
//(��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼��)
//ע�⣺
//����Լ��������ַ�����ֻ����Сд��ĸ��
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
package ransomnote;
import java.util.*;
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map=new HashMap<Character,Integer>();
        for (int i=0;i<magazine.length();i++) {
        	if (map.containsKey(magazine.charAt(i))) {
        		map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
        	}else {
        		map.put(magazine.charAt(i), 1);
        	}
        }
        for (int j=0;j<ransomNote.length();j++) {
        	if (map.containsKey(ransomNote.charAt(j))&&map.get(ransomNote.charAt(j))>=1) {
        		map.put(ransomNote.charAt(j), map.get(ransomNote.charAt(j))-1);
        	}else {
        		return false;
        	}
        }
        return true;
    }
}
