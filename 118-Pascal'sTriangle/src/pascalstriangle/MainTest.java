//118. �������
//����һ���Ǹ����� numRows������������ǵ�ǰ numRows �С�
//����������У�ÿ�����������Ϸ������Ϸ������ĺ͡�
//ʾ��:
//����: 5
//���:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
package pascalstriangle;
import java.util.List;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TESTSOLUTION=5;
		Solution Test=new Solution();
		List<List<Integer>> testResult=Test.generate(TESTSOLUTION);
		for (int i=0;i<testResult.size();i++) {
			for (int j=0;j<testResult.get(i).size();j++) {
				System.out.print(testResult.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
