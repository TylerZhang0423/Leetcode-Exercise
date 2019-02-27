//866. ��������
//������ڻ���� N ����С����������
//�ع�һ�£����һ�������� 1����������ֻ�� 1 ����������ô�������������
//���磬2��3��5��7��11 �Լ� 13 ��������
//�ع�һ�£����һ�����������Ҷ�������������һ���ģ���ô������ǻ�������
//���磬12321 �ǻ�������
//ʾ�� 1��
//���룺6
//�����7
//ʾ�� 2��
//���룺8
//�����11
//ʾ�� 3��
//���룺13
//�����101
//��ʾ��
//1 <= N <= 10^8
//�𰸿϶����ڣ���С�� 2 * 10^8��
package primepalindrome;

public class Solution {
    public int primePalindrome(int N) {
        while (true) {
            if (isPrime(N)&&isPalindrome(N)) {
                return N;
            }else {
            	N++;
            }
        }
    }
	public boolean isPrime(int num) {
		if (num==2||num==3) {
			return true;
		}else if((num%6!=1&&num%6!=5)||num==1||num%2==0||num%3==0){
			return false;
		}else {
			for (int i=5;i*i<=num;i=i+6) {
				if (num%i==0||num%(i+2)==0) {
					return false;
				}
			}
		}
		return true;
	}
    public boolean isPalindrome(int x) {
    	int length=0;
    	int temp=x;
    	while (temp>0) {
    		length++;
    		temp=temp/10;
    	}
    	int[] numarray=new int[length];
    	for (int k=length-1;k>=0;k--) {
    		numarray[k]=x%10;
    		x=x/10;
    	}
        int i=0;
        int j=length-1;
        while (i<j) {
        	if (numarray[i]!=numarray[j]) {
        		return false;
        	}
        	i++;
        	j--;
        }
        return true;
    }
}
