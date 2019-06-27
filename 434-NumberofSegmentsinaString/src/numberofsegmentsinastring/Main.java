//434. 字符串中的单词数
//统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
//请注意，你可以假定字符串里不包括任何不可打印的字符。
//示例:
//输入: "Hello, my name is John"
//输出: 5
package numberofsegmentsinastring;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String testString = "Hello, my name is John";
        String testString=", , , ,        a, eaefa";
        Solution Test=new Solution();
        System.out.println(Test.countSegments(testString));
    }
}
