//896. ��������
//��������ǵ��������򵥵��ݼ��ģ���ô���ǵ����ġ�
//����������� i <= j��A[i] <= A[j]����ô���� A �ǵ��������ġ� 
//����������� i <= j��A[i]> = A[j]����ô���� A �ǵ����ݼ��ġ�
//������������ A �ǵ�������ʱ���� true�����򷵻� false��
package monotonicarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] TestArr= {3,2,1};
		Solution Test=new Solution();
		System.out.println(Test.isMonotonic(TestArr));
	}

}
