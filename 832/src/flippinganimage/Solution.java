package flippinganimage;

public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
	    int [][]B=new int[A.length][A.length];
	    for (int Arow=0;Arow<A.length;Arow++) {
	    	for (int Acol=0;Acol<A[Arow].length;Acol++) {
	    		B[Arow][Acol]=A[Arow][Acol];
	    	}
	    }
	    for (int Arow=0;Arow<A.length;Arow++) {
	    	for (int Acol=0;Acol<A[Arow].length;Acol++) {
	    		A[Arow][Acol]=B[Arow][A[Arow].length-Acol-1];
	    	}
	    }
	    for (int Arow=0;Arow<A.length;Arow++) {
	    	for (int Acol=0;Acol<A[Arow].length;Acol++) {
	    		A[Arow][Acol]=1-A[Arow][Acol];
	    		if (A[Arow][Acol]<0)
	    			A[Arow][Acol]=-A[Arow][Acol];
	    	}
	    }
	    	return A;
	}
}
