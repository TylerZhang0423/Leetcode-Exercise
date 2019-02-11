//14. 最长公共前缀
//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。
//示例 1:
//输入: ["flower","flow","flight"]
//输出: "fl"
//示例 2:
//输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
//说明:
//所有输入只包含小写字母 a-z 。
package longestcommonprefix;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String[] testSolution= {"flower","flow","flight"};
		String[] testSolution= {"a","a","aabc","aa","acc"};
		Solution Test=new Solution();
		System.out.println(Test.longestCommonPrefix(testSolution));
	}
}
