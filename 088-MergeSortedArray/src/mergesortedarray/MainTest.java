//88. �ϲ�������������
//�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�
//ʹ�� num1 ��Ϊһ���������顣
//˵��:
//��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
//����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
//ʾ��:
//����:
//nums1 = [1,2,3,0,0,0], m = 3
//nums2 = [2,5,6],       n = 3
//���: [1,2,2,3,5,6]
package mergesortedarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArray1= {4,0,0,0,0,0};
		int num1=1;
		int[] testArray2= {1,2,3,5,6};
		int num2=5;
		Solution Test=new Solution();
		Test.merge(testArray1, num1, testArray2, num2);
		for (int i=0;i<num1+num2;i++) {
			System.out.print(testArray1[i]+" ");
		}
	}
}
