//119. 杨辉三角 II
//给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//示例:
//输入: 3
//输出: [1,3,3,1]
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
