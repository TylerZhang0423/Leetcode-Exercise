//121. ������Ʊ�����ʱ��
//����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
//��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������
//ע���㲻���������Ʊǰ������Ʊ��
//ʾ�� 1:
//����: [7,1,5,3,6,4]
//���: 5
//����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
//ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
//ʾ�� 2:
//����: [7,6,4,3,1]
//���: 0
//����: �����������, û�н������, �����������Ϊ 0��
package besttimetobuyandsellstock;

public class Solution {
    public int maxProfit(int[] prices) {
    	int maxProfit=0;
        for (int i=0;i<prices.length-1;i++) {
        	for (int j=i+1;j<prices.length;j++) {
        		if (prices[i]>=prices[j]) {
        			continue;
        		}else {
        			if (prices[j]-prices[i]>maxProfit) {
        				maxProfit=prices[j]-prices[i];
        			}
        		}
        	}
        }
        return maxProfit;
    }
}
