//151. ��ת�ַ�����ĵ���
//����һ���ַ����������ת�ַ����е�ÿ�����ʡ�
//ʾ�� 1��
//����: "the sky is blue"
//���: "blue is sky the"
//ʾ�� 2��
//����: "  hello world!  "
//���: "world! hello"
//����: �����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
//ʾ�� 3��
//����: "a good   example"
//���: "example good a"
//����: ����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ����
//˵����
//�޿ո��ַ�����һ�����ʡ�
//�����ַ���������ǰ����ߺ����������Ŀո񣬵��Ƿ�ת����ַ����ܰ�����
//����������ʼ��ж���Ŀո񣬽���ת�󵥴ʼ�Ŀո���ٵ�ֻ��һ����
package reversewordsinastring;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="the sky  is blue";
		Solution Test=new Solution();
		System.out.println(Test.reverseWords(testString));
	}
}
