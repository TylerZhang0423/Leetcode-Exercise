//917. ������ת��ĸ
//����һ���ַ��� S������ ����ת��ġ� �ַ��������в�����ĸ���ַ���������ԭ�أ���������ĸ��λ�÷�����ת��
//ʾ�� 1��
//���룺"ab-cd"
//�����"dc-ba"
//ʾ�� 2��
//���룺"a-bC-dEf-ghIj"
//�����"j-Ih-gfE-dCba"
//ʾ�� 3��
//���룺"Test1ng-Leet=code-Q!"
//�����"Qedo1ct-eeLg=ntse-T!"
//��ʾ��
//S.length <= 100
//33 <= S[i].ASCIIcode <= 122 
//S �в����� \ or "
package reverseonlyletters;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testSolution="ab-cd";
		Solution Test=new Solution();
		System.out.println(Test.reverseOnlyLetters(testSolution));
	}
}
