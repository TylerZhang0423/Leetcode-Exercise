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

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray1={1,2,2,1};
		int[] testArray2={2,2};
		Solution Test=new Solution();
		int[] testResult=Test.intersection(testArray1, testArray2);
		for (int i=0;i<testResult.length;i++) {
			System.out.print(testResult[i]+" ");
		}
	}
}
