//120. 三角形最小路径和
//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
//例如，给定三角形：
//[
//[2],
//[3,4],
//[6,5,7],
//[4,1,8,3]
//]
//自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
//说明：
//如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
package triangle;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);list3.add(5);list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);list4.add(1);list4.add(8);list4.add(3);
        list.add(list1);list.add(list2);list.add(list3);list.add(list4);
        Solution Test=new Solution();
        System.out.println(Test.minimumTotal(list));
    }
}
