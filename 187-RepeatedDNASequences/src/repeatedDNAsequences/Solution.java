//187. 重复的DNA序列
//所有 DNA 由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。
//在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
//编写一个函数来查找 DNA 分子中所有出现超多一次的10个字母长的序列（子串）。
//示例:
//输入: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//输出: ["AAAAACCCCC", "CCCCCAAAAA"]
//注意本题的意思是，重复的长度为10的子串
package repeatedDNAsequences;
import java.util.*;
public class Solution {
	public List<String> findRepeatedDnaSequences(String s) {
    	List<String> result=new ArrayList<String>();
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        for (int i=0;i<s.length()-9;i++) {
        	if (!map.containsKey(s.substring(i, i+10))) {
        		map.put(s.substring(i, i+10),1);
        	}else {
        		/*
        		 * 这个部分用来判断是否重复添加，
        		 * 如果添加过一次，则将val置为-1，后续就不必再添加到result
        		 * 否则如果这个子串出现过3次，第一次添加到map里，第二次添加到result，第三次依然添加到result
        		 *  */
        		if (map.get(s.substring(i, i+10))==1) {
        			result.add(s.substring(i, i+10));
        			map.put(s.substring(i, i+10),-1);
        		}
        	}
        }
        return result;
    }
}