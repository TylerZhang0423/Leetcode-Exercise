//219. �����ظ�Ԫ�� II
//����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��
//ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k��
//ʾ�� 1:
//����: nums = [1,2,3,1], k = 3
//���: true
//ʾ�� 2:
//����: nums = [1,0,1,1], k = 1
//���: true
//ʾ�� 3:
//����: nums = [1,2,3,1,2,3], k = 2
//���: false
package containsduplicateII;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] testNums={1,2,3,4,5,6,7,8,9,9};
        int KEY=3;
        Solution Test=new Solution();
        System.out.println(Test.containsNearbyDuplicate(testNums, KEY));
	}
}
