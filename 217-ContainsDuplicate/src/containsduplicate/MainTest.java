package containsduplicate;
//����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
//����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=new Solution();
		int[] TestArray= {1,3,2,1};
		System.out.println(Test.containsDuplicate(TestArray));
		for (int k=0;k<TestArray.length;k++)
			System.out.println(TestArray[k]+" ");
	}
}