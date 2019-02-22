//504. 七进制数
//给定一个整数，将其转化为7进制，并以字符串形式输出。
//示例 1:
//输入: 100
//输出: "202"
//示例 2:
//输入: -7
//输出: "-10"
//注意: 输入范围是 [-1e7, 1e7] 。
package base7;
import java.util.Stack ;
public class Solution {
    public String convertToBase7(int num) {
        Stack<Integer> stack=new Stack<>();
        String result="";
        while (num>0) {
        	stack.push(num%7);
        	num=num/7;
        }
        while (!stack.empty()) {
        	result=result.concat(String.valueOf(stack.peek()));
        	stack.pop();
        }
        return result;
    }
}
