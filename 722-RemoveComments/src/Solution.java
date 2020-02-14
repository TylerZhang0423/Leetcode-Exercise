import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tyler Zhang
 * @date ：Created in 2020-02-13 09:57
 * 722. 删除注释
 * source的长度范围为[1, 100].
 * source[i]的长度范围为[0, 80].
 * 每个块注释都会被闭合。
 * 给定的源码中不会有单引号、双引号或其他控制字符。
 */
public class Solution {
    public List<String> removeComments(String[] source) {
        String temp = "";
        for (String s : source) {
            temp = temp + s + "\n";
        }

        for (int i=0; i<temp.length()-1; i++) {
            if (temp.charAt(i) == '/') {
                if (temp.charAt(i+1) == '/') {
                    for (int j=i+2; j<temp.length(); j++) {
                        if (temp.charAt(j) == '\n') {
                            temp = temp.substring(0,i) + temp.substring(j);
                            break;
                        }
                    }
                }else if (temp.charAt(i+1) == '*') {
                    for (int j=i+2; j<temp.length(); j++) {
                        if (temp.charAt(j) == '*' && temp.charAt(j+1) == '/') {
                            temp = temp.substring(0, i) + temp.substring(j+2);
                            i--;
                            break;
                        }
                    }
                }
            }
        }
        String[] stringArr = temp.split("\n");
        List<String> result = new ArrayList<>();
        for (String s : stringArr) {
            if (!s.equals("")) {
                result.add(s);
            }
        }
        return result;
    }
}
