package sortarraybyparity;
//905-����ż��������
//����һ���Ǹ���������A������һ����A������ż��Ԫ����ɵ����飬�����A����������Ԫ�ء�
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray= {1,2,3,4,5};
		Solution Test=new Solution();
		int[] result=Test.sortArrayByParity(testArray);
		for (int count2=0;count2<result.length;count2++) {
			System.out.println(result[count2]);
		}
	}

}
