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

//思路：不等于#进栈，等于#，弹出一个，最后对比两个栈是否相等
package backspacestringcompare;
import java.util.Stack ;
public class Solution {
    public boolean backspaceCompare(String S, String T) {
    	Stack<Character> stack1= new Stack<Character>();
    	Stack<Character> stack2= new Stack<Character>();
    	for (int i=0;i<S.length();i++) {
    		if (S.charAt(i)!='#') {
    			stack1.push(S.charAt(i));
    		}else {
    			if (stack1.empty()) {
    				continue;
    			}else {
    				stack1.pop();
    			}
    		}
    	}
    	for (int j=0;j<T.length();j++) {
    		if (T.charAt(j)!='#') {
    			stack2.push(T.charAt(j));
    		}else {
    			if (stack2.empty()) {
    				continue;
    			}else {
    				stack2.pop();
    			}
    		}
    	}
    	if (stack1.equals(stack2)) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
