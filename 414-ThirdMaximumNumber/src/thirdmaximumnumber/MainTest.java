//414. ���������
//����һ���ǿ����飬���ش������е����������
//��������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��
//ʾ�� 1:
//����: [3, 2, 1]
//���: 1
//����: ����������� 1.
//ʾ�� 2:
//����: [1, 2]
//���: 2
//����: ���������������, ���Է��������� 2 .
//ʾ�� 3:
//����: [2, 2, 3, 1]
//���: 1
//����: ע�⣬Ҫ�󷵻ص������������ָ��������Ψһ���ֵ�����
//��������ֵΪ2���������Ƕ��ŵڶ���
package thirdmaximumnumber;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testSolution={2,2,3,1};
		int[] testSolution={-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
		Solution Test=new Solution();
		System.out.println(Test.thirdMax(testSolution));
	}
}
