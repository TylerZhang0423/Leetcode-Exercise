//53. ��������
//����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ���
//���������͡�
//ʾ��:
//����: [-2,1,-3,4,-1,2,1,-5,4],
//���: 6
//����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��
package maximumsubarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArrays= {-2,1,-3,4,-1,2,1,-5,4};
		int[] testArrays2= {-2,-1};
		Solution Test=new Solution();
		System.out.println(Test.maxSubArray(testArrays2));
	}
}
