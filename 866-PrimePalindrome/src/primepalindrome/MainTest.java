//866. ��������
//������ڻ���� N ����С����������
//�ع�һ�£����һ�������� 1����������ֻ�� 1 ����������ô�������������
//���磬2��3��5��7��11 �Լ� 13 ��������
//�ع�һ�£����һ�����������Ҷ�������������һ���ģ���ô������ǻ�������
//���磬12321 �ǻ�������
//ʾ�� 1��
//���룺6
//�����7
//ʾ�� 2��
//���룺8
//�����11
//ʾ�� 3��
//���룺13
//�����101
//��ʾ��
//1 <= N <= 10^8
//�𰸿϶����ڣ���С�� 2 * 10^8��
package primepalindrome;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=System.currentTimeMillis();
		int TESTSOLUTION=9989900;
		Solution Test=new Solution();
		System.out.println(Test.primePalindrome(TESTSOLUTION));
		System.out.println("ִ�к�ʱ : "+(System.currentTimeMillis()-a)/1000f+" �� ");
	}
}
