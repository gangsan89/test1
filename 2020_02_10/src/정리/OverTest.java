package ����;

import java.util.List;
import java.util.ArrayList;

public class OverTest {

	public static void main(String[] args) {
		AA ref = new AA(); 
		SubAA ref2 = new SubAA(); 
		ref.m1(); //AA Ŭ������ m1  // �긦 �������� static binding ��� �Ѵ� ref.m1() .���� �������� ȣ���ϴ°� ���ε�
		ref2.m1(); //SubAA Ŭ������ m1 // �긦 �������� static binding ��� �Ѵ�.
		
		AA refX = new SubAA(); // ��ĳ����, �Ųٷ� �Ǿ������� �ٿ�ĳ���� 
		refX.m1(); // ���� ���� dynamic binding �̶�� �Ѵ� �����ϴ� �������� �ҷ������°�?
		refX = new SubAASub();
		refX.m1();
		refX = new AA();
		
		refX.m1();
		//ȣ���ϴ� ���嵵 ����, ���۷����� �Ȱ����� ���۷����� �����ϴ� �ְ� �������� ���� �ٸ��ָ� �ҷ����°�
		//�̰� �������̵��, �̰� ������ 
		List refff = new ArrayList();
		refff.add("dasdasd");
		//refff = new List();
	}
}
