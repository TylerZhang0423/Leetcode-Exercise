//917. ������ת��ĸ
//����һ���ַ��� S������ ����ת��ġ� �ַ��������в�����ĸ���ַ���������ԭ�أ���������ĸ��λ�÷�����ת��
//ʾ�� 1��
//���룺"ab-cd"
//�����"dc-ba"
//ʾ�� 2��
//���룺"a-bC-dEf-ghIj"
//�����"j-Ih-gfE-dCba"
//ʾ�� 3��
//���룺"Test1ng-Leet=code-Q!"
//�����"Qedo1ct-eeLg=ntse-T!"
//��ʾ��
//S.length <= 100
//33 <= S[i].ASCIIcode <= 122 
//S �в����� \ or "
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
