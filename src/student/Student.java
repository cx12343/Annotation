package student;
@Table(table="tb_student")
public class Student {
	@Suxing(name="id",type="int",len=10)
	private int id;
	@Suxing(name="sname",type="varchar",len=10)
	private String studentName;
	@Suxing(name="age",type="int",len=3)
	private int age;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
