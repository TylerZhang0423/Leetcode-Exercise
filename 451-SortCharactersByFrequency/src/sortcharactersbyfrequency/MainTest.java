//451. �����ַ�����Ƶ������
//����һ���ַ������뽫�ַ�������ַ����ճ��ֵ�Ƶ�ʽ������С�
//ʾ�� 1:
//����:
//"tree"
//���:
//"eert"
//����:
//'e'�������Σ�'r'��'t'��ֻ����һ�Ρ�
//���'e'���������'r'��'t'֮ǰ�����⣬"eetr"Ҳ��һ����Ч�Ĵ𰸡�
//ʾ�� 2:
//����:
//"cccaaa"
//���:
//"cccaaa"
//����:
//'c'��'a'���������Ρ����⣬"aaaccc"Ҳ����Ч�Ĵ𰸡�
//ע��"cacaca"�ǲ���ȷ�ģ���Ϊ��ͬ����ĸ�������һ��
//ʾ�� 3:
//����:
//"Aabb"
//���:
//"bbAa"
//����:
//���⣬"bbaA"Ҳ��һ����Ч�Ĵ𰸣���"Aabb"�ǲ���ȷ�ġ�
//ע��'A'��'a'����Ϊ�����ֲ�ͬ���ַ���
package sortcharactersbyfrequency;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="tree122";
		Solution Test=new Solution();
		System.out.println(Test.frequencySort(testString));
	}
}
