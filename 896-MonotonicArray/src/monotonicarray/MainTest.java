//896. 单调数列
//如果数组是单调递增或单调递减的，那么它是单调的。
//如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 
//如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
//当给定的数组 A 是单调数组时返回 true，否则返回 false。
package monotonicarray;

public class MainTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] TestArr= {3,2,1};
		Solution Test=new Solution();
		System.out.println(Test.isMonotonic(TestArr));
	}

}
