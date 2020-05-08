/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-05-07 11:25
 * 面试题11. 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 * 示例 1：
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 * 输入：[2,2,2,0,1]
 * 输出：0
 */
public class Solution {
    public int minArray(int[] numbers) {
        int front = 0;
        int end = numbers.length-1;
        int mid = 0;
        while (end - front>1) {
            mid = (front + end) / 2;
            if (numbers[front] > numbers[mid]) {
                end = mid;
            }else if (numbers[mid] > numbers[end]) {
                front = mid;
            }else if (numbers[mid] == numbers[end] || numbers[front] == numbers[mid]) {
                while (numbers[end] == numbers[mid] && end != mid) {
                    end--;
                }
                while (numbers[front] == numbers[mid] && front != mid) {
                    front++;
                }
            }else {
                return numbers[front];
            }
        }
        return Integer.min(numbers[front],numbers[end]);
    }
}
