//622设计循环队列
//设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）原则
//并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
//循环队列的一个好处是我们可以利用这个队列之前用过的空间。
//在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，
//即使在队列前面仍有空间。但是使用循环队列，我们能使用这些空间去存储新的值。
package designcircularqueue;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MyCircularQueue circularQueue = new MyCircularQueue(3); // set the size to be 3
		System.out.println(circularQueue.enQueue(1));  // return true
		System.out.println(circularQueue.enQueue(2));  // return true
		System.out.println(circularQueue.enQueue(3));  // return true
		System.out.println(circularQueue.enQueue(4));  // return false, the queue is full
		System.out.println(circularQueue.Rear());  // return 3
		System.out.println(circularQueue.isFull());  // return true
		System.out.println(circularQueue.deQueue());  // return true
		System.out.println(circularQueue.enQueue(4));  // return true
		System.out.println(circularQueue.Rear());  // return 4
	}

}
