package romantointeger;

public class Solution {
	public int romanToInt(String s) {
		int sum=0;
        for (int count=0;count<s.length();count++){
			if(s.charAt(count)=='I')
				sum=sum+1;
			else if(s.charAt(count)=='V')
				sum=sum+5;
			else if(s.charAt(count)=='X')
				sum=sum+10;
			else if(s.charAt(count)=='L')
				sum=sum+50;
			else if(s.charAt(count)=='C')
				sum=sum+100;
			else if(s.charAt(count)=='D')
				sum=sum+500;
			else
				sum=sum+1000;
		}
       	for (int count1=0;count1<s.length()-1;count1++){
			if(s.charAt(count1)=='I'&&s.charAt(count1+1)=='V')
                sum=sum-2;
			if(s.charAt(count1)=='I'&&s.charAt(count1+1)=='X')
				sum=sum-2;
			if(s.charAt(count1)=='X'&&s.charAt(count1+1)=='L')
				sum=sum-20;
			if(s.charAt(count1)=='X'&&s.charAt(count1+1)=='C')
				sum=sum-20;
			if(s.charAt(count1)=='C'&&s.charAt(count1+1)=='D')
				sum=sum-200;
			if(s.charAt(count1)=='C'&&s.charAt(count1+1)=='M')
				sum=sum-200;
		}
        return sum;
	}
}
