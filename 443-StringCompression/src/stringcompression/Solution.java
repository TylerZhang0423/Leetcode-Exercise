//443. ѹ���ַ���
//����һ���ַ���ʹ��ԭ���㷨����ѹ����
//ѹ����ĳ��ȱ���ʼ��С�ڻ����ԭ���鳤�ȡ�
//�����ÿ��Ԫ��Ӧ���ǳ���Ϊ1 ���ַ������� int �������ͣ���
//�����ԭ���޸���������󣬷���������³��ȡ�
//���ף�
//���ܷ��ʹ��O(1) �ռ������⣿
//ʾ�� 1��
//���룺
//["a","a","b","b","c","c","c"]
//�����
//����6�����������ǰ6���ַ�Ӧ���ǣ�["a","2","b","2","c","3"]
//˵����
//"aa"��"a2"�����"bb"��"b2"�����"ccc"��"c3"�����
//ʾ�� 2��
//���룺
//["a"]
//�����
//����1�����������ǰ1���ַ�Ӧ���ǣ�["a"]
//˵����
//û���κ��ַ����������
//ʾ�� 3��
//���룺
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//�����
//����4�����������ǰ4���ַ�Ӧ���ǣ�["a","b","1","2"]��
//˵����
//�����ַ�"a"���ظ������Բ��ᱻѹ����"bbbbbbbbbbbb"����b12�������
//ע��ÿ�������������ж������Լ���λ�á�
//ע�⣺
//�����ַ�����һ��ASCIIֵ��[35, 126]�����ڡ�
//1 <= len(chars) <= 1000��
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
