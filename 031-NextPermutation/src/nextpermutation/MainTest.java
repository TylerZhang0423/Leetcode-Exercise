//31. ��һ������
//ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
//�����������һ����������У��������������г���С�����У����������У���
//����ԭ���޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣
//������һЩ���ӣ�����λ������У�����Ӧ���λ���Ҳ��С�
//1,2,3 �� 1,3,2
//3,2,1 �� 1,2,3
//1,1,5 �� 1,5,1
package nextpermutation;
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] testArray={2,2,7,5,4,3,2,2,1};
		int[] testArray={3,2,1};
		Solution Test=new Solution();
		Test.nextPermutation(testArray);
		for (int i=0;i<testArray.length;i++) {
			System.out.print(testArray[i]+" ");
		}
	}
}
