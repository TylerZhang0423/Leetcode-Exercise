//344. ��ת�ַ���
//��дһ���������������ǽ�������ַ�����ת�����������ַ������ַ����� char[] ����ʽ������
//��Ҫ�����������������Ŀռ䣬�����ԭ���޸��������顢ʹ�� O(1) �Ķ���ռ�����һ���⡣
//����Լ��������е������ַ����� ASCII ����еĿɴ�ӡ�ַ���
//ʾ�� 1��
//���룺["h","e","l","l","o"]
//�����["o","l","l","e","h"]
//ʾ�� 2��
//���룺["H","a","n","n","a","h"]
//�����["h","a","n","n","a","H"]
package reversestring;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] testArray= {'h','e','l','l','o'};
		Solution Test=new Solution();
		Test.reverseString(testArray);
		for (int i=0;i<testArray.length;i++) {
			System.out.print(testArray[i]+" ");
		}
	}
}
