//912. ��������
//����һ���������� nums�����������������С�
//ʾ�� 1��
//���룺[5,2,3,1]
//�����[1,2,3,5]
//ʾ�� 2��
//���룺[5,1,1,2,0,0]
//�����[0,0,1,1,2,5]
//��ʾ��
//1 <= A.length <= 10000
//-50000 <= A[i] <= 50000
package sortanarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={5,2,3,1};
		Solution Test=new Solution();
		int[] resultArray=Test.sortArray(testArray);
		for (int i=0;i<resultArray.length;i++) {
			System.out.print(resultArray[i]+" ");
		}
	}
}
