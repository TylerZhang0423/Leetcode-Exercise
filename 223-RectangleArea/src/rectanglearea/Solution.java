//223. 矩形面积
//在二维平面上计算出两个由直线构成的矩形重叠后形成的总面积。
//每个矩形由其左下顶点和右上顶点坐标表示，
//示例:
//输入: -3, 0, 3, 4, 0, -1, 9, 2
//输出: 45
package rectanglearea;
//思路：先计算重叠面积的上下左右
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
