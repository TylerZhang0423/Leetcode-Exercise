//204. ��������
//ͳ������С�ڷǸ����� n ��������������
//ʾ��:
//����: 10
//���: 4
//����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��
package countprimes;
//2.0�汾�ж�����
//��Ҫ˼·�����������ķֲ�������ֻ�ֲ���6�ı��������ң���11��13�ֲ���12���ң�17��19�ֲ���18������
//��ѭ���Ĳ�����1���6
public class Solution {
	public int countPrimes(int n) {
		int count=0;
	    for (int j=2;j<n;j++) {
	    	if (isPrime(j)) {
	    		count++;
	    	}
	    }
	    return count;
	}
	public boolean isPrime(int num) {
		if (num==2||num==3) {
			return true;
		}else if(num%6!=1&&num%6!=5){
			return false;
		}else {
			for (int i=2;i*i<=num;i++) {
				if (num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
}
//1.0�汾�ж�����
//ʱ�临�Ӷ�ΪO(sqrt(n))
//public boolean isPrime(int m) {
//	if (m<2||m==4) {
//		return false;
//	}else if (m==2||m==3) {
//		return true;
//	}else {
//		for (int i=2;i*i<=m;i++) {
//			if (m%i==0) {
//				return false;
//			}
//		}
//	}
//	return true;
//}