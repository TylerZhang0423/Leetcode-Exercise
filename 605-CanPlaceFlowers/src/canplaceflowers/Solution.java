//605. �ֻ�����
//��������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С�
//���ǣ����ܲ�����ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
//����һ����̳����ʾΪһ���������0��1������0��ʾû��ֲ����1��ʾ��ֲ�˻�������һ���� n ��
//�ܷ��ڲ�������ֲ�������������� n �仨�����򷵻�True�������򷵻�False��
//ʾ�� 1:
//����: flowerbed = [1,0,0,0,1], n = 1
//���: True
//ʾ�� 2:
//����: flowerbed = [1,0,0,0,1], n = 2
//���: False
package canplaceflowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flag=0;
        if (flowerbed.length==1) {
        	if (flowerbed[0]+n<=1) {
        		return true;
        	}else {
        		return false;
        	}
        }
        if (flowerbed.length==2) {
        	if (flowerbed[0]+flowerbed[1]+n<=1) {
        		return true;
        	}else {
        		return false;
        	}
        }
    	for (int i=0;i<flowerbed.length-1;i++) {
        	if (i==0&&flowerbed[i]==0&&flowerbed[i+1]==0) {
        		flag++;
        		flowerbed[i]=1;
        	}
        	if (i>0&&flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0) {
        		flag++;
        		flowerbed[i]=1;
        	}
        }
    	if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0) {
    		flag++;
    		flowerbed[flowerbed.length-1]=1;
    	}
    	if (flag>=n) {
    		return true;
    	}
    	return false;
    }
}
