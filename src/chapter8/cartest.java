package chapter8;

public class cartest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setName("car1");
		car1.setSpeed(22.0f);
		System.out.println(car1.toString());

		GPSCar gpsCar = new GPSCar();
		gpsCar.setName("car2");
		gpsCar.setSpeed(22.0f);
		System.out.println(gpsCar.toString());
		
		
	}

}
