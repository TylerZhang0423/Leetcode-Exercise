//383. �����
//����һ������� (ransom) �ַ�����һ����־(magazine)�ַ�����
//�жϵ�һ���ַ���ransom�ܲ����ɵڶ����ַ���magazines������ַ����ɡ�
//������Թ��ɣ����� true �����򷵻� false��
//(��Ŀ˵����Ϊ�˲���¶������ּ���Ҫ����־������������Ҫ����ĸ����ɵ����������˼��)
//ע�⣺
//����Լ��������ַ�����ֻ����Сд��ĸ��
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
package ransomnote;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testRansom="aac";
		String testMagazine="aab";
		Solution Test=new Solution();
		System.out.println(Test.canConstruct(testRansom, testMagazine));
	}
}
