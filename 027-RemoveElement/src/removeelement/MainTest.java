//27. �Ƴ�Ԫ��
//����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
//��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
//Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
package removeelement;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=null;
		Test=new Solution();
		int[] TestArray= {0,1,2,2,3,0,4,2};
	//	int[] TestArray= {3,2,2,3};
		System.out.println(Test.removeElement(TestArray, 2));
		for (int k=0;k<TestArray.length;k++)
			System.out.print(TestArray[k]+" ");
	}

}
