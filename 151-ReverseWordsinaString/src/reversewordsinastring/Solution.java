//151. ��ת�ַ�����ĵ���
//����һ���ַ����������ת�ַ����е�ÿ�����ʡ�
//ʾ�� 1��
//����: "the sky is blue"
//���: "blue is sky the"
//ʾ�� 2��
//����: "  hello world!  "
//���: "world! hello"
//����: �����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
//ʾ�� 3��
//����: "a good   example"
//���: "example good a"
//����: ����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ����
//˵����
//�޿ո��ַ�����һ�����ʡ�
//�����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
//����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ����
package reversewordsinastring;
import java.util.Stack;
public class Solution {
    public String reverseWords(String s) {
        Stack<String> stack=new Stack<String>();
        String res="";
        for (int i=0;i<s.length();i++) {
        	while (i<s.length()&&s.charAt(i)==' ') {
        		i++;
        	}
        	int j=i;
        	while (j<s.length()&&s.charAt(j)!=' ') {
        		j++;
        	}
        	stack.push(s.substring(i, j));
        	i=j;
        }
        while (!stack.isEmpty()) {
        	res=res+stack.peek()+" ";
        	stack.pop();
        }
        return res.trim();
    }
}
