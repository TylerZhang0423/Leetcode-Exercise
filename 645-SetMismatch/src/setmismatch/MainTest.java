//645. ����ļ���
//���� S ������1�� n �����������ҵ��ǣ���Ϊ���ݴ���
//���¼�������ĳһ��Ԫ�ظ����˳��˼������������һ��Ԫ�ص�ֵ��
//���¼��϶�ʧ��һ������������һ��Ԫ���ظ���
//����һ������ nums �����˼��� S ���������Ľ����
//�������������Ѱ�ҵ��ظ����ֵ����������ҵ���ʧ�����������������������ʽ���ء�
//ʾ�� 1:
//����: nums = [1,2,2,4]
//���: [2,3]
//ע��:
//��������ĳ��ȷ�Χ�� [2, 10000]��
//����������������ġ�
package setmismatch;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={1,2,2,4};
		Solution Test=new Solution();
		System.out.println(Test.findErrorNums(testArray)[0]);
		System.out.println(Test.findErrorNums(testArray)[1]);
	}
}
