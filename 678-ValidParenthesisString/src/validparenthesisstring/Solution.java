//678. 有效的括号字符串
//给定一个只包含三种字符的字符串：（ ，） 和 *，写一个函数来检验这个字符串是否为有效字符串。
//有效字符串具有如下规则：
//任何左括号 ( 必须有相应的右括号 )。
//任何右括号 ) 必须有相应的左括号 ( 。
//左括号 ( 必须在对应的右括号之前 )。
//* 可以被视为单个右括号 ) ，或单个左括号 ( ，或一个空字符串。
//一个空字符串也被视为有效字符串。
//示例 1:
//输入: "()"
//输出: True
//示例 2:
//输入: "(*)"
//输出: True
//示例 3:
//输入: "(*))"
//输出: True
//注意:
//字符串大小将在 [1，100] 范围内。
package validparenthesisstring;
import java.util.Stack ;
public class Solution {
    public boolean checkValidString(String s) {
    	Stack<Character> stack1 = new Stack<Character>();
    	Stack<Character> stack2 = new Stack<Character>();
    	Stack<Character> stack3 = new Stack<Character>();
    	Stack<Character> stack4 = new Stack<Character>();
    	//先从左往右循环一边
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='(') {
    			stack1.push(s.charAt(i));
    		}else if (s.charAt(i)=='*') {
    			stack2.push(s.charAt(i));
    		}
    		else {
    			if (stack1.empty()&&stack2.empty()) {
    				return false;
    			}else {
    				if (stack1.empty()==false&&stack2.empty()==false) {
    					if (s.charAt(i)==')'&&stack1.peek()=='(') {
    						stack1.pop();
    						continue;
    					}else {
    						stack2.pop();
    						continue;
    					}
    				}else if (stack1.empty()==false&&stack2.empty()==true) {
    					if (s.charAt(i)==')'&&stack1.peek()=='(') {
    						stack1.pop();
    						continue;
    					}else {
    						return false;
    					}
    				}else if (stack1.empty()==true&&stack2.empty()==false) {
    					stack2.pop();
    					continue;
    				}
    			}
    		}
    	}
    	//从右往左循环
    	for (int i=s.length()-1;i>=0;i--) {
    		if (s.charAt(i)==')') {
    			stack3.push(s.charAt(i));
    		}else if (s.charAt(i)=='*') {
    			stack4.push(s.charAt(i));
    		}
    		else {
    			if (stack3.empty()&&stack4.empty()) {
    				return false;
    			}else {
    				if (stack3.empty()==false&&stack4.empty()==false) {
    					if (s.charAt(i)=='('&&stack3.peek()==')') {
    						stack3.pop();
    						continue;
    					}else {
    						stack4.pop();
    						continue;
    					}
    				}else if (stack3.empty()==false&&stack4.empty()==true) {
    					if (s.charAt(i)=='('&&stack3.peek()==')') {
    						stack3.pop();
    						continue;
    					}else {
    						return false;
    					}
    				}else if (stack3.empty()==true&&stack4.empty()==false) {
    					stack4.pop();
    					continue;
    				}
    			}
    		}
    	}
    	
    	if (stack1.size()<=stack2.size()||stack1.empty()==true) {
    		return true;
    	}else {
    		return false;
    	}
    }
}


//if (s.charAt(i)==')'&&stack1.peek()=='(') {
//stack1.pop();
//continue;
//}else if (s.charAt(i)=='}'&&stack1.peek()=='{') {
//stack1.pop();
//continue;
//}else if (s.charAt(i)==']'&&stack1.peek()=='[') {
//stack1.pop();
//continue;
//}else {
//return false;