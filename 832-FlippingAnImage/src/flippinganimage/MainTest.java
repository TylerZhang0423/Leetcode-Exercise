package flippinganimage;

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
