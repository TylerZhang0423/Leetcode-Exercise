//223. �������
//�ڶ�άƽ���ϼ����������ֱ�߹��ɵľ����ص����γɵ��������
//ÿ�������������¶�������϶��������ʾ��
//ʾ��:
//����: -3, 0, 3, 4, 0, -1, 9, 2
//���: 45
package rectanglearea;

public class MainTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] testSolution= {-3, 0, 3, 4, 0, -1, 9, 2};
		//int[] testSolution= {0,0,0,0,-1,-1,1,1};
		//int[] testSolution= {-2,-2,2,2,3,3,4,4};
		//int[] testSolution= {-2,-2,2,2,-4,3,-3,4};
		//int[] testSolution= {-2,-2,2,2,-1,-1,1,1};
		//int[] testSolution= {-3,0,3,4,0,-1,9,2};
		//int[] testSolution= {-2,-2,2,2,1,1,3,3};
		Solution Test=new Solution();
		System.out.println("���Ϊ��"+Test.computeArea(testSolution[0], testSolution[1], testSolution[2], 
				testSolution[3], testSolution[4], testSolution[5], testSolution[6], testSolution[7]));
	}
}
