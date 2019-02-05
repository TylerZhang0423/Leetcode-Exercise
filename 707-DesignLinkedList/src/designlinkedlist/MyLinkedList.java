//707. �������
//��������ʵ�֡�������ѡ��ʹ�õ������˫�����������еĽڵ�Ӧ�þ����������ԣ�val �� next��
//val �ǵ�ǰ�ڵ��ֵ��next ��ָ����һ���ڵ��ָ��/���á�
//���Ҫʹ��˫����������Ҫһ������ prev ��ָʾ�����е���һ���ڵ㡣
//���������е����нڵ㶼�� 0-index �ġ�
//����������ʵ����Щ���ܣ�
//get(index)����ȡ�����е� index ���ڵ��ֵ�����������Ч���򷵻�-1��
//addAtHead(val)��������ĵ�һ��Ԫ��֮ǰ���һ��ֵΪ val �Ľڵ㡣������½ڵ㽫��Ϊ����ĵ�һ���ڵ㡣
//addAtTail(val)����ֵΪ val �Ľڵ�׷�ӵ���������һ��Ԫ�ء�
//addAtIndex(index,val)���������еĵ� index ���ڵ�֮ǰ���ֵΪ val  �Ľڵ㡣
//��� index ��������ĳ��ȣ���ýڵ㽫���ӵ������ĩβ����� index ���������ȣ��򲻻����ڵ㡣
//deleteAtIndex(index)��������� index ��Ч����ɾ�������еĵ� index ���ڵ㡣
//ʾ����
//MyLinkedList linkedList = new MyLinkedList();
//linkedList.addAtHead(1);
//linkedList.addAtTail(3);
//linkedList.addAtIndex(1,2);   //�����Ϊ1-> 2-> 3
//linkedList.get(1);            //����2
//linkedList.deleteAtIndex(1);  //����������1-> 3
//linkedList.get(1);            //����3
package designlinkedlist;

public class MyLinkedList {
	private ListNode first;
	public int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.first=null;
        this.size=0;
    }
    
    /** Get the value of the index-th node in the linked list. 
     * If the index is invalid, return -1. */
    public int get(int index) {
        ListNode temp=first;
        int count1=0;
        if (size<=index) {
        	return -1;
        }
        if (first==null) {
        	return 0;
        }
        while (temp.getNext()!=null) {
        	if (count1==index) {
        		break;
        	}
        	temp=temp.getNext();
        	count1++;
        }
        return temp.getVal();
    }
    
    /** Add a node of value val before the first element of the linked list. 
     * After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
    	ListNode newNode=new ListNode(val);
    	if (first==null) {
    		first=newNode;
    	}else {
    		newNode.setNext(first);
    		first=newNode;
    	}
    	size++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
    	ListNode newNode=new ListNode(val);
    	ListNode temp=first;
    	if (first==null) {
    		first=newNode;
    	}else {
    		while (temp.getNext()!=null) {
    			temp=temp.getNext();
    		}
    		temp.setNext(newNode);
    	}
    	size++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. 
     * If index equals to the length of linked list, 
     * the node will be appended to the end of linked list. 
     * If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	ListNode newNode=new ListNode(val);
    	ListNode temp=first;
    	int count2=0;
    	if (index<=size) {
    		if (first==null) {
    			first=newNode;
    		}else {
    			while (temp.getNext()!=null) {
    				if (count2==index-1) {
    					break;
    				}
    				temp=temp.getNext();
    				count2++;
    			}   	
    			newNode.setNext(temp.getNext());
    			temp.setNext(newNode);
    		}
    		size++;
    	}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	ListNode temp=first;
    	ListNode ago=first;
    	int count3=0;
    	if (index<size) {
    		while (temp.getNext()!=null) {
    			if (count3==index) {
    				break;
    			}
    			ago=temp;
    			temp=temp.getNext();
    			count3++;
    		}
    		ago.setNext(temp.getNext());
    		size--;
    	}
    }
}
class ListNode {
	private int val;
	private ListNode next;
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	ListNode(int x) { val = x; }	
}