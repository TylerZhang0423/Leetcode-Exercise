//299. ��������Ϸ
//�����ں���������� �����֣�Bulls and Cows����Ϸ����д��һ��������������Ѳ¡�
//ÿ�����²�������һ����ʾ���������ж���λ���ֺ�ȷ��λ�ö��¶��ˣ���Ϊ��Bulls��, ��ţ����
//�ж���λ���ֲ¶��˵���λ�ò��ԣ���Ϊ��Cows��, ��ţ����������ѽ��������ʾ�����£�ֱ���³��������֡�
//��д��һ�������������ֺ����ѵĲ²���������ʾ�ĺ������� A ��ʾ��ţ���� B ��ʾ��ţ��
//��ע���������ֺ����ѵĲ²��������ܺ����ظ����֡�
//ʾ�� 1:
//����: secret = "1807", guess = "7810"
//���: "1A3B"
//����: 1 ��ţ�� 3 ��ţ����ţ�� 8����ţ�� 0, 1 �� 7��
//ʾ�� 2:
//����: secret = "1123", guess = "0111"
//���: "1A1B"
//����: ���Ѳ²����еĵ�һ�� 1 �ǹ�ţ���ڶ���������� 1 �ɱ���Ϊ��ţ��
//˵��: ����Լ����������ֺ����ѵĲ²�����ֻ�������֣��������ǵĳ�����Զ��ȡ�
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
