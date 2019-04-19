//299. 猜数字游戏
//你正在和你的朋友玩 猜数字（Bulls and Cows）游戏：你写下一个数字让你的朋友猜。
//每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为“Bulls”, 公牛），
//有多少位数字猜对了但是位置不对（称为“Cows”, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。
//请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 A 表示公牛，用 B 表示奶牛。
//请注意秘密数字和朋友的猜测数都可能含有重复数字。
//示例 1:
//输入: secret = "1807", guess = "7810"
//输出: "1A3B"
//解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
//示例 2:
//输入: secret = "1123", guess = "0111"
//输出: "1A1B"
//解释: 朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。
//说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。
package bullsandcows;
import java.util.*;
public class Solution {
	public String getHint(String secret, String guess) {
		Map<Character, List<Integer>> map=new HashMap<Character, List<Integer>>();
		int countA=0;
		int countB=0;
		int flag[]=new int[secret.length()];
		for (int i=0;i<secret.length();i++) {
			List<Integer> temp=new ArrayList<Integer>();
			if (map.containsKey(secret.charAt(i))) {
				temp=map.get(secret.charAt(i));
				temp.add(i);
				map.put(secret.charAt(i), temp);
			}else {
				temp.add(i);
				map.put(secret.charAt(i), temp);
			}
		}
		for (int i=0;i<guess.length();i++) {
			List<Integer> temp2=new ArrayList<Integer>();
			if (map.containsKey(guess.charAt(i))) {
				for (int j=0;j<map.get(guess.charAt(i)).size();j++) {
					if (map.get(guess.charAt(i)).get(j)==i) {
						temp2=map.get(guess.charAt(i));
						temp2.remove(j);
						map.put(guess.charAt(i), temp2);
						countA++;
						flag[i]=1;
					}
				}
			}
		}
		for (int i=0;i<guess.length();i++) {
			List<Integer> temp3=new ArrayList<Integer>();
			if (flag[i]==0&&map.containsKey(guess.charAt(i))&&map.get(guess.charAt(i)).size()>0) {
				countB++;
				temp3=map.get(guess.charAt(i));
				temp3.remove(temp3.size()-1);
				map.put(guess.charAt(i), temp3);
			}
		}
		return countA+"A"+countB+"B";
	}
}
	
	
	
	
	
	

//public class Solution {
//    public String getHint(String secret, String guess) {
//        Map<Integer, Integer> map1=new HashMap<Integer, Integer>();
//        int countA=0;
//        int countB=0;
//        for (int i=0;i<secret.length();i++) {
//        	map1.put((int)secret.charAt(i)+i, i);
//        	if (map1.containsKey((int)guess.charAt(i)+i)) {
//        		countA++;
//        	}
//        }
//        Map<Character, Integer> map2=new HashMap<Character, Integer>();
//        for (int i=0;i<secret.length();i++) {
//        	if (secret.charAt(i)==guess.charAt(i)) {
//        		continue;
//        	}else {
//        		if (map2.containsKey(secret.charAt(i))) {
//        			map2.put(secret.charAt(i), map2.get(secret.charAt(i))+1);
//        		}else {
//        			map2.put(secret.charAt(i), 1);
//        		}
//        	}
//        }
//        for (int i=0;i<secret.length();i++) {
//        	if (secret.charAt(i)!=guess.charAt(i)) {
//        		if (map2.containsKey(guess.charAt(i))) {
//        			countB++;
//        			map2.put(secret.charAt(i), map2.get(secret.charAt(i))-1);
//        		}
//        	}
//        		
//        }
//        return countA+"A"+countB+"B";
//    }
//}
