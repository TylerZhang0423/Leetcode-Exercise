//187. �ظ���DNA����
//���� DNA ��һϵ����дΪ A��C��G �� T �ĺ�������ɣ����磺��ACGAATTCCG����
//���о� DNA ʱ��ʶ�� DNA �е��ظ�������ʱ����о��ǳ��а�����
//��дһ������������ DNA ���������г��ֳ���һ�ε�10����ĸ�������У��Ӵ�����
//ʾ��:
//����: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//���: ["AAAAACCCCC", "CCCCCAAAAA"]
//ע�Ȿ�����˼�ǣ��ظ��ĳ���Ϊ10���Ӵ�
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
        		 * ������������ж��Ƿ��ظ���ӣ�
        		 * �����ӹ�һ�Σ���val��Ϊ-1�������Ͳ�������ӵ�result
        		 * �����������Ӵ����ֹ�3�Σ���һ����ӵ�map��ڶ�����ӵ�result����������Ȼ��ӵ�result
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