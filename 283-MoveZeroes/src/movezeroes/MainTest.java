//283. �ƶ���
//����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
//ʾ��:
//����: [0,1,0,3,12]
//���: [1,3,12,0,0]
//˵��:
//������ԭ�����ϲ��������ܿ�����������顣
//�������ٲ���������
package movezeroes;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray= {0,0,0,1,0,2};
		//int[] testArray= {0,1,0,3,12};
		Solution Test=new Solution();
		Test.moveZeroes(testArray);
		for (int j=0;j<testArray.length;j++) {
			System.out.println(testArray[j]);
		}
	}
}
