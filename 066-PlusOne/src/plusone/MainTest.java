//66. ��һ
//����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��
//���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�
//����Լ���������� 0 ֮�⣬��������������㿪ͷ��
//ʾ�� 1:
//����: [1,2,3]
//���: [1,2,4]
//����: ���������ʾ���� 123��
//ʾ�� 2:
//����: [4,3,2,1]
//���: [4,3,2,2]
//����: ���������ʾ���� 4321��
package plusone;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArray= {9,9};
		Solution Test=new Solution();
		int[] result=Test.plusOne(testArray);
		for (int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
