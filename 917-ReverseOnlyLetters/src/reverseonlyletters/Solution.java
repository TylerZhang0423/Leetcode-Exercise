//917. 仅仅反转字母
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
//示例 1：
//输入："ab-cd"
//输出："dc-ba"
//示例 2：
//输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
//示例 3：
//输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
//提示：
//S.length <= 100
//33 <= S[i].ASCIIcode <= 122 
//S 中不包含 \ or "
package reverseonlyletters;
import java.util.Stack;
public class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> stack1=new Stack<Character>();
        Stack<Character> stack2=new Stack<Character>();
        String result="";        
        for (int j=S.length()-1;j>=0;j--) {
        	if (('A'<=S.charAt(j)&&S.charAt(j)<=90)||('a'<=S.charAt(j)&&S.charAt(j)<='z')){
        		stack1.push(S.charAt(j));
        	}
        }
        for (int i=0;i<S.length();i++) {
        	stack2.push(S.charAt(i));
        }

        while (!stack2.empty()) {
        	if (('A'<=stack2.peek()&&stack2.peek()<='Z')||('a'<=stack2.peek()&&stack2.peek()<='z')) {
        		result=String.valueOf(stack1.peek())+result;
        		stack1.pop();
        		stack2.pop();
        	}else {
        		result=String.valueOf(stack2.peek())+result;
        		stack2.pop();
        	}
        }
        return result;
    }
}
