package ����;
class SubAA2 extends AA2{
	/*
	 * @Override //�̷��� �ؼ� �������� �����ε�, �ƴϸ� �������̵� �ȰŴ� void m1() {//#1 6��°��� �ϰ� ������ #1����
	 * ���� ������ �ִ°Ŵ� System.out.println("SubAA�� m1()"); }
	 */
		//@Override Overload �̰� ����Ŭ������ �������� �������� �ʾƼ� �������� �����ε� �ȰŴ� 
		void m1(double a) {//#6
			
		}
		
	/*
	 * void m1(int[] a) {//#7 int sum=0; for( int data : a ) { sum += data; } for(
	 * int data : a ) { System.out.println(data+", "); } System.out.println(sum); }
	 */
		void out() {
			m1(); //this.m1(); �����ͺ��� �������� �������� m1(){}�� �θ��� �ȴ�
			super.m1(); // ����Ŭ������ m1(){} �� �������� ������ �̷��� ���
		}
	}