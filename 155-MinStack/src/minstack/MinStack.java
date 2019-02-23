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

public class MinStack {
	public element[] array=new element[7500];
	public int top;
	/** initialize your data structure here. */
    public MinStack() {
    	this.top=-1;
    }
    //ѹջʱ�Ƚ�һ����Сֵ��������array[top].minValue��
    public void push(int x) {
    	top++;
    	array[top]= new element();//ʹ���Զ�������Ҫ������
        array[top].value=x;
        if (top>0) {
        	if (x<=array[top-1].minValue) {
        		array[top].minValue=x;
        	}else {
        		array[top].minValue=array[top-1].minValue;
        	}
        }else {
        	array[top].minValue=x;
        }
        
    }   
    public void pop() {
        top--;
    }   
    public int top() {
        return array[top].value;
    } 
    //��СԪ�ؾʹ洢��ջ����ֱ�ӷ��ʼ���
    public int getMin() {
        return array[top].minValue;
    }
}
//����һ���Զ����࣬����ֵ�͵�ǰ��Сֵ
class element {
	public int value;
	public int minValue;
	public element() {
		super();
		this.value = 0;
		this.minValue = 0;
	}
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */