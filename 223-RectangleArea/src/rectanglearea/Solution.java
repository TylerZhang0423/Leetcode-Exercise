//223. �������
//�ڶ�άƽ���ϼ����������ֱ�߹��ɵľ����ص����γɵ��������
//ÿ�������������¶�������϶��������ʾ��
//ʾ��:
//����: -3, 0, 3, 4, 0, -1, 9, 2
//���: 45
package rectanglearea;
//˼·���ȼ����ص��������������
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=compute(A,B,C,D);
        int area2=compute(E,F,G,H);
        int left=max(E,A);
        int right=min(C,G);
        int top=min(D,H);
        int bottom=max(B,F);
        if (E>=C||B>=H||F>=D||G<=A) {
        	return area1+area2;
        }
        int overlap=(right-left)*(top-bottom);
        return area1+area2-overlap;
    }
    public int compute(int a, int b, int c, int d) {
    	return ((c-a)*(d-b));
    }
    public int min(int e,int f) {
    	if (e>=f) {
    		return f;
    	}else {
    		return e;
    	}
    }
    public int max(int g,int h) {
    	if (g>=h) {
    		return g;
    	}else {
    		return h;
    	}
    }
}
