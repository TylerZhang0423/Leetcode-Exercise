//509. 쳲�������
//쳲���������ͨ���� F(n) ��ʾ���γɵ����г�Ϊ쳲��������С�
//�������� 0 �� 1 ��ʼ�������ÿһ�����ֶ���ǰ���������ֵĺ͡�Ҳ���ǣ�
//F(0) = 0,   F(1) = 1
//F(N) = F(N - 1) + F(N - 2), ���� N > 1.
//���� N������ F(N)��
//ʾ�� 1��
//���룺2
//�����1
//���ͣ�F(2) = F(1) + F(0) = 1 + 0 = 1.
//ʾ�� 2��
//���룺3
//�����2
//���ͣ�F(3) = F(2) + F(1) = 1 + 1 = 2.
//ʾ�� 3��
//���룺4
//�����3
//���ͣ�F(4) = F(3) + F(2) = 2 + 1 = 3.
//��ʾ��0 �� N �� 30
package fibonaccinumber;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TESTSOLUTION=4;
		Solution Test=new Solution();
		System.out.println(Test.fib(TESTSOLUTION));
	}
}
