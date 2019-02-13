//670. 最大交换
//给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。
//示例 1 :
//输入: 2736
//输出: 7236
//解释: 交换数字2和数字7。
//示例 2 :
//输入: 9973
//输出: 9973
//解释: 不需要交换。
//注意:给定数字的范围是 [0, 108]
package maximumswap;

public class Solution {
    public int maximumSwap(int num) {
        int numLength=1;
        int num1=num;
        int num2=num;
        int tempMax=0;
        int index=-1;
        int m=0;
        //先把数字转成整型数组
        while (num1>=10) {
        	num1=num1/10;
        	numLength++;
        }
        int[] temp=new int[numLength];
        for (int i=numLength-1;i>=0;i--) {
        	temp[i]=num2%10;
        	num2=num2/10;
        }
        //如果这个数字比9小，则可能需要交换，向后寻找是否有比他大的，
        //如果寻找到多个相同的，则选次序靠后的
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
        //将整型数组转回数字
        int sum=0;
        for (int j=numLength-1;j>=0;j--) {
        	sum=(int) (sum+temp[j]*Math.pow(10,numLength-1-j));
        }
        return sum;
    }
}
