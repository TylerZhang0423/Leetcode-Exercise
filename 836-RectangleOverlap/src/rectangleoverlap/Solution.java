//836. �����ص�
//�������б� [x1, y1, x2, y2] ����ʽ��ʾ������ (x1, y1) Ϊ���½ǵ����꣬(x2, y2) �����Ͻǵ����ꡣ
//����ཻ�����Ϊ��������������ص�����Ҫ��ȷ���ǣ�ֻ�ڽǻ�߽Ӵ����������β������ص���
//�����������Σ��ж������Ƿ��ص������ؽ����
//ʾ�� 1��
//���룺rec1 = [0,0,2,2], rec2 = [1,1,3,3]
//�����true
//ʾ�� 2��
//���룺rec1 = [0,0,1,1], rec2 = [1,0,2,1]
//�����false
package rectangleoverlap;

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec2[0]>=rec1[2]||rec1[1]>=rec2[3]||rec2[1]>=rec1[3]||rec2[2]<=rec1[0]) {
        	return false;
        }
        return true;
    }
}
