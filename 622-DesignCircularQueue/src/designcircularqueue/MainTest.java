//622���ѭ������
//������ѭ������ʵ�֡� ѭ��������һ���������ݽṹ����������ֻ��� FIFO���Ƚ��ȳ���ԭ��
//���Ҷ�β�������ڶ���֮�����γ�һ��ѭ������Ҳ����Ϊ�����λ���������
//ѭ�����е�һ���ô������ǿ��������������֮ǰ�ù��Ŀռ䡣
//��һ����ͨ�����һ��һ���������ˣ����ǾͲ��ܲ�����һ��Ԫ�أ�
//��ʹ�ڶ���ǰ�����пռ䡣����ʹ��ѭ�����У�������ʹ����Щ�ռ�ȥ�洢�µ�ֵ��
package designcircularqueue;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
