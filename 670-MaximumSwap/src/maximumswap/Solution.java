//670. ��󽻻�
//����һ���Ǹ���������������Խ���һ�������е�������λ���������ܵõ������ֵ��
//ʾ�� 1 :
//����: 2736
//���: 7236
//����: ��������2������7��
//ʾ�� 2 :
//����: 9973
//���: 9973
//����: ����Ҫ������
//ע��:�������ֵķ�Χ�� [0, 108]
package maximumswap;

public class Solution {
    public int maximumSwap(int num) {
        int numLength=1;
        int num1=num;
        int num2=num;
        int tempMax=0;
        int index=-1;
        int m=0;
        //�Ȱ�����ת����������
        while (num1>=10) {
        	num1=num1/10;
        	numLength++;
        }
        int[] temp=new int[numLength];
        for (int i=numLength-1;i>=0;i--) {
        	temp[i]=num2%10;
        	num2=num2/10;
        }
        //���������ֱ�9С���������Ҫ���������Ѱ���Ƿ��б�����ģ�
        //���Ѱ�ҵ������ͬ�ģ���ѡ���򿿺��
        for (int i=0;i<numLength-1;i++) {
        	if (temp[i]<9) {
        		tempMax=temp[i];
        		int k=i+1;
        		for (;k<numLength;k++) {
        			if (temp[k]>=tempMax) {
        				tempMax=temp[k];
        				index=k;
        			}
        		}
        		if (index!=-1&&tempMax!=temp[i]) {
        			m=temp[i];
        			temp[i]=temp[index];
        			temp[index]=m;
        			break;
        		}
        		
        	}
        }
        //����������ת������
        int sum=0;
        for (int j=numLength-1;j>=0;j--) {
        	sum=(int) (sum+temp[j]*Math.pow(10,numLength-1-j));
        }
        return sum;
    }
}
