//237. ɾ�������еĽڵ�
//���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣
//ʾ�� 1:
//����: head = [4,5,1,9], node = 5
//���: [4,1,9]
//����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 1 -> 9.
package deletenodeinalinkedlist;

public class Solution {
    public void deleteNode(ListNode node) {
    	node.val=node.next.val;
		node.next=node.next.next;        
    }
}
//��֪��Ҫɾ��ĳ���ڵ㣬ֻ��Ҫ���¸��ڵ��ֵcopy�������ٽ�����ָ���¸��ڵ㣬ֱ��������ǰ�ڵ㼴�ɡ�