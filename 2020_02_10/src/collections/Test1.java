package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		String a="kim gangsan";
		String b="kim malja";
		String c = "bab malja";
		
		String[] strs = {"kim gangsan", "kim malja", "bab malja"};
		String[] ss= {a,b,c};
		String[] xx= new String[3];
		
		xx[0]= "kim gangsan";
		xx[1]= "kim malja";
		xx[2]= "bab malja";
		xx[0]= a;
		xx[1]= b;
		xx[2]= c;
		System.out.println("removeAfters.clone() ���� "+strs.length);
		//strs[1] =""; //�� 1������ �����ؼ� �迭�� ���̸� ���߷���
		String[] removeAfters = new String[strs.length -1];
		removeAfters[0] = strs[0];
		removeAfters[1] = strs[2];
		strs=null;
		strs=removeAfters.clone();
		System.out.println("removeAfters.clone() ���� "+strs.length);
		
		//List<Date> strings = new ArrayList<Date>();
		List<String> strings = new ArrayList<String>(); 
		strings.add("kim gangsan");
		strings.add("kim malja");
		strings.add("bab malja");
		strings.add("sung gangsan");
		strings.add("lee gangsan");
		strings.add("baam gangsan");
		
		System.out.println(strings.size() ); // ������ ��Ʈ��Ŭ����, �迭�� ���´�
		
		for( String str : strings ) {
			System.out.println(str);
		}
		System.out.println("//////////");
		for( int i=0; i < strings.size(); i++) {
			System.out.println(strings.get(i)); //��ü�� add�� ���� ������ �ƴѰ� ������ �˰��־��
		}
		strings.remove(2); //�ϳ��� ����� �������
		System.out.println(strings.size() );
		for( String str : strings ) {
			System.out.println(str);
		}
		
		
	}
}
