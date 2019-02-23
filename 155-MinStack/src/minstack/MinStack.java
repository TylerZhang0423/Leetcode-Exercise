//155. 最小栈
//设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//push(x) -- 将元素 x 推入栈中。
//pop() -- 删除栈顶的元素。
//top() -- 获取栈顶元素。
//getMin() -- 检索栈中的最小元素。
//示例:
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
package minstack;

public class MinStack {
	public element[] array=new element[7500];
	public int top;
	/** initialize your data structure here. */
    public MinStack() {
    	this.top=-1;
    }
    //压栈时比较一下最小值，保存在array[top].minValue中
    public void push(int x) {
    	top++;
    	array[top]= new element();//使用自定义类需要加这行
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
    //最小元素就存储在栈顶，直接访问即可
    public int getMin() {
        return array[top].minValue;
    }
}
//建立一个自定义类，包括值和当前最小值
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