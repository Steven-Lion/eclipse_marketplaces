package chapter8;

public class Employee  implements Comparable<Employee>{
	private int age ;
	private String name  ;
	private int id ;

	public Employee(int age, String name, int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Employee arg0) {
		if(this.age >arg0.age) {
			return 1;
		}else if(this.age <arg0.age){
			return -1;
		}
		return 0;
	}

}
