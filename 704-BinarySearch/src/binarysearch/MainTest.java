//704. ���ֲ���
//����һ�� n ��Ԫ������ģ������������� nums ��һ��Ŀ��ֵ target  ��
//дһ���������� nums �е� target�����Ŀ��ֵ���ڷ����±꣬���򷵻� -1��
//ʾ�� 1:
//����: nums = [-1,0,3,5,9,12], target = 9
//���: 4
//����: 9 ������ nums �в����±�Ϊ 4
//ʾ�� 2:
//����: nums = [-1,0,3,5,9,12], target = 2
//���: -1
//����: 2 ������ nums ����˷��� -1
//��ʾ��
//����Լ��� nums �е�����Ԫ���ǲ��ظ��ġ�
//n ���� [1, 10000]֮�䡣
//nums ��ÿ��Ԫ�ض����� [-9999, 9999]֮�䡣
package binarysearch;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testNums={-1,0,3,5,9,12};
		int[] testNums={-1,2,5};
		int testTarget=5;
		Solution Test=new Solution();
		System.out.println(Test.search(testNums, testTarget));
	}
}
