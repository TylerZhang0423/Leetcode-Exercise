//977. ���������ƽ��
//����һ�����ǵݼ�˳��������������� A������ÿ�����ֵ�ƽ����ɵ������飬Ҫ��Ҳ���ǵݼ�˳������ 
//ʾ�� 1��
//���룺[-4,-1,0,3,10]
//�����[0,1,9,16,100]
package squaresofasortedarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArray= {-4,-1,0,3,10};
		Solution Test=new Solution();
		int[] result=Test.sortedSquares(testArray);
		for (int k=0;k<result.length;k++) {
			System.out.print(result[k]+" ");
		}
	}

}
