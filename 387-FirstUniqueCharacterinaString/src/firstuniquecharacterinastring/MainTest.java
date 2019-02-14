//387. 字符串中的第一个唯一字符
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//案例:
//s = "leetcode"
//返回 0.
//s = "loveleetcode",
//返回 2.
//注意事项：您可以假定该字符串只包含小写字母。
package firstuniquecharacterinastring;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//String testSolution="loveleetcode";
		String testSolution="dddccdbba";
		Solution Test=new Solution();
		System.out.println(Test.firstUniqChar(testSolution));
	}
}
