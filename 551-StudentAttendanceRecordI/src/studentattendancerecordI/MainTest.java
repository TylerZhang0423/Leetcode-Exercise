//551. ѧ�����ڼ�¼ I
//����һ���ַ���������һ��ѧ���ĳ��ڼ�¼�������¼���������������ַ���
//'A' : Absent��ȱ��
//'L' : Late���ٵ�
//'P' : Present������
//���һ��ѧ���ĳ��ڼ�¼�в�����һ��'A'(ȱ��)���Ҳ���������������'L'(�ٵ�),��ô���ѧ���ᱻ���͡�
//����Ҫ�������ѧ���ĳ��ڼ�¼�ж����Ƿ�ᱻ���͡�
//ʾ�� 1:
//����: "PPALLP"
//���: True
//ʾ�� 2:
//����: "PPALLL"
//���: False
package studentattendancerecordI;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString="PPALLL";
		Solution Test=new Solution();
		System.out.println(Test.checkRecord(testString));
	}
}
