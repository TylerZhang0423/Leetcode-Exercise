//187. �ظ���DNA����
//���� DNA ��һϵ����дΪ A��C��G �� T �ĺ�������ɣ����磺��ACGAATTCCG����
//���о� DNA ʱ��ʶ�� DNA �е��ظ�������ʱ����о��ǳ��а�����
//��дһ������������ DNA ���������г��ֳ���һ�ε�10����ĸ�������У��Ӵ�����
//ʾ��:
//����: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//���: ["AAAAACCCCC", "CCCCCAAAAA"]
package repeatedDNAsequences;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		String s="AAAAAAAAAAAA";
		Solution Test=new Solution();
		for (int i=0;i<Test.findRepeatedDnaSequences(s).size();i++) {
			System.out.println(Test.findRepeatedDnaSequences(s).get(i));
		}
	}
}
