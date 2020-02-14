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
public class Main {
    public static void main(String[] args) {
        String[] code = {"e/*/eabeea/*///*c*////*dc*//bcadcde/*/acbe//*d/*/*//ae//*dc//*cc//*//*eaebb*//"};
        Solution solution = new Solution();
        List<String> result = solution.removeComments(code);
        for (String s : result) {
            System.out.println(s);
        }

    }
}
