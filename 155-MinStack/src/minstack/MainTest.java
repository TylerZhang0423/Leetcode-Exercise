//155. ��Сջ
//���һ��֧�� push��pop��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ��
//push(x) -- ��Ԫ�� x ����ջ�С�
//pop() -- ɾ��ջ����Ԫ�ء�
//top() -- ��ȡջ��Ԫ�ء�
//getMin() -- ����ջ�е���СԪ�ء�
//ʾ��:
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> ���� -3.
//minStack.pop();
//minStack.top();      --> ���� 0.
//minStack.getMin();   --> ���� -2.
package minstack;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin()); //  --> ���� -3.
		minStack.pop();
		System.out.println(minStack.top());    //  --> ���� 0.
		System.out.println(minStack.getMin());  // --> ���� -2.
	}
}
