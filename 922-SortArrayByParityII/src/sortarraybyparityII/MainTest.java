//922. ����ż�������� II
//����һ���Ǹ��������� A�� A ��һ��������������һ��������ż����
//��������������Ա㵱 A[i] Ϊ����ʱ��i Ҳ���������� A[i] Ϊż��ʱ�� i Ҳ��ż����
//����Է����κ���������������������Ϊ�𰸡�
//ʾ����
//���룺[4,2,5,7]
//�����[4,5,2,7]
//���ͣ�[4,7,2,5]��[2,5,4,7]��[2,7,4,5] Ҳ�ᱻ���ܡ�
//��ʾ��
//2 <= A.length <= 20000
//A.length % 2 == 0
//0 <= A[i] <= 1000
package sortarraybyparityII;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={4,2,5,7};
		Solution Test=new Solution();
		int[] result=Test.sortArrayByParityII(testArray);
		for (int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
