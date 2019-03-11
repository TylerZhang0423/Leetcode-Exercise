//12. ����ת��������
//�������ְ������������ַ��� I�� V�� X�� L��C��D �� M��
//�ַ�          ��ֵ
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//���磬 �������� 2 д�� II ����Ϊ�������е� 1��
//12 д�� XII ����Ϊ X + II �� 27 д��  XXVII, ��Ϊ XX + V + II ��
//ͨ������£�����������С�������ڴ�����ֵ��ұߡ�
//��Ҳ�������������� 4 ��д�� IIII������ IV��
//���� 1 ������ 5 ����ߣ�����ʾ�������ڴ��� 5 ��С�� 1 �õ�����ֵ 4 ��
//ͬ���أ����� 9 ��ʾΪ IX���������Ĺ���ֻ�������������������
//I ���Է��� V (5) �� X (10) ����ߣ�����ʾ 4 �� 9��
//X ���Է��� L (50) �� C (100) ����ߣ�����ʾ 40 �� 90�� 
//C ���Է��� D (500) �� M (1000) ����ߣ�����ʾ 400 �� 900��
//����һ������������תΪ�������֡�����ȷ���� 1 �� 3999 �ķ�Χ�ڡ�
//ʾ�� 1:
//����: 3
//���: "III"
//ʾ�� 2:
//����: 4
//���: "IV"
//ʾ�� 3:
//����: 9
//���: "IX"
//ʾ�� 4:
//����: 58
//���: "LVIII"
//����: L = 50, V = 5, III = 3.
//ʾ�� 5:
//����: 1994
//���: "MCMXCIV"
//����: M = 1000, CM = 900, XC = 90, IV = 4.
package integertoroman;

public class Solution {
    public String intToRoman(int num) {
    	int flag=0;
    	String res="";
    	while (num>0) {
    		if (flag==0) {
    			if (num%10==9) {
    				res="IX"+res;
    			}else if (num%10==8) {
    				res="VIII"+res;
    			}else if (num%10==7) {
    				res="VII"+res;
    			}else if (num%10==6) {
    				res="VI"+res;
    			}else if (num%10==5) {
    				res="V"+res;
    			}else if (num%10==4) {
    				res="IV"+res;
    			}else if (num%10==3) {
    				res="III"+res;
    			}else if (num%10==2) {
    				res="II"+res;
    			}else if (num%10==1) {
    				res="I"+res;
    			}
    		}else if (flag==1) {
    			if (num%10==9) {
    				res="XC"+res;
    			}else if (num%10==8) {
    				res="LXXX"+res;
    			}else if (num%10==7) {
    				res="LXX"+res;
    			}else if (num%10==6) {
    				res="LX"+res;
    			}else if (num%10==5) {
    				res="L"+res;
    			}else if (num%10==4) {
    				res="XL"+res;
    			}else if (num%10==3) {
    				res="XXX"+res;
    			}else if (num%10==2) {
    				res="XX"+res;
    			}else if (num%10==1) {
    				res="X"+res;
    			}
    		}else if (flag==2) {
    			if (num%10==9) {
    				res="CM"+res;
    			}else if (num%10==8) {
    				res="DCCC"+res;
    			}else if (num%10==7) {
    				res="DCC"+res;
    			}else if (num%10==6) {
    				res="DC"+res;
    			}else if (num%10==5) {
    				res="D"+res;
    			}else if (num%10==4) {
    				res="CD"+res;
    			}else if (num%10==3) {
    				res="CCC"+res;
    			}else if (num%10==2) {
    				res="CC"+res;
    			}else if (num%10==1) {
    				res="C"+res;
    			}
    		}else if (flag==3) {
    			if (num%10==3) {
    				res="MMM"+res;
    			}else if (num%10==2) {
    				res="MM"+res;
    			}else if (num%10==1) {
    				res="M"+res;
    			}
    		}
    		num=num/10;
    		flag++;
    	}
        return res;
    }
}
