//20. 有效的括号
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//有效字符串需满足：
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
//注意空字符串可被认为是有效字符串。
//示例 1:
//输入: "()"
//输出: true
//示例 2:
//输入: "()[]{}"
//输出: true
/******栈的典型应用******/
package validparentheses;
import java.util.Stack ;

public class Solution {
    public boolean isValid(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
    			stack.push(s.charAt(i));
    		}else {
    			if (stack.empty()) {
    				return false;
    			}else {
    				if (s.charAt(i)==')'&&stack.peek()=='(') {
    					stack.pop();
    					continue;
    				}else if (s.charAt(i)=='}'&&stack.peek()=='{') {
    					stack.pop();
    					continue;
    				}else if (s.charAt(i)==']'&&stack.peek()=='[') {
    					stack.pop();
    					continue;
    				}else {
    					return false;
    				}
    			}
    		}
    	}
    	if (stack.empty()) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
