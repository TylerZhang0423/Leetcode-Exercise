//848. 字母移位
//有一个由小写字母组成的字符串 S，和一个整数数组 shifts。
//我们将字母表中的下一个字母称为原字母的 移位（由于字母表是环绕的， 'z' 将会变成 'a'）。
//例如·，shift('a') = 'b'， shift('t') = 'u',， 以及 shift('z') = 'a'。
//对于每个 shifts[i] = x ， 我们会将 S 中的前 i+1 个字母移位 x 次。
//返回将所有这些移位都应用到 S 后最终得到的字符串。
//示例：
//输入：S = "abc", shifts = [3,5,9]
//输出："rpl"
//解释： 
//我们以 "abc" 开始。
//将 S 中的第 1 个字母移位 3 次后，我们得到 "dbc"。
//再将 S 中的前 2 个字母移位 5 次后，我们得到 "igc"。
//最后将 S 中的这 3 个字母移位 9 次后，我们得到答案 "rpl"。
//提示：
//1 <= S.length = shifts.length <= 20000
//0 <= shifts[i] <= 10 ^ 9
package shiftingletters;

public class Solution {
    public String shiftingLetters(String S, int[] shifts) {
        for (int i=0;i<shifts.length;i++) {
        	S=shift(S.substring(0, i+1),shifts[i])+S.substring(i, S.length()-1);
        }
        return S;
    }

	private String shift(String subString, int i) {
		char[] subStringCharArr=subString.toCharArray();
		for (int j=0;j<subStringCharArr.length;j++) {
			subStringCharArr[j]=(char)(subStringCharArr[j]+i);
		}
		subString=String.valueOf(subStringCharArr);
		return subString;
	}
}
