//264. ���� II
//��дһ�������ҳ��� n ��������
//��������ֻ���������� 2, 3, 5 ����������
//ʾ��:
//����: n = 10
//���: 12
//����: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 ��ǰ 10 ��������
//˵��:  
//1 �ǳ�����
//n ������1690��
package uglynumberII;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		long a=System.currentTimeMillis();
		int testSolution=10;
		Solution Test=new Solution();
		System.out.println(Test.nthUglyNumber(testSolution));
		System.out.println("\r<br>ִ�к�ʱ : "+(System.currentTimeMillis()-a)/1000f+" �� ");
	}
}
