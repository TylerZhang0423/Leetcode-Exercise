//622设计循环队列
//设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则
//并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
//循环队列的一个好处是我们可以利用这个队列之前用过的空间。
//在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，
//即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
package designcircularqueue;

public class MyCircularQueue {
	private int FrontPoint;
	private int RearPoint;
	private int maxSize;

    /** Initialize your data structure here.
     *  Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.maxSize=k;
        FrontPoint=
    }
    
    /** Insert an element into the circular queue. 
     * Return true if the operation is successful. */
    public boolean enQueue(int value) {
        
    }
    
    /** Delete an element from the circular queue. 
     * Return true if the operation is successful. */
    public boolean deQueue() {
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return FrontPoint;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        
    }
    
    /** Checks whether the circular 
     * queue is empty or not. */
    public boolean isEmpty() {
        
    }
    
    /** Checks whether the circular 
     * queue is full or not. */
    public boolean isFull() {
        
    }
}
