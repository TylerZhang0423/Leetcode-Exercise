//657. �������ܷ񷵻�ԭ��
//�ڶ�άƽ���ϣ���һ�������˴�ԭ�� (0, 0) ��ʼ��
//���������ƶ�˳���ж����������������ƶ����Ƿ��� (0, 0) ��������
//�ƶ�˳�����ַ�����ʾ���ַ� move[i] ��ʾ��� i ���ƶ���
//�����˵���Ч������ R���ң���L���󣩣�U���ϣ��� D���£���
//�����������������ж����󷵻�ԭ�㣬�򷵻� true�����򣬷��� false��
//ע�⣺�����ˡ��泯���ķ����޹ؽ�Ҫ�� ��R�� ��ʼ��ʹ�����������ƶ�һ�Σ���L�� ��ʼ�������ƶ��ȡ�
//���⣬����ÿ���ƶ������˵��ƶ�������ͬ��
//ʾ�� 1:
//����: "UD"
//���: true
//���ͣ������������ƶ�һ�Σ�Ȼ�������ƶ�һ�Ρ�
//���ж�����������ͬ�ķ��ȣ���������ջص�����ʼ��ԭ�㡣��ˣ����Ƿ��� true��
//ʾ�� 2:
//����: "LL"
//���: false
//���ͣ������������ƶ����Ρ�������λ��ԭ�����࣬��ԭ�������� ���ƶ��� �ľ��롣
//���Ƿ��� false����Ϊ�����ƶ�����ʱû�з���ԭ�㡣
package robotreturntoorigin;
import java.util.Stack ;
public class Solution {
    public boolean judgeCircle(String moves) {
    	Stack<Character> stackU = new Stack<Character>();
    	Stack<Character> stackD = new Stack<Character>();
    	Stack<Character> stackL = new Stack<Character>();
    	Stack<Character> stackR = new Stack<Character>();
    	for (int i=0;i<moves.length();i++) {
    		if (moves.charAt(i)=='U') {
    			stackU.push(moves.charAt(i));
    		}else if (moves.charAt(i)=='D') {
    			stackD.push(moves.charAt(i));
    		}else if (moves.charAt(i)=='L') {
    			stackL.push(moves.charAt(i));
    		}else {
    			stackR.push(moves.charAt(i));
    		}
    	}
    	if (stackU.size()==stackD.size()&&stackL.size()==stackR.size()) {
    		return true;
    	}else {
    		return false;
    	}
    }
}