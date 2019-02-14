//32. 最长有效括号
//给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
//示例 1:
//输入: "(()"
//输出: 2
//解释: 最长有效括号子串为 "()"
//示例 2:
//输入: ")()())"
//输出: 4
//解释: 最长有效括号子串为 "()()"
package longestvalidparentheses;

import java.util.Stack;
//思路：一次循环，用栈来判断是否配对，用同样长度的数组来存储判断结果；
//如果是有效括号，相应的位置是 1，否则是0；
//例如：（（），对应0 1 1 
//首先自定义一个array类，包含两个元素，index存储下标，value存储字符值
//建立一个array类的栈，栈元素可以保存下标值
//一次循环结束，将栈内剩余的元素逐个弹出，将相应位置置0，正是因为没有与其匹配的括号，因此才会剩在栈内，所以相应位置一定不是有效的
//搜索数组中最长的连续1的子串
public class Solution {
	public int longestValidParentheses(String s) {
		if (s.length()==0||s.length()==1) {
    		return 0;
    	}
		//建立array类的栈
		Stack<array> stack=new Stack<array>();
		//建立判断数组
		int[] lengthNum=new int[s.length()];
		int maxLength=0;
    	int sum=0;
    	//建立array类的数组
    	array[] temp=new array[s.length()];
    	//array类数组赋值
    	for (int i=0;i<s.length();i++) {
    		temp[i]=new array();//注意！自定义类型的数组，使用时需要逐个new一个空间，不然会报空指针错误
    		temp[i].index=i;
    		temp[i].value=s.charAt(i);
    	}
    	for (int i=0;i<s.length();i++) {
    		if (s.charAt(i)=='(') {//如果是左括号，可以进栈，可能是有效的，相应位置置1
    			stack.push(temp[i]);
    			lengthNum[i]=1;
    		}else {
    			if (stack.empty()) {//如果栈为空，且是右括号，一定是无效的
    				lengthNum[i]=0;
    			}else {
    				stack.pop();//如果栈非空，则弹出一个左括号匹配，这个右括号也是有效的
    				lengthNum[i]=1;
    			}
    		}
    	}
    	if (!stack.empty()) {//如果最后栈内有剩余元素，则把对应元素的位置置为0，必定无效
    		while (stack.size()>0) {
    			lengthNum[stack.peek().index]=0;//下标用在此处
    			stack.pop();
    		}
    	}
    	//统计最长的连续1，这个就是最长的有效括号
    	for (int k=0;k<lengthNum.length;k++) {
    		if (lengthNum[k]!=0) {
    			sum=sum+lengthNum[k];
    		}else {
    			sum=0;
    		}
    		if (sum>maxLength) {
    			maxLength=sum;
    		}
    	}
    	return maxLength;
	}
}
//自定义的array类，存储字符值和下标
class array{
	char value;
	int index;
}
