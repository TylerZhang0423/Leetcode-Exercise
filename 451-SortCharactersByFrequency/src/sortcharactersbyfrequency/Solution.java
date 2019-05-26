//451. 根据字符出现频率排序
//给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
//示例 1:
//输入:
//"tree"
//输出:
//"eert"
//解释:
//'e'出现两次，'r'和't'都只出现一次。
//因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
//示例 2:
//输入:
//"cccaaa"
//输出:
//"cccaaa"
//解释:
//'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
//注意"cacaca"是不正确的，因为相同的字母必须放在一起。
//示例 3:
//输入:
//"Aabb"
//输出:
//"bbAa"
//解释:
//此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
//注意'A'和'a'被认为是两种不同的字符。
package sortcharactersbyfrequency;

import java.util.*;
public class Solution {
    public String frequencySort(String s) {
    	String result="";
        Map<String, Integer> map=new HashMap<String, Integer>();
    	for (int i=0;i<s.length();i++) {
    		if (map.containsKey(s.substring(i, i+1))) {
    			map.put(s.substring(i, i+1), map.get(s.substring(i, i+1))+1);
    		}else {
    			map.put(s.substring(i, i+1), 1);
    		}
    	}
    	//对hashmap通过value进行排序。需要重写sort方法和compare方法。
    	List<Map.Entry<String, Integer>> sortedMap = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
    	Collections.sort(sortedMap, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				if (o1.getValue()>o2.getValue()) {
					return 1;
				}else {
					return -1;
				}
			}
		});
    	//以下是对结果的拼接，拼接应该使用StringBuilder的append方法，使用“+”的效率太慢。
		for (int i=sortedMap.size()-1; i>=0; i--) {
			int count=sortedMap.get(i).getValue();
			StringBuilder sb = new StringBuilder();
			while (count>0) {
				sb.append(sortedMap.get(i).getKey());
				count--;
			}
			result=result+sb.toString();
		}
    	return result;
    }
}
//不用hashmap，使用数组也可以，效率比hashmap更高。
//public class Solution {
//public String frequencySort(String s) {
//	String result="";   	
//  int[] map=new int[94];
//	for (int i=0;i<s.length();i++) {
//		map[s.charAt(i)-32]++;
//	}
//	int[] index=map.clone();
//	Arrays.sort(map);
//	for (int i=map.length-1; i>=0&&map[i]>0; i--) {
//		int count=map[i];
//		String letter="";
//		for (int j=0;j<index.length;j++) {
//			if (map[i]==index[j]) {
//				letter=String.valueOf((char)(j+32));
//				index[j]=0;
//				break;
//			}
//		}
//		StringBuilder sb = new StringBuilder();
//		while (count>0) {
//			sb.append(letter);
//			count--;
//		}
//		result=result+sb.toString();
//	}
//	return result;
//}
//}
