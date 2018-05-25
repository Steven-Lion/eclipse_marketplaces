package chapter8;

public class Car {
	private float speed;
	public float getSpeed() {
		return speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	private String name;
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("car name :"+ name);
		sb.append("car Speed :"+speed);
		return sb.toString();
	}

}
