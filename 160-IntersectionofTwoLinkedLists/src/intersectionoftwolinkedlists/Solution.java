//160. �ཻ����
//��дһ�������ҵ������������ཻ����ʼ�ڵ㡣
//ʾ�� 1��
//���룺intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
//�����Reference of the node with value = 8
//������ͣ��ཻ�ڵ��ֵΪ 8 ��ע�⣬��������б��ཻ����Ϊ 0�����Ӹ��Եı�ͷ��ʼ�������� A Ϊ [4,1,8,4,5]������ B Ϊ [5,0,1,8,4,5]���� A �У��ཻ�ڵ�ǰ�� 2 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 3 ���ڵ㡣
//ʾ�� 2��
//���룺intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
//�����Reference of the node with value = 2
//������ͣ��ཻ�ڵ��ֵΪ 2 ��ע�⣬��������б��ཻ����Ϊ 0�����Ӹ��Եı�ͷ��ʼ�������� A Ϊ [0,9,1,2,4]������ B Ϊ [3,2,4]���� A �У��ཻ�ڵ�ǰ�� 3 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 1 ���ڵ㡣
//ʾ�� 3��
//���룺intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
//�����null
//������ͣ��Ӹ��Եı�ͷ��ʼ�������� A Ϊ [2,6,4]������ B Ϊ [1,5]�����������������ཻ������ intersectVal ����Ϊ 0���� skipA �� skipB ����������ֵ��
//���ͣ������������ཻ����˷��� null��
//ע�⣺
//�����������û�н��㣬���� null.
//�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
//�ɼٶ���������ṹ��û��ѭ����
//���������� O(n) ʱ�临�Ӷȣ��ҽ��� O(1) �ڴ档
//��������ͬ���ȵ��������һ������
package intersectionoftwolinkedlists;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	int lengthA=0;
    	int lengthB=0;
    	ListNode l1=headA;
    	ListNode l2=headB;
    	while (l1!=null) {
    		lengthA++;
    		l1=l1.next;
    	}
    	while (l2!=null) {
    		lengthB++;
    		l2=l2.next;
    	}
    	if (lengthA>lengthB) {
    		while (lengthA-lengthB>0) {
    			headA=headA.next;
    			lengthA--;
    		}
    	}else {
    		while (lengthB-lengthA>0) {
    			headB=headB.next;
    			lengthB--;
    		}
    	}
    	while (headA!=null) {    		
            if (headA==headB) {
    			return headA;
    		}
    		headA=headA.next;
    		headB=headB.next;
    	}
    	return null;
    }
}
