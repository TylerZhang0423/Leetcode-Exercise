package sortarraybyparity;
//905-按奇偶排序数组
//给定一个非负整数数组A，返回一个由A的所有偶数元素组成的数组，后面跟A的所有奇数元素。
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray= {1,2,3,4,5};
		Solution Test=new Solution();
		int[] result=Test.sortArrayByParity(testArray);
		for (int count2=0;count2<result.length;count2++) {
			System.out.println(result[count2]);
		}
	}

}
