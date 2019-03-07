//118. 杨辉三角
//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
//在杨辉三角中，每个数是它左上方和右上方的数的和。
//示例:
//输入: 5
//输出:
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
