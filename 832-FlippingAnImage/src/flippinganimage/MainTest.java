package flippinganimage;
//832. ��תͼ��
//����һ�������ƾ��� A����������ˮƽ��תͼ��Ȼ��תͼ�񲢷��ؽ����
//ˮƽ��תͼƬ���ǽ�ͼƬ��ÿһ�ж����з�ת��������
//���磬ˮƽ��ת [1, 1, 0] �Ľ���� [0, 1, 1]��
//��תͼƬ����˼��ͼƬ�е� 0 ȫ���� 1 �滻�� 1 ȫ���� 0 �滻��
//���磬��ת [0, 1, 1] �Ľ���� [1, 0, 0]��
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]AA=new int[5][5];
		for(int row=0;row<AA.length;row++) {
			for(int column=0;column<AA[row].length;column++) {
				AA[row][column]=row+column;
			}
		}
		for(int row=0;row<AA.length;row++) {
			for(int column=0;column<AA[row].length;column++) {
				System.out.print(AA[row][column]+" ");
			}
			System.out.println();
		}
		System.out.println();
		Solution testSolution=new Solution();
		testSolution.flipAndInvertImage(AA);
		for(int row=0;row<AA.length;row++) {
			for(int column=0;column<AA[row].length;column++) {
				System.out.print(AA[row][column]+" ");
			}
			System.out.println();
		}
	}
}
