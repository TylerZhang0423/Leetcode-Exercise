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
//��Ҫ˼·���ж��������жϻ������ĺ���ֱ��ʹ��֮ǰ�Ľӿ�
//��������Ż���ż��λ�Ļ���������������λ֮����ż��λ֮����ȣ����һ���ܱ�11���������ֱ����������ż��λ��
public class Solution {
    public int primePalindrome(int N) {
    	if (N<=2) {
    		return 2;
    	}
    	if (N==3) {
    		return 3;
    	}
    	if (N>11&&getLength(N)%2==0){
    		N=(int) (Math.pow(10, getLength(N))+1);
    	}
    	if (N%6==2) {
    		N=N+3;
    	}else if (N%6==3) {
    		N=N+2;
    	}else if (N%6==4) {
    		N=N+1;
    	}else if (N%6==0) {
    		N=N+1;
    	}
        while (true) {
        	if (N>11&&getLength(N)%2==0){
        		N=(int) (Math.pow(10, getLength(N))+1);
        	}
            if (isPrime(N)&&isPalindrome(N)) {
                return N;
            }else {
            	if (N%6==1) {
            		N=N+4;
            	}else if (N%6==5) {
            		N=N+2;
            	}        		
            }
        }
    }
	public boolean isPrime(int num) {
		for (int i=5;i*i<=num;i=i+6) {
			if (num%i==0||num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
    public boolean isPalindrome(int x) {
    	int numLength=getLength(x);
    	int[] numarray=new int[numLength];
    	for (int k=numLength-1;k>=0;k--) {
    		numarray[k]=x%10;
    		x=x/10;
    	}
        int i=0;
        int j=numLength-1;
        while (i<j) {
        	if (numarray[i]!=numarray[j]) {
        		return false;
        	}
        	i++;
        	j--;
        }
        return true;
    }
    public int getLength(int m) {
    	int length=0;
    	while (m>0) {
    		length++;
    		m=m/10;
    	}
    	return length;
    }
}
