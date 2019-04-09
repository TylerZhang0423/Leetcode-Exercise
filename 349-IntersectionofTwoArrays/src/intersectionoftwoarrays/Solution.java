//349. ��������Ľ���
//�����������飬��дһ���������������ǵĽ�����
//ʾ�� 1:
//����: nums1 = [1,2,2,1], nums2 = [2,2]
//���: [2]
//ʾ�� 2:
//����: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//���: [9,4]
//˵��:
//�������е�ÿ��Ԫ��һ����Ψһ�ġ�
//���ǿ��Բ�������������˳��
package intersectionoftwoarrays;
import java.util.*;
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<Integer>();
        int[] result=new int[0];
        for (int i=0;i<nums1.length;i++) {
        	set.add(nums1[i]);
        }
        for (int i=0;i<nums2.length;i++) {
        	if (set.contains(nums2[i])) {
        		if (result.length==0) {
        			result=Arrays.copyOf(result, 1);
        			result[result.length-1]=nums2[i];
            		set.remove(nums2[i]);
        		}else {
        			result=Arrays.copyOf(result, result.length+1);
        			result[result.length-1]=nums2[i];
        			set.remove(nums2[i]);
        		}
        	}
        }
        return result;
    }
}
