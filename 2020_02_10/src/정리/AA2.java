package ����;
public class AA2 { // ���� �����ε� �ȰŴ�
	/*
	 * void m1() {//#1 System.out.println("����Ŭ������ m1"); }
	 */
		public void m1(int...a) { //varargs = variable Arguments�� ���� �����Ű����� ��� �ϴ°ǵ� 
								//Overloading�� ���̱� ���ؼ� ���Դ� 
								//�ϴ����� ������ �̷��� ��´�, �ϴ����� �ٸ��� �̷��� ������ �ȵȴ�
			System.out.println("int...a");
			for(int d : a) {
				System.out.println(d);
			}
		}
	/*
	 * void m1(int a) {//#2 System.out.println(a); }
	 * 
	 * void m1(int a, int b) {//#3 System.out.println(a+b); }
	 * 
	 * void m1(int a, int b, int c) {//#4 System.out.println(a+b+c); }
	 */

		public void m1(String a) {//#5

		}

	}