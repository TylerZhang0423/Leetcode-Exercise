//443. 压缩字符串
//给定一组字符，使用原地算法将其压缩。
//压缩后的长度必须始终小于或等于原数组长度。
//数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
//在完成原地修改输入数组后，返回数组的新长度。
//进阶：
//你能否仅使用O(1) 空间解决问题？
//示例 1：
//输入：
//["a","a","b","b","c","c","c"]
//输出：
//返回6，输入数组的前6个字符应该是：["a","2","b","2","c","3"]
//说明：
//"aa"被"a2"替代。"bb"被"b2"替代。"ccc"被"c3"替代。
//示例 2：
//输入：
//["a"]
//输出：
//返回1，输入数组的前1个字符应该是：["a"]
//说明：
//没有任何字符串被替代。
//示例 3：
//输入：
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//输出：
//返回4，输入数组的前4个字符应该是：["a","b","1","2"]。
//说明：
//由于字符"a"不重复，所以不会被压缩。"bbbbbbbbbbbb"被“b12”替代。
//注意每个数字在数组中都有它自己的位置。
//注意：
//所有字符都有一个ASCII值在[35, 126]区间内。
//1 <= len(chars) <= 1000。
package stringcompression;
import java.util.*;
public class Solution {
    public int compress(char[] chars) {
        char temp=chars[0];
        int flag=1;
        int count=0;
        int result=chars.length;
        for (int i=1;i<chars.length;i++) {
        	if (chars[i]==temp) {
        		flag++;
        		result--;
        		continue;
        	}else {
        		if (flag>1&&flag<=9) {
        			result++;
            		chars[count]=temp;
            		chars[count+1]=(char)(flag+48);
            		count=count+2;
        			flag=1;
        		}else if (flag>9) {
        			chars[count]=temp;
        			Stack<Integer> stack=new Stack<Integer>();
        			while (flag>0) {
        				stack.add(flag%10);
        				flag=flag/10;
        			}
        			while (!stack.isEmpty()) {
        				count++;
        				chars[count]=(char)(stack.pop()+48);
        				result++;
        			}
        			count++;
        			flag=1;
        		}else {
        			chars[count]=temp;
        			count++;
        			flag=1;
        		}
        		temp=chars[i];
        	}
        }
        if (flag>1&&flag<=9) {
        	result++;
    		chars[count]=temp;
    		chars[count+1]=(char)(flag+48);
        }else if (flag>9){
			chars[count]=temp;
			Stack<Integer> stack=new Stack<Integer>();
			while (flag>0) {
				stack.add(flag%10);
				flag=flag/10;
			}
			while (!stack.isEmpty()) {
				count++;
				chars[count]=(char)(stack.pop()+48);
				result++;
			} 
        }else {
        	chars[count]=temp;
        }
        return result;
    }
}
