//844. 比较含退格的字符串
//给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
//示例 1：
//输入：S = "ab#c", T = "ad#c"
//输出：true
//解释：S 和 T 都会变成 “ac”。
//示例 2：
//输入：S = "ab##", T = "c#d#"
//输出：true
//解释：S 和 T 都会变成 “”。
package backspacestringcompare;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String testS="ab#c";
		String testT="ad#c";
		Solution Test=new Solution();
		System.out.println(Test.backspaceCompare(testS, testT));
	}
}
