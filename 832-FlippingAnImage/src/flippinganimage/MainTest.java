package flippinganimage;
//832. 翻转图像
//给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//水平翻转图片就是将图片的每一行都进行翻转，即逆序。
//例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
//反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。
//例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
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
