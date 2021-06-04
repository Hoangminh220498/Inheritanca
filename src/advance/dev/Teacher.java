package advance.dev;

public class Teacher extends Person {
	String idTeacher;
	float heSoLuong;
	public Teacher(String name, int age, String numberPhone, String idTeacher, float heSoLuong) {
		super(name, age, numberPhone);
		this.idTeacher = idTeacher;
		this.heSoLuong = heSoLuong;
	}
	
	public float tinhLuong() {
		return heSoLuong * 1200000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Age: %d -- SDT: %s -- MSGV: %s, HSL: %f", name,age,numberPhone,idTeacher,heSoLuong);
	}

	@Override
	public float diemTB() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
