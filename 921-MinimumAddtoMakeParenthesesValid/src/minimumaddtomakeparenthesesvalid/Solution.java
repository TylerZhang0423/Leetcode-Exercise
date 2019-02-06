//921. 使括号有效的最少添加
//给定一个由 '(' 和 ')' 括号组成的字符串 S，我们需要添加最少的括号（ '(' 或是 ')'，
//可以在任何位置），以使得到的括号字符串有效。
//从形式上讲，只有满足下面几点之一，括号字符串才是有效的：
//它是一个空字符串，或者
//它可以被写成 AB （A 与 B 连接）, 其中 A 和 B 都是有效字符串，或者
//它可以被写作 (A)，其中 A 是有效字符串。
//给定一个括号字符串，返回为使结果字符串有效而必须添加的最少括号数.
//示例 1：
//输入："())"
//输出：1
//示例 2：
//输入："((("
//输出：3
package minimumaddtomakeparenthesesvalid;
import java.util.Stack ;
public class Solution {
    public int minAddToMakeValid(String S) {
    	Stack<Character> stack = new Stack<Character>();
    	int flag=0;
    	for (int i=0;i<S.length();i++) {
    		if (S.charAt(i)=='('||S.charAt(i)=='['||S.charAt(i)=='{') {
    			stack.push(S.charAt(i));
    		}else {
    			if (stack.empty()==true) {
    				if (i==S.length()-1) {
    					flag++;
    					return flag;
    				}else {
    					flag++;
    				}
    			}else {
    				if (S.charAt(i)==')'&&stack.peek()=='(') {
    					stack.pop();
    					continue;
    				}else if (S.charAt(i)=='}'&&stack.peek()=='{') {
    					stack.pop();
    					continue;
    				}else if (S.charAt(i)==']'&&stack.peek()=='[') {
    					stack.pop();
    					continue;
    				}else {
    					return -1;
    				}
    			}
    		}
    	}
    	if (stack.empty()==false) {
    		return stack.size()+flag;
    	}
    	if (stack.empty()==true) {
    		if (flag!=0) {
    			return flag;
    		}else {
    			return 0;
    		}
    	}
    	return -1;
    }
}