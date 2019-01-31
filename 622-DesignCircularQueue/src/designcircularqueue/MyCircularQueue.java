//622���ѭ������
//������ѭ������ʵ�֡� ѭ��������һ���������ݽṹ����������ֻ��� FIFO���Ƚ��ȳ���ԭ��
//���Ҷ�β�������ڶ���֮�����γ�һ��ѭ������Ҳ����Ϊ�����λ���������
//ѭ�����е�һ���ô������ǿ��������������֮ǰ�ù��Ŀռ䡣
//��һ����ͨ�����һ��һ���������ˣ����ǾͲ��ܲ�����һ��Ԫ�أ�
//��ʹ�ڶ���ǰ�����пռ䡣����ʹ��ѭ�����У�������ʹ����Щ�ռ�ȥ�洢�µ�ֵ��

package designcircularqueue;

public class MyCircularQueue {
	private int FrontPoint;
	private int RearPoint;
	private int maxSize;
	private int elems;
	private int[] queueArray;

    /** Initialize your data structure here.
     *  Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.maxSize=k;
        FrontPoint=0;
        RearPoint=-1;
        elems=0;
        queueArray=new int[k];
    }
    
    /** Insert an element into the circular queue. 
     * Return true if the operation is successful. */
    public boolean enQueue(int value) {
    	if (elems==maxSize) {
    		return false;
    	}
    	if (RearPoint==maxSize-1) {
    		RearPoint=-1;
    	}
    	RearPoint=RearPoint+1;
    	queueArray[RearPoint]=value;
    	elems++;
    	return true;
    }
    
    /** Delete an element from the circular queue. 
     * Return true if the operation is successful. */
    public boolean deQueue() {
    	if (elems==0) {
    		return false;
    	}
    	if (FrontPoint==maxSize) {
    		FrontPoint=0;
    	}
    	FrontPoint=FrontPoint+1;
    	elems--;
    	return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	if (elems==0) {
    		return -1;
    	}
    	return queueArray[FrontPoint];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if (elems==0) {
    		return -1;
    	}
        return queueArray[RearPoint];
    }
    
    /** Checks whether the circular 
     * queue is empty or not. */
    public boolean isEmpty() {
        return (elems==0);
    }
    
    /** Checks whether the circular 
     * queue is full or not. */
    public boolean isFull() {
    	return (elems==maxSize);
    }
}
