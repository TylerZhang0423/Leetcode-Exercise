//506. �������
//���� N ���˶�Ա�ĳɼ����ҳ����ǵ�������β�����ǰ������Ӧ�Ľ��ơ�
//ǰ�����˶�Ա���ᱻ�ֱ����� �����ơ��������ơ� �͡� ͭ�ơ�
//��"Gold Medal", "Silver Medal", "Bronze Medal"����
//(ע������Խ�ߵ�ѡ�֣�����Խ��ǰ��)
//ʾ�� 1:
//����: [5, 4, 3, 2, 1]
//���: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
//����: ǰ�����˶�Ա�ĳɼ�Ϊǰ���ߵģ���˽���ֱ����� �����ơ��������ơ��͡�ͭ�ơ� ("Gold Medal", "Silver Medal" and "Bronze Medal").
//���µ������˶�Ա������ֻ��Ҫͨ�����ǵĳɼ����㽫��������μ��ɡ�
//��ʾ:
//N ��һ�����������Ҳ��ᳬ�� 10000��
//�����˶�Ա�ĳɼ�������ͬ��
package relativeranks;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray={5, 4, 3, 2, 1};
		Solution Test=new Solution();
		String[] res=new String[testArray.length];
		res=Test.findRelativeRanks(testArray);
		for (int i=0;i<testArray.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
