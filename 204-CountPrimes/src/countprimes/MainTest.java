//204. ��������
//ͳ������С�ڷǸ����� n ��������������
//ʾ��:
//����: 10
//���: 4
//����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
package countprimes;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int testSolution=10;//2,3,5,7,11,13
		Solution Test=new Solution();
		System.out.print("С�� 10 ������һ���� "+Test.countPrimes(testSolution)+" ��");
	}
}