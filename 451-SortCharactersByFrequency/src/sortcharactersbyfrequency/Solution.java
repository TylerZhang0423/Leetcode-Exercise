//451. �����ַ�����Ƶ������
//����һ���ַ������뽫�ַ�������ַ����ճ��ֵ�Ƶ�ʽ������С�
//ʾ�� 1:
//����:
//"tree"
//���:
//"eert"
//����:
//'e'�������Σ�'r'��'t'��ֻ����һ�Ρ�
//���'e'���������'r'��'t'֮ǰ�����⣬"eetr"Ҳ��һ����Ч�Ĵ𰸡�
//ʾ�� 2:
//����:
//"cccaaa"
//���:
//"cccaaa"
//����:
//'c'��'a'���������Ρ����⣬"aaaccc"Ҳ����Ч�Ĵ𰸡�
//ע��"cacaca"�ǲ���ȷ�ģ���Ϊ��ͬ����ĸ�������һ��
//ʾ�� 3:
//����:
//"Aabb"
//���:
//"bbAa"
//����:
//���⣬"bbaA"Ҳ��һ����Ч�Ĵ𰸣���"Aabb"�ǲ���ȷ�ġ�
//ע��'A'��'a'����Ϊ�����ֲ�ͬ���ַ���
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
    	//��hashmapͨ��value����������Ҫ��дsort������compare������
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
    	//�����ǶԽ����ƴ�ӣ�ƴ��Ӧ��ʹ��StringBuilder��append������ʹ�á�+����Ч��̫����
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
//����hashmap��ʹ������Ҳ���ԣ�Ч�ʱ�hashmap���ߡ�
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
