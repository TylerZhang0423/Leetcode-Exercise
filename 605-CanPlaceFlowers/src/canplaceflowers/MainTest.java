//605. �ֻ�����
//��������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С�
//���ǣ����ܲ�����ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
//����һ����̳����ʾΪһ���������0��1������0��ʾû��ֲ����1��ʾ��ֲ�˻�������һ���� n ��
//�ܷ��ڲ�������ֲ�������������� n �仨�����򷵻�True�������򷵻�False��
//ʾ�� 1:
//����: flowerbed = [1,0,0,0,1], n = 1
//���: True
//ʾ�� 2:
//����: flowerbed = [1,0,0,0,1], n = 2
//���: False
package canplaceflowers;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testArray= {1,0,0,0,0,1};
		int target=2;
		Solution Test=new Solution();
		System.out.println(Test.canPlaceFlowers(testArray, target));
	}
}
