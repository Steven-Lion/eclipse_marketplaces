package chapter8;

public class Cire implements ICalculate {

	public static void main(String[] args) {
		Cire cire = new Cire();

		System.out.println(cire.getArea(8.0f));
		System.out.println(cire.getCircumference(8.0f));

	}

	@Override
	public float getArea(float r) {

		float area = PI * r * r ;
		return area;

	}

	@Override
	public float getCircumference(float r) {
		float circumference = 2 * PI * r;
		return circumference;
	}

}
