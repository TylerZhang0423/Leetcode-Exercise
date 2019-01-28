//242. 有效的字母异位词
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
//示例 1:
//输入: s = "anagram", t = "nagaram"
//输出: true
package validanagram;

public class MainTest {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String Test_s="anagram";
		String Test_t="nagaral";
		Solution TestValid=new Solution();
		System.out.println(TestValid.isAnagram(Test_s, Test_t));
	}
}