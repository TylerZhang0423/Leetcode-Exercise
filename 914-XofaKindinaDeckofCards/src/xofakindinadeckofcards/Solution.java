//914. ���Ʒ���
//����һ���ƣ�ÿ�����϶�д��һ��������
//��ʱ������Ҫѡ��һ������ X��ʹ���ǿ��Խ������ư���������ֳ� 1 �������飺
//ÿ�鶼�� X ���ơ�
//�������е����϶�д����ͬ��������
//�������ѡ�� X >= 2 ʱ���� true��
//ʾ�� 1��
//���룺[1,2,3,4,4,3,2,1]
//�����true
//���ͣ����еķ����� [1,1]��[2,2]��[3,3]��[4,4]
//ʾ�� 2��
//���룺[1,1,1,2,2,2,3,3]
//�����false
//���ͣ�û������Ҫ��ķ��顣
//ʾ�� 3��
//���룺[1]
//�����false
//���ͣ�û������Ҫ��ķ��顣
//ʾ�� 4��
//���룺[1,1]
//�����true
//���ͣ����еķ����� [1,1]
//ʾ�� 5��
//���룺[1,1,2,2,2,2]
//�����true
//���ͣ����еķ����� [1,1]��[2,2]��[2,2]
//��ʾ��
//1 <= deck.length <= 10000
//0 <= deck[i] < 10000
package xofakindinadeckofcards;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length<=1) {
        	return false;
        }
        int[] arr = new int[10000];
        for (int i=0;i<deck.length;i++) {
        	arr[deck[i]]++;
        }
        for (int j=0;j<arr.length-1;j++) {
        	if (arr[j]>0) {
        		for (int k=j+1;k<arr.length;k++) {
        			if (GCD(arr[j],arr[k])==1) {
        				return false;
        			}
        		}
        	}
        }
        return true;
    }
    public int GCD(int a,int b) {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
    }
}
