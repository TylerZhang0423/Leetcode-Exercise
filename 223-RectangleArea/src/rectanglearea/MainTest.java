//223. 矩形面积
//在二维平面上计算出两个由直线构成的矩形重叠后形成的总面积。
//每个矩形由其左下顶点和右上顶点坐标表示，
//示例:
//输入: -3, 0, 3, 4, 0, -1, 9, 2
//输出: 45
package rectanglearea;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] testSolution= {-3, 0, 3, 4, 0, -1, 9, 2};
		//int[] testSolution= {0,0,0,0,-1,-1,1,1};
		//int[] testSolution= {-2,-2,2,2,3,3,4,4};
		//int[] testSolution= {-2,-2,2,2,-4,3,-3,4};
		//int[] testSolution= {-2,-2,2,2,-1,-1,1,1};
		//int[] testSolution= {-3,0,3,4,0,-1,9,2};
		//int[] testSolution= {-2,-2,2,2,1,1,3,3};
		Solution Test=new Solution();
		System.out.println("面积为："+Test.computeArea(testSolution[0], testSolution[1], testSolution[2], 
				testSolution[3], testSolution[4], testSolution[5], testSolution[6], testSolution[7]));
	}
}
