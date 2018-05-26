package chapter9;

public class TheSameName {
	private int x =0;
	private class Inner {
		private int x = 9;
		public void doit(int x) {
			System.out.println(x++);
			System.out.println(this.x++);
			System.out.println(TheSameName.this.x++);
		}
	}
	public static void main(String[] args) {
		TheSameName t = new TheSameName();
		TheSameName.Inner i =  t.new Inner();
		i.doit(1);
	}

}
