//1. ����֮��
//����һ���������� nums ��һ��Ŀ��ֵ target��
//�����ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
//����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
//ʾ��:
//���� nums = [2, 7, 11, 15], target = 9
//��Ϊ nums[0] + nums[1] = 2 + 7 = 9
//���Է��� [0, 1]
package twosum;

public class MainTest {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArrays= {2, 7, 11, 15};
		int testTarget=9;
		Solution Test=new Solution();
		int[] result=Test.twoSum(testArrays, testTarget);
		for (int k=0;k<result.length;k++) {
			System.out.print(result[k]+" ");
		}
	}
}
