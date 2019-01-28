//27. 移除元素
//给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
//不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
package removeelement;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Test=null;
		Test=new Solution();
		int[] TestArray= {0,1,2,2,3,0,4,2};
	//	int[] TestArray= {3,2,2,3};
		System.out.println(Test.removeElement(TestArray, 2));
		for (int k=0;k<TestArray.length;k++)
			System.out.print(TestArray[k]+" ");
	}

}
