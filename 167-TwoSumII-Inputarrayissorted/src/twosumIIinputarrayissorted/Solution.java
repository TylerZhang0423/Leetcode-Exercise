//167. ����֮�� II - ������������
//����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������
//����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��
//˵��:
//���ص��±�ֵ��index1 �� index2�����Ǵ��㿪ʼ�ġ�
//����Լ���ÿ������ֻ��ӦΨһ�Ĵ𰸣������㲻�����ظ�ʹ����ͬ��Ԫ�ء�
//ʾ��:
//����: numbers = [2, 7, 11, 15], target = 9
//���: [1,2]
//����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��
package twosumIIinputarrayissorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] index=new int[2];
        for (int i=0;i<numbers.length;i++) {
        	for (int j=i+1;j<numbers.length;j++) {
        		if (numbers[i]+numbers[j]==target) {
        			index[0]=i+1;
        			index[1]=j+1;
        			return index;
        		}
        	}
        }
        return index;
    }
}
