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
		int[] Testnums= {1,1,2,3};
		Test.removeDuplicates(Testnums);
		for (int i=0;i<4;i++) {
			System.out.print(Testnums[i]+" ");
		}
		/*
		for (int i=1;i<3;i++) {
			Testnums[i]=Testnums[i+1];
		}
		for (int i=0;i<4;i++) {
			System.out.print(Testnums[i]+" ");
		}
		*/
	}

}
