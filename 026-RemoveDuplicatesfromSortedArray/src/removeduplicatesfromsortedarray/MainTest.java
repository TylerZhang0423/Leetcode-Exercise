//26. ɾ�����������е��ظ���
//����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
//�������� nums = [1,1,2], 
//����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2�� 
//�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
package removeduplicatesfromsortedarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=null;
		Test=new Solution();
		int[] Testnums= {1,1,1};
		System.out.println(Test.removeDuplicates(Testnums));
		System.out.println();
		for (int i=0;i<Testnums.length;i++) {
			System.out.print(Testnums[i]+" ");
		}
	}
}
