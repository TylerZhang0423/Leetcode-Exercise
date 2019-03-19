//506. �������
//���� N ���˶�Ա�ĳɼ����ҳ����ǵ�������β�����ǰ������Ӧ�Ľ��ơ�
//ǰ�����˶�Ա���ᱻ�ֱ����� �����ơ��������ơ� �͡� ͭ�ơ�
//��"Gold Medal", "Silver Medal", "Bronze Medal"����
//(ע������Խ�ߵ�ѡ�֣�����Խ��ǰ��)
//ʾ�� 1:
//����: [5, 4, 3, 2, 1]
//���: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//����: ǰ�����˶�Ա�ĳɼ�Ϊǰ���ߵģ���˽���ֱ����� �����ơ��������ơ��͡�ͭ�ơ� ("Gold Medal", "Silver Medal" and "Bronze Medal").
//���µ������˶�Ա������ֻ��Ҫͨ�����ǵĳɼ����㽫��������μ��ɡ�
//��ʾ:
//N ��һ�����������Ҳ��ᳬ�� 10000��
//�����˶�Ա�ĳɼ�������ͬ��
//��Ҫ˼·���������ٲ���
package relativeranks;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] nums) {
    	String[] result=new String[nums.length];
    	for (int i=0;i<nums.length;i++) {
    		result[i]=nums[i]+"";
    	}
    	Arrays.sort(nums);
    	for (int i=0;i<nums.length;i++) {
    		int j=0;
    		while (Integer.parseInt(result[i])!=nums[j]) {
    			j++;
    		}
    		if (j==nums.length-1) {
    			result[i]="Gold Medal";
    		}else if (j==nums.length-2) {
    			result[i]="Silver Medal";
    		}else if (j==nums.length-3) {
    			result[i]="Bronze Medal";
    		}else {
    			result[i]=String.valueOf(nums.length-j);
    		}
    	}
        return result;
    }
}
