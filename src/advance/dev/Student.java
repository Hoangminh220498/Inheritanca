package advance.dev;

public class Student extends Person {
	float diemToan,diemLy,diemHoa;
	String idStudent;
	String classStu;
	public Student(String name, int age, String numberPhone, float diemToan, float diemLy, float diemHoa,
			String idStudent, String classStu) {
		super(name, age, numberPhone);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.idStudent = idStudent;
		this.classStu = classStu;
	}
		
	public float diemTB() {
		return (diemHoa + diemLy + diemToan) / 3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Age: %d -- Phone: %s -- Diem 3 mon: %f, %f, %f -- MSSV: %s -- Class:%s", name,age,numberPhone,diemToan,diemLy,diemHoa,idStudent,classStu);
	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
