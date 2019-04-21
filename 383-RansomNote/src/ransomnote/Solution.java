//383. 赎金信
//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
//判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
//如果可以构成，返回 true ；否则返回 false。
//(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
//注意：
//你可以假设两个字符串均只含有小写字母。
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
