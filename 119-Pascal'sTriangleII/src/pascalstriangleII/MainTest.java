//119. ������� II
//����һ���Ǹ����� k������ k �� 33������������ǵĵ� k �С�
//����������У�ÿ�����������Ϸ������Ϸ������ĺ͡�
//ʾ��:
//����: 3
//���: [1,3,3,1]
package pascalstriangleII;
import java.util.List;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TESTSOLUTION=3;
		Solution Test=new Solution();
		List<Integer> testResult=Test.getRow(TESTSOLUTION);
		for (int i=0;i<testResult.size();i++) {
			System.out.print(testResult.get(i)+" ");
		}
	}
}
