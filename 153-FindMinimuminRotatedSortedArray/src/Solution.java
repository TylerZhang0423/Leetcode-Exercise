/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-05-08 22:08
 * 153. 寻找旋转排序数组中的最小值
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 请找出其中最小的元素。
 *
 * 你可以假设数组中不存在重复元素。
 *
 * 示例 1:
 *
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 */
public class Solution {
    public int findMin(int[] numbers) {
        int front = 0;
        int end = numbers.length-1;
        int mid = 0;
        while (end - front>1) {
            mid = (front + end) / 2;
            if (numbers[front] > numbers[mid]) {
                end = mid;
            }else if (numbers[mid] > numbers[end]) {
                front = mid;
            }else {
                return numbers[front];
            }
        }
        return Integer.min(numbers[front],numbers[end]);
    }
}
