package ����;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class OverTest_Param2 {
	static public void callAA(AA ref) {
		System.out.println("callAA(AA ref) ");
		ref.m1();
	}


	public static void main(String[] args) {
		
		callAA( new SubAA() );
		System.out.println("/////////");
		
		callAA( new BBAA() );
		
		System.out.println("//////////////");
		System.out.println(new Date());
		System.out.println(new BBAA());
		System.err.printf("%d",10);
		
		AA aaa = new SubAA(); //��ĳ����
		AA aa22 = new BBAA();
		SubAA rrr = (SubAA)aaa;
			rrr = (SubAA)aa22; //SubAA�� BBAA�� ������ ���ϰ��谡 �ƴϱ� ������ ���� ������ ����������
			
		int qq = 10;
		Integer ii = new Integer(qq);
		
		ii = qq;
		qq = new Integer(99);
		// �����ڷ��� = ����Ŭ���� wrapper class �� ���۷��� Ŭ������ �ٲ���
	}
}
