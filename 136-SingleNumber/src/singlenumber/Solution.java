//136. ֻ����һ�ε�����
//����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�
//˵����
//����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����
//ʾ�� 1:
//����: [2,2,1]
//���: 1
//ʾ�� 2:
//����: [4,1,2,1,2]
//���: 4
package singlenumber;
import java.util.*;
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>(nums.length);
        for (int i=0;i<nums.length;i++) {
        	if (m.containsKey(nums[i])) {
        		m.remove(nums[i]);
        	}else {
        		m.put(nums[i], nums[i]);
        	}
        }
        for (Integer key:m.keySet()) {
        	return m.get(key);
        }
        return 0;
    }
}
