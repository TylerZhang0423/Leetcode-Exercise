//3. ���ظ��ַ�����Ӵ�
//����һ���ַ����������ҳ����в������ظ��ַ��� ��Ӵ� �ĳ��ȡ�
//ʾ�� 1:
//����: "abcabcbb"
//���: 3 
//����: ��Ϊ���ظ��ַ�����Ӵ��� "abc"�������䳤��Ϊ 3��
//ʾ�� 2:
//����: "bbbbb"
//���: 1
//����: ��Ϊ���ظ��ַ�����Ӵ��� "b"�������䳤��Ϊ 1��
//ʾ�� 3:
//����: "pwwkew"
//���: 3
//����: ��Ϊ���ظ��ַ�����Ӵ��� "wke"�������䳤��Ϊ 3��
//��ע�⣬��Ĵ𰸱����� �Ӵ� �ĳ��ȣ�"pwke" ��һ�������У������Ӵ���
package longest.substring.without.repeating.characters;
import java.util.*;
public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int result=0;
        Map<Integer, Character> map=new HashMap<Integer,Character>();
        for (int i=0;i<s.length();i++) {
        	for (int j=i;j<s.length();j++) {
        		if (!map.containsKey((int) s.charAt(j))) {
        			map.put((int) s.charAt(j), s.charAt(j));
        			result=Math.max(result, map.size());
        		} else {
        			map.clear();
        			break;
        		}
        	}
        }
        return result;
    }
}
