//593. ��Ч��������
//������ά�ռ����ĵ�����꣬�����ĵ��Ƿ���Թ���һ�������Ρ�
//һ��������꣨x��y����һ�����������������������ʾ��
//ʾ��:
//����: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
//���: True
//ע��:
//���������������� [-10000��10000] ��Χ�ڡ�
//һ����Ч�����������ĸ��ȳ����������ĸ��Ƚǣ�90�Ƚǣ���
//�����û��˳��
package validsquare;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p1={0,0};
		int[] p2={1,1};
		int[] p3={1,0};
		int[] p4={0,1};
		Solution Test=new Solution();
		System.out.println(Test.validSquare(p1, p2, p3, p4));
	}
}
