//189. ��ת����
//����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
//ʾ�� 1:
//����: [1,2,3,4,5,6,7] �� k = 3
//���: [5,6,7,1,2,3,4]
//����:
//������ת 1 ��: [7,1,2,3,4,5,6]
//������ת 2 ��: [6,7,1,2,3,4,5]
//������ת 3 ��: [5,6,7,1,2,3,4]
//ʾ�� 2:
//����: [-1,-100,3,99] �� k = 2
//���: [3,99,-1,-100]
//����: 
//������ת 1 ��: [99,-1,-100,3]
//������ת 2 ��: [3,99,-1,-100]
//˵��:
//�������������Ľ�����������������ֲ�ͬ�ķ������Խ��������⡣
//Ҫ��ʹ�ÿռ临�Ӷ�Ϊ O(1) ��ԭ���㷨��
package rotatearray;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={1,2,3,4,5,6,7};
		int K=3;
		Solution Test=new Solution();
		Test.rotate(testArray, K);
		for (int i=0;i<testArray.length;i++) {
			System.out.print(testArray[i]+" ");
		}
	}
}
