package week3day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student name: "+name);
		System.out.println("Student id: "+id);
	}
	public void getStudentInfo( String email,String phoneno) {
		System.out.println("Student phone : "+phoneno);
		System.out.println("Student email: "+email);
	}
	public static void main(String[] args) {
		Students A = new Students();
		A.getStudentInfo(20);
		A.getStudentInfo(20, "dhanasekaran");
		A.getStudentInfo("dhana@gmail.com", "0123456789");

	}

}
