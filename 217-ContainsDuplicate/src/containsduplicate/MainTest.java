package containsduplicate;
//给定一个整数数组，判断是否存在重复元素。
//如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
public class MainTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=new Solution();
		int[] TestArray= {1,3,2,1};
		System.out.println(Test.containsDuplicate(TestArray));
		for (int k=0;k<TestArray.length;k++)
			System.out.println(TestArray[k]+" ");
	}
}