//848. ��ĸ��λ
//��һ����Сд��ĸ��ɵ��ַ��� S����һ���������� shifts��
//���ǽ���ĸ���е���һ����ĸ��Ϊԭ��ĸ�� ��λ��������ĸ���ǻ��Ƶģ� 'z' ������ 'a'����
//���硤��shift('a') = 'b'�� shift('t') = 'u',�� �Լ� shift('z') = 'a'��
//����ÿ�� shifts[i] = x �� ���ǻὫ S �е�ǰ i+1 ����ĸ��λ x �Ρ�
//���ؽ�������Щ��λ��Ӧ�õ� S �����յõ����ַ�����
//ʾ����
//���룺S = "abc", shifts = [3,5,9]
//�����"rpl"
//���ͣ� 
//������ "abc" ��ʼ��
//�� S �еĵ� 1 ����ĸ��λ 3 �κ����ǵõ� "dbc"��
//�ٽ� S �е�ǰ 2 ����ĸ��λ 5 �κ����ǵõ� "igc"��
//��� S �е��� 3 ����ĸ��λ 9 �κ����ǵõ��� "rpl"��
//��ʾ��
//1 <= S.length = shifts.length <= 20000
//0 <= shifts[i] <= 10 ^ 9
package shiftingletters;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="ruu";
		int[] testArray={26,9,17};
		Solution Test=new Solution();
		System.out.println(Test.shiftingLetters(testString, testArray));
	}
}
