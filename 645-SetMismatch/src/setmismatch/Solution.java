//645. ����ļ���
//���� S ������1�� n �����������ҵ��ǣ���Ϊ���ݴ���
//���¼�������ĳһ��Ԫ�ظ����˳��˼������������һ��Ԫ�ص�ֵ��
//���¼��϶�ʧ��һ������������һ��Ԫ���ظ���
//����һ������ nums �����˼��� S ���������Ľ����
//�������������Ѱ�ҵ��ظ����ֵ����������ҵ���ʧ�����������������������ʽ���ء�
//ʾ�� 1:
//����: nums = [1,2,2,4]
//���: [2,3]
//ע��:
//��������ĳ��ȷ�Χ�� [2, 10000]��
//����������������ġ�
package setmismatch;
import java.util.*;
public class Solution {
    public int[] findErrorNums(int[] nums) {
    	int[] result=new int[2];
    	int sum=0;
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length;i++) {
        	if (!map.containsKey(nums[i])) {
        		map.put(nums[i], nums[i]);
        	}else {
        		result[0]=nums[i];
        	}
        	sum=sum+nums[i];
        }
        result[1]=result[0]+(nums.length+1)*nums.length/2-sum;
        return result;
    }
}
