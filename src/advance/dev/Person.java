package advance.dev;

public abstract class Person {
	String name;
	int age;
	String numberPhone;
	public Person(String name, int age, String numberPhone) {
		super();
		this.name = name;
		this.age = age;
		this.numberPhone = numberPhone;
	}
	
	public abstract String toString();
	public abstract float diemTB();
	public abstract float tinhLuong();

}
