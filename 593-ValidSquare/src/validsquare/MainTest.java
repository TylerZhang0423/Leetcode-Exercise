//593. 有效的正方形
//给定二维空间中四点的坐标，返回四点是否可以构造一个正方形。
//一个点的坐标（x，y）由一个有两个整数的整数数组表示。
//示例:
//输入: p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
//输出: True
//注意:
//所有输入整数都在 [-10000，10000] 范围内。
//一个有效的正方形有四个等长的正长和四个等角（90度角）。
//输入点没有顺序。
package validsquare;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p1={0,0};
		int[] p2={1,1};
		int[] p3={1,0};
		int[] p4={0,1};
		Solution Test=new Solution();
		System.out.println(Test.validSquare(p1, p2, p3, p4));
	}
}
