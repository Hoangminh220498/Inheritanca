package advance.dev;

import java.util.Scanner;

public class MainApp {
		static Person[] input() {
			Person[] stu = new Person[10];
			for (int i = 0; i < 4; i++) {
				System.out.printf("Nhap Gv thu %d\n",i);
				Scanner sc = new Scanner(System.in);
				System.out.println("Ten: ");
				String name = sc.next();
				System.out.println("Tuoi:");
				int age = sc.nextInt();
				System.out.println("SDT: ");
				String  numberPhone = sc.next();
				System.out.println("Ma so GV: ");
				String idTeacher = sc.next();
				System.out.println("he so luong = ");
				float heSoLuong = sc.nextFloat();
				Teacher tea = new Teacher(name, age, numberPhone, idTeacher, heSoLuong);
				stu[i] = tea;
			}
			for (int i = 4; i < 10; i++) {
				System.out.printf("Nhap SV thu %d\n",i);
				Scanner sc = new Scanner(System.in);
				System.out.println("Ten: ");
				String name = sc.next();
				System.out.println("Tuoi:");
				int age = sc.nextInt();
				System.out.println("SDT: ");
				String numberPhone = sc.next();
				System.out.println("Diem 3 mon toan, ly,hoa");
				float diemToan = sc.nextFloat();
				float diemLy = sc.nextFloat();
				float diemHoa = sc.nextFloat();
				System.out.println("nhap MSSV va lop cua SV:");
				String idStudent = sc.next();
				String classStu = sc.next();
				Student student = new Student(name, age, numberPhone, diemToan, diemLy, diemHoa, idStudent, classStu);
				stu[i] = student;
			}
			return stu;
		}
		static void print(Person[] per) {
			for (int i = 0; i < 4; i++) {
				System.out.printf("GV %d: ",i);
				System.out.println(per[i].toString());
			}
			for (int i = 4; i < 10; i++) {
				System.out.printf("SV %d: ",i);
				System.out.println(per[i].toString());		
			}
		}
		static float findTeacher(Person[] per) {
			float prevMax = per[0].tinhLuong();
			for (int i = 0; i < 4; i++) {
				if(per[i].tinhLuong() > prevMax) {
					prevMax = per[i].tinhLuong();
				}
			}
			return prevMax;
		}
		static float findStudent(Person[] per) {
			float preMax = per[4].diemTB();
			for (int i = 4; i < 10; i++) {
				if (per[i].diemTB() > preMax) {
					preMax = per[i].diemTB();
				}
			}
			return preMax;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person[] persons = new Person[10];
			persons = input();
			print(persons);
			float maxGV = findTeacher(persons);
			float maxStu = findStudent(persons);
			System.out.printf("Luong cao nhat la: %f, Diem TB cao nhat la: %f",maxGV,maxStu);
		}


	}

